package web.servlet;

import service.ManagerService;
import service.SalesmanService;
import service.impl.ManagerServiceImpl;
import service.impl.SalesmanServiceImpl;
import util.Salesman;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login/*")
public class LoginServlet extends BaseServlet{

    public void isLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ManagerService managerService = new ManagerServiceImpl();
        SalesmanService salesmanService = new SalesmanServiceImpl();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        System.out.println(username);
        System.out.println(password);
//        System.out.println("vjhchfxghgjh,gk");

        System.out.println("type="+type);
        int login;
        if("1".equals(type)){
            System.out.println("类型对了");
            login = managerService.mana_login(username,password);
            System.out.println("login="+login);

            writeValue(login == 1 ? "index_manager.html" : "error",resp);
        }else {
            login = salesmanService.sale_login(username,password);
//            if(login == 1){
////                登陆成功
//                writeValue("index_manager.html",resp);
//            }else {
//                writeValue("error",resp);
//            }
            System.out.println("login="+login);

            writeValue(login == 1 ? "index_sale.html" : "error",resp);
        }
    }
}

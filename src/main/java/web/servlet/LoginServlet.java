package web.servlet;

import service.ManagerService;
import service.impl.ManagerServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login/*")
public class LoginServlet extends BaseServlet{



    public void isLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ManagerService managerService = new ManagerServiceImpl();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        System.out.println(username);
        System.out.println(password);
//        System.out.println("vjhchfxghgjh,gk");

        int login=0;
        if(type.equals("1")){
            System.out.println("类型对了");
            login = managerService.mana_login(username,password);
            System.out.println("login="+login);
            if(login == 1){
//                登陆成功
                writeValue("index_manager.html",resp);
            }
        }
    }
}

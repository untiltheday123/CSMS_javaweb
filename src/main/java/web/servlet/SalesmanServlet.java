package web.servlet;

import service.SalesmanService;
import service.impl.SalesmanServiceImpl;
import util.Salesman;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Salesman/*")
public class SalesmanServlet extends BaseServlet{

    SalesmanService salesmanService = new SalesmanServiceImpl();

    public void querySalesman(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Salesman> allSalesman = salesmanService.querySalesman();
//        for (Salesman salesman: allSalesman) {
//            System.out.println(salesman);
//        }
        writeValue(allSalesman,resp);
    }
}

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

    public void querySalesmanByPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String start_ = req.getParameter("start");
        System.out.println(start_);
        int start = Integer.parseInt(start_);
        List<Salesman> allSalesman = salesmanService.querySalesmanByPage(start);
        for (Salesman salesman: allSalesman) {
            System.out.println(salesman);
        }
        writeValue(allSalesman,resp);
    }

    public void querySalesman(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("SalesmanServlet.querySalesman");
        int total = salesmanService.querySalesman();
        System.out.println("total:"+total);
        writeValue(total,resp);
    }
}

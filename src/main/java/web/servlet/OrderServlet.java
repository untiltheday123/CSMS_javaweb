package web.servlet;


import service.OrderService;
import service.impl.OrderServiceImpl;
import util.OrderBySalesman;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Order/*")
public class OrderServlet extends BaseServlet{


    public void queryOrderBySalesman(HttpServletRequest request, HttpServletResponse response) throws IOException {

        OrderService orderService = new OrderServiceImpl();

        System.out.println("1111111111111111111");
        String sale_id = request.getParameter("sale_id");
        System.out.println("sale_id="+sale_id);
        List<OrderBySalesman> orderBySalesmen = orderService.queryOrderSalesman(sale_id);
        writeValue(orderBySalesmen,response);
    }

}

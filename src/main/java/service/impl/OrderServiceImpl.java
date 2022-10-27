package service.impl;

import dao.OrderDao;
import dao.impl.OrderDaoImpl;
import service.OrderService;
import util.OrderBySalesman;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoImpl();

    @Override
    public List<OrderBySalesman> queryOrderSalesman(String sale_id) {
        return orderDao.queryOrderBySalesman(sale_id);
    }
}

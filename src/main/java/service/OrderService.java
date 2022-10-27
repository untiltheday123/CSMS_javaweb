package service;

import util.OrderBySalesman;

import java.util.List;

public interface OrderService {
    List<OrderBySalesman> queryOrderSalesman(String sale_id);
}

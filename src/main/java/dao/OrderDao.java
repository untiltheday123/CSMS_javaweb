package dao;

import util.OrderBySalesman;

import java.util.List;

public interface OrderDao {
    List<OrderBySalesman> queryOrderBySalesman(String sale_id);
}

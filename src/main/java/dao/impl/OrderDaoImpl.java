package dao.impl;

import dao.OrderDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;
import util.OrderBySalesman;

import java.util.List;

public class OrderDaoImpl implements OrderDao {

    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    String sql;

    @Override
    public List<OrderBySalesman> queryOrderBySalesman(String sale_id) {
        sql = "select * from orders where sale_id = ?";

        List<OrderBySalesman> sale_man = template.query(sql, new BeanPropertyRowMapper<>(OrderBySalesman.class),sale_id);
        for (OrderBySalesman order : sale_man) {
            System.out.println("order="+order);
        }
        return template.query(sql, new BeanPropertyRowMapper<>(OrderBySalesman.class),sale_id);
    }
}

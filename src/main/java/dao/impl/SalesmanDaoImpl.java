package dao.impl;

import dao.SalesmanDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;
import util.Salesman;

import java.util.List;

public class SalesmanDaoImpl implements SalesmanDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    String sql = null;

    @Override
    public int selectUserByUsernameAndUserPwd(String username, String userpwd){
        sql="select count(*) from salesman where sale_username = ? and sale_password = ?";

        return template.queryForObject(sql,Integer.class,username,userpwd);
    }

    @Override
    public int querySalesman() {
        System.out.println("SalesmanDaoImpl.querySalesman");
//        List<Salesman salesman = null;
        sql = "select count(*) from salesman";

//        List<Salesman> allSalesman = template.query(sql, new BeanPropertyRowMapper<>(Salesman.class),start);
//        for (Salesman salesman: allSalesman) {
//            System.out.println(salesman);
//        }
        System.out.println("看看"+template.queryForObject(sql,Integer.class));
        return template.queryForObject(sql,Integer.class);
    }

    @Override
    public List<Salesman> querySalesmanByPage(int start) {
//        List<Salesman salesman = null;
        sql = "select * from salesman limit ?,10";

//        List<Salesman> allSalesman = template.query(sql, new BeanPropertyRowMapper<>(Salesman.class),start);
//        for (Salesman salesman: allSalesman) {
//            System.out.println(salesman);
//        }
        return template.query(sql, new BeanPropertyRowMapper<>(Salesman.class),start);
    }
}

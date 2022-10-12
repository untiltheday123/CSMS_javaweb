package dao.impl;

import dao.ManagerDao;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class ManagerDaoImpl implements ManagerDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    public int selectUserByUsernameAndUserPwd(String username, String userpwd){
        String sql="select count(*) from manager where mana_username = ? and mana_password = ?";

        return template.queryForObject(sql,Integer.class,username,userpwd);
    }
}

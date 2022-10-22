package dao;

import util.Salesman;

import java.util.List;

public interface SalesmanDao {

    int selectUserByUsernameAndUserPwd(String username, String userpwd);

    int querySalesman();

    List<Salesman> querySalesmanByPage(int start);
}

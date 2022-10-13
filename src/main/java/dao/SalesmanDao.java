package dao;

import util.Salesman;

import java.util.List;

public interface SalesmanDao {

    int selectUserByUsernameAndUserPwd(String username, String userpwd);

    List<Salesman> querySalesman();
}

package service;

import dao.SalesmanDao;
import dao.impl.SalesmanDaoImpl;
import util.Salesman;

import java.util.List;

public interface SalesmanService {

    int sale_login(String username, String userpwd);

    int querySalesman();

    List<Salesman> querySalesmanByPage(int start);
}

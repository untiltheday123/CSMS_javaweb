package service.impl;

import dao.SalesmanDao;
import dao.impl.SalesmanDaoImpl;
import service.SalesmanService;
import util.Salesman;

import java.util.List;

public class SalesmanServiceImpl implements SalesmanService {

    SalesmanDao salesmanDao = new SalesmanDaoImpl();

    @Override
    public int sale_login(String username, String userpwd){
        return salesmanDao.selectUserByUsernameAndUserPwd(username,userpwd);
    }

    @Override
    public int querySalesman() {
        System.out.println("SalesmanServiceImpl.querySalesman");
        return salesmanDao.querySalesman();
    }

    @Override
    public List<Salesman> querySalesmanByPage(int start) {
        return salesmanDao.querySalesmanByPage(start);
    }
}

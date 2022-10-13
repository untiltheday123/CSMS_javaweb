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
    public List<Salesman> querySalesman() {
        return salesmanDao.querySalesman();
    }
}

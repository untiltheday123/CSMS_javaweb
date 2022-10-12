package service.impl;

import dao.ManagerDao;
import dao.impl.ManagerDaoImpl;
import service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
    ManagerDao managerDaoImpl = new ManagerDaoImpl();

    @Override
    public int mana_login(String username, String password) {
        return managerDaoImpl.selectUserByUsernameAndUserPwd(username,password);
    }
}

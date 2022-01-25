package by.epamtc.kulikolga.hospital_project.dao.factory;

import by.epamtc.kulikolga.hospital_project.dao.impl.SqlUserDAO;
import by.epamtc.kulikolga.hospital_project.dao.interfaces.UserDAO;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private UserDAO userImpl = new SqlUserDAO();

    private DAOFactory(){

    }

    public static DAOFactory getInstance() {
        return instance;
    }


    public UserDAO getUserDAO() {
        return userImpl;
    }

    public void setUserImpl(UserDAO userImpl) {
        this.userImpl = userImpl;
    }
}

package by.epamtc.kulikolga.hospital_project.service.impl;

import by.epamtc.kulikolga.hospital_project.bean.User;
import by.epamtc.kulikolga.hospital_project.dao.DAOException;
import by.epamtc.kulikolga.hospital_project.dao.factory.DAOFactory;
import by.epamtc.kulikolga.hospital_project.dao.interfaces.UserDAO;
import by.epamtc.kulikolga.hospital_project.service.exception.ServiceException;
import by.epamtc.kulikolga.hospital_project.service.interfaces.UserService;
import by.epamtc.kulikolga.hospital_project.service.validation.ValidatorUser;

public class UserServiceImpl implements UserService {
    public boolean signIn(String login, String password) throws ServiceException {
        if (!ValidatorUser.isValidLogin(login)) {
            throw new ServiceException("Incorrect login form");
        }
        if (!ValidatorUser.isValidPassword(password)) {
            throw new ServiceException("Incorrect password form");
        }

        boolean result;

        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            result = userDAO.findUser(login, password);

        } catch (DAOException e) {
            throw new ServiceException("Exception of authentication", e);
        }
        return result;
    }
}

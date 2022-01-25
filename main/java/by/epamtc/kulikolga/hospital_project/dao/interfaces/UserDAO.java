package by.epamtc.kulikolga.hospital_project.dao.interfaces;

import by.epamtc.kulikolga.hospital_project.bean.User;
import by.epamtc.kulikolga.hospital_project.dao.DAOException;

import java.util.Optional;

public interface UserDAO {
    Optional<User> findUser(String login, String password) throws DAOException;

}

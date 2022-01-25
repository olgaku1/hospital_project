package by.epamtc.kulikolga.hospital_project.service.interfaces;

import by.epamtc.kulikolga.hospital_project.service.exception.ServiceException;

public interface UserService {

    boolean signIn(String login, String password) throws ServiceException;
}

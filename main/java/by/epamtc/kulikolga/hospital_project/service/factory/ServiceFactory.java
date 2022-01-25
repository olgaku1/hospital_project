package by.epamtc.kulikolga.hospital_project.service.factory;

import by.epamtc.kulikolga.hospital_project.service.impl.UserServiceImpl;
import by.epamtc.kulikolga.hospital_project.service.interfaces.UserService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();


    private final UserService userService = new UserServiceImpl();

    private ServiceFactory(){

    }

    public static  ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }
}

package by.epamtc.kulikolga.hospital_project.controller.commandImpl;

import by.epamtc.kulikolga.hospital_project.bean.User;
import by.epamtc.kulikolga.hospital_project.controller.Command;
import by.epamtc.kulikolga.hospital_project.service.exception.ServiceException;
import by.epamtc.kulikolga.hospital_project.service.factory.ServiceFactory;
import by.epamtc.kulikolga.hospital_project.service.interfaces.UserService;
import by.epamtc.kulikolga.hospital_project.util.ConfigurationManager;
import by.epamtc.kulikolga.hospital_project.util.MessageManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SignIn implements Command {
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page;

        String login = request.getParameter(PARAM_NAME_LOGIN);
        String password = request.getParameter(PARAM_NAME_PASSWORD);
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        try {
            if (userService.signIn(login, password)) {
                request.setAttribute("user", login);
                page = ConfigurationManager.getInstance()
                        .getProperty(ConfigurationManager.MAIN_PAGE_PATH);
            } else {
                request.setAttribute("errorMessage", MessageManager.getInstance()
                        .getProperty(MessageManager.LOGIN_ERROR_MESSAGE));
                page = ConfigurationManager.getInstance()
                        .getProperty(ConfigurationManager.ERROR_PAGE_PATH);
            }

        } catch (ServiceException e) {
            throw new RuntimeException("Error of sign in", e);
        }
        return page;
    }

//    private void setUserToSession(final User user, HttpServletRequest request) {
//        var session = request.getSession();
//        User userAttr = User.useRole(user.getUserRole().getRoleName());
//        session.setAttribute("user", userAttr);
//    }
}

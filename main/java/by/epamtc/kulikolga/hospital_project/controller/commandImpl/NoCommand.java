package by.epamtc.kulikolga.hospital_project.controller.commandImpl;

import by.epamtc.kulikolga.hospital_project.controller.Command;
import by.epamtc.kulikolga.hospital_project.util.ConfigurationManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NoCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = ConfigurationManager.getInstance()
                .getProperty(ConfigurationManager.LOGIN_PAGE_PATH);
        return page;
    }

}

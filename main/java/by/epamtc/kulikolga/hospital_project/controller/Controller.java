package by.epamtc.kulikolga.hospital_project.controller;

import by.epamtc.kulikolga.hospital_project.dao.connection.ConnectionPool;
import by.epamtc.kulikolga.hospital_project.dao.connection.ConnectionPoolException;
import by.epamtc.kulikolga.hospital_project.util.ConfigurationManager;
import by.epamtc.kulikolga.hospital_project.util.MessageManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "Controller", value = "/hospital")
public class Controller extends HttpServlet {
private Connection connection;
    @Override
    public void destroy() {
        try {
            connection.close();
        } catch (SQLException e) {
            //LOGGER
        }
    }

    @Override
    public void init() throws ServletException {
        try {
            connection = ConnectionPool.getInstance().getConnection();
        } catch (ConnectionPoolException e) {
            //LOGGER
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CommandProvider commandProvider = CommandProvider.getInstance();

        String page;
        try {
            Command command = commandProvider.getCommand(request);
            page = command.execute(request, response);

        } catch (Exception e) {
            //logger
            request.setAttribute("errorMessage", MessageManager.getInstance().getProperty(MessageManager.SERVLET_EXCEPTION_ERROR_MESSAGE));
            page = ConfigurationManager.getInstance()
                    .getProperty(ConfigurationManager.ERROR_PAGE_PATH);
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

}

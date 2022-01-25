package by.epamtc.kulikolga.hospital_project.dao.impl;

import by.epamtc.kulikolga.hospital_project.bean.Role;
import by.epamtc.kulikolga.hospital_project.bean.User;
import by.epamtc.kulikolga.hospital_project.dao.DAOException;
import by.epamtc.kulikolga.hospital_project.dao.connection.ConnectionPool;
import by.epamtc.kulikolga.hospital_project.dao.connection.ConnectionPoolException;
import by.epamtc.kulikolga.hospital_project.dao.interfaces.UserDAO;

import java.sql.*;
import java.util.Optional;

public class SqlUserDAO implements UserDAO {
    private static final String FIND_USER_BY_LOGIN_PASSWORD = "SELECT * FROM USERS WHERE LOGIN = ? AND PASSWORD = ?";
    private static final String ADD_NEW_USER = "INSERT INTO USERS (last_name, first_name, second_name, login, password, email, role) VALUES (?, ?, ?, ?, ?, ?, ?)" ;

    @Override
    public Optional<User> findUser(String login, String password) throws DAOException {
        PreparedStatement statement = null;
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            statement = connection.prepareStatement(FIND_USER_BY_LOGIN_PASSWORD);
            statement.setString(1, login);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    User user = readUser(resultSet);
                    return Optional.of(user);
                }
            }
        } catch (ConnectionPoolException | SQLException e) {
            throw new DAOException("Error of connection with data base", e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new DAOException("Error of connection with data base", e);
                }
            }
        }
        return Optional.empty();
    }

    public User readUser(ResultSet resultSet) throws DAOException {
        User currentUser = new User();
        try {
            currentUser.setIdUser(resultSet.getInt(1));
            currentUser.setLastName(resultSet.getString(2));
            currentUser.setFirstName(resultSet.getString(3));
            currentUser.setSecondName(resultSet.getString(4));
            currentUser.setLogin(resultSet.getString(5));
            currentUser.setPassword(resultSet.getString(6));
            currentUser.setEmail(resultSet.getString(7));
            Role.of(resultSet.getString(8));
        } catch (SQLException e) {
            throw new DAOException("Error of connection with data base", e);
        }
        return currentUser;
    }

    public Optional<User> register (String lastName, String firstName, String secondName, String login, String password, String email, int role) throws DAOException {
        PreparedStatement statement = null;
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            statement = connection.prepareStatement(ADD_NEW_USER);
            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.setString(3, secondName);
            statement.setString(4, login);
            statement.setString(5, password);
            statement.setString(6, email);
            statement.setInt(7, role);
            statement.executeUpdate();
        } catch (ConnectionPoolException | SQLException e) {
            throw new DAOException("Error of connection with data base", e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new DAOException("Error of connection with data base", e);
                }
            }
        }
        return findUser(login, password);
    }
}



package by.epamtc.kulikolga.hospital_project.bean;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 9043444339750886889L;

    private int idUser;
    private String lastName;
    private String firstName;
    private String secondName;
    private String login;
    private String password;
    private String email;
    private String userRole;

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;

        if (idUser != user.idUser) {
            return false;
        }

        if (null == login) {
            return (login == user.login);
        } else {
            if (!login.equals(user.login)) {
                return false;
            }
        }
        if (null == password) {
            return (password == user.password);
        } else {
            if (!password.equals(user.password)) {
                return false;
            }
        }

        if (null == lastName) {
            return (lastName == user.lastName);
        } else {
            if (!lastName.equals(user.lastName)) {
                return false;
            }
        }

        if (null == firstName) {
            return (firstName == user.firstName);
        } else {
            if (!firstName.equals(user.firstName)) {
                return false;
            }
        }

        if (null == secondName) {
            return (secondName == user.secondName);
        } else {
            if (!secondName.equals(user.secondName)) {
                return false;
            }
        }

        if (null == email) {
            return (email == user.email);
        } else {
            if (!email.equals(user.email)) {
                return false;
            }
        }

        if (null == userRole) {
            return (userRole == user.userRole);
        } else {
            if (!userRole.equals(user.userRole)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int primeNumber = 17;
        int result;
        result = primeNumber * idUser + ((null == firstName) ? 0 : firstName.hashCode());
        result = primeNumber * result + ((null == lastName) ? 0 : lastName.hashCode());
        result = primeNumber * result + ((null == secondName) ? 0 : secondName.hashCode());
        result = primeNumber * result + ((null == login) ? 0 : login.hashCode());
        result = primeNumber * result + ((null == password) ? 0 : password.hashCode());
        result = primeNumber * result + ((null == email) ? 0 : email.hashCode());
        result = primeNumber * result + ((null == userRole) ? 0 : userRole.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(getClass().getSimpleName());
        info.append("{idUser='").append(idUser).
                append(", lastName='").append(lastName).
                append(", firstName='").append(firstName).
                append(", secondName='").append(secondName).
                append(", login='").append(login).
                append(", password='").append(password).
                append(", email='").append(email).
                append(", userRole='").append(userRole).append('}');
        return info.toString();
    }
}

package by.epamtc.kulikolga.hospital_project.dao;

public class DAOException extends Exception{
    private final static long serialVersionUID = -1095058296830679691L;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}

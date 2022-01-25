package by.epamtc.kulikolga.hospital_project.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUser {
    private static final String REGEX_LOGIN = "^[a-z0-9_-]{3,16}$";
    private static final String REGEX_PASSWORD = "^[a-zA-Z0-9-_]{8,}$";
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9-_@.]{8,}$";
    private static final String REGEX_NAME = "^[a-zA-Z-]{3,22}$";

    public static boolean isValidData(String REGEX, String data) {
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(data);
        return matcher.find();
    }

    public static boolean isValidLogin(String login) {
        return isValidData(REGEX_LOGIN, login);
    }

    public static boolean isValidPassword(String password) {
        return isValidData(REGEX_PASSWORD, password);
    }

    public static boolean isValidEmail(String email) {
        return isValidData(REGEX_EMAIL, email);
    }

    public static boolean isValidName(String name) {
        return isValidData(REGEX_NAME, name);
    }

}


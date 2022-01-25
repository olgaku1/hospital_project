package by.epamtc.kulikolga.hospital_project.service.hash;

import by.epamtc.kulikolga.hospital_project.service.exception.ServiceException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256PasswordHash {
    private static SHA256PasswordHash instance;

    private SHA256PasswordHash() {
    }

    public static SHA256PasswordHash getInstance() {
        if (instance == null) {
            instance = new SHA256PasswordHash();
        }
        return instance;
    }

    public byte[] computeHash(String password) throws ServiceException {
        byte[] passwordHash;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            passwordHash = messageDigest.digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new ServiceException("Error during password hashing", e);
        }
        return passwordHash;
    }
}




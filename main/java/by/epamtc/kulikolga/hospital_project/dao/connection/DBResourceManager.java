package by.epamtc.kulikolga.hospital_project.dao.connection;

import java.util.ResourceBundle;

public class DBResourceManager {
    private static final String BUNDLE_NAME = "db.properties";

    private static DBResourceManager instance;

    private ResourceBundle resourceBundle;

    public static DBResourceManager getInstance() {
        if (instance == null) {
            instance = new DBResourceManager();
            instance.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
        }
        return instance;
    }
    public String getValue(String key){
        return resourceBundle.getString(key);
    }
}

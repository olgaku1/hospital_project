package by.epamtc.kulikolga.hospital_project.bean;

public enum Role {
    ADMIN(1),
    DOCTOR(2),
    NURSE(3),
    GUEST(4);

    private int roleId;

    Role(int roleId) {
        this.roleId = roleId;
    }

    public static Role of(String role) {
        for (Role value : Role.values()) {
            if (value.roleId == Integer.parseInt(role)) {
                return value;
            }
        }
        return GUEST;
    }
}

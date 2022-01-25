package by.epamtc.kulikolga.hospital_project.bean;

public enum Status {
    NEW(1),
    DIAGNOSTICS(2),
    TREATMENT(3),
    DISCHARGE(4);

    private int statusId;

    Status(int statusId) {
        this.statusId = statusId;
    }

    public static Status of(String status) {
        for (Status value : Status.values()) {
            if (value.statusId == Integer.parseInt(status)) {
                return value;
            }
        }
        return NEW;
    }
}

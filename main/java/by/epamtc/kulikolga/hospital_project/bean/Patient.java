package by.epamtc.kulikolga.hospital_project.bean;

import java.io.Serializable;

public class Patient implements Serializable {
    private static final long serialVersionUID = 7698609513851952478L;

    private int idPatient;
    private String lastName;
    private String firstName;
    private String secondName;
    private String gender;
    private String birthDate;
    private String dateReceipt;
    private String complaints;
    private String provisDiagnosis;
    private User therapist;
    private Diagnosis finalDiagnosis;
    private TreatmentRegimen treatmentRegimen;
    private Status status;
    private String dateDischarge;

    public Patient() {
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(String dateReceipt) {
        this.dateReceipt = dateReceipt;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getProvisDiagnosis() {
        return provisDiagnosis;
    }

    public void setProvisDiagnosis(String provisDiagnosis) {
        this.provisDiagnosis = provisDiagnosis;
    }

    public User getTherapist() {
        return therapist;
    }

    public void setTherapist(User therapist) {
        this.therapist = therapist;
    }

    public Diagnosis getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(Diagnosis finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDateDischarge() {
        return dateDischarge;
    }

    public void setDateDischarge(String dateDischarge) {
        this.dateDischarge = dateDischarge;
    }

    public TreatmentRegimen getTreatmentRegimen() {
        return treatmentRegimen;
    }

    public void setTreatmentRegimen(TreatmentRegimen treatmentRegimen) {
        this.treatmentRegimen = treatmentRegimen;
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
        Patient patient = (Patient) obj;

        if (idPatient != patient.idPatient) {
            return false;
        }

        if (null == lastName) {
            return (lastName == patient.lastName);
        } else {
            if (!lastName.equals(patient.lastName)) {
                return false;
            }
        }
        if (null == firstName) {
            return (firstName == patient.firstName);
        } else {
            if (!firstName.equals(patient.firstName)) {
                return false;
            }
        }

        if (null == secondName) {
            return (secondName== patient.secondName);
        } else {
            if (!secondName.equals(patient.secondName)) {
                return false;
            }
        }

        if (null == gender) {
            return (gender == patient.gender);
        } else {
            if (!gender.equals(patient.gender)) {
                return false;
            }
        }

        if (null == birthDate) {
            return (birthDate == patient.birthDate);
        } else {
            if (!birthDate.equals(patient.birthDate)) {
                return false;
            }
        }

        if (null == dateReceipt) {
            return (dateReceipt == patient.dateReceipt);
        } else {
            if (!dateReceipt.equals(patient.dateReceipt)) {
                return false;
            }
        }

        if (null == complaints) {
            return (complaints == patient.complaints);
        } else {
            if (!complaints.equals(patient.complaints)) {
                return false;
            }
        }

        if (null == provisDiagnosis) {
            return (provisDiagnosis == patient.provisDiagnosis);
        } else {
            if (!provisDiagnosis.equals(patient.provisDiagnosis)) {
                return false;
            }
        }

        if (null == therapist) {
            return (therapist == patient.therapist);
        } else {
            if (!therapist.equals(patient.therapist)) {
                return false;
            }
        }

        if (null == finalDiagnosis) {
            return (finalDiagnosis == patient.finalDiagnosis);
        } else {
            if (!finalDiagnosis.equals(patient.finalDiagnosis)) {
                return false;
            }
        }

        if (null == treatmentRegimen) {
            return (status == patient.status);
        } else {
            if (!status.equals(patient.status)) {
                return false;
            }
        }

        if (null == status) {
            return (status == patient.status);
        } else {
            if (!status.equals(patient.status)) {
                return false;
            }
        }

        if (null == dateDischarge) {
            return (dateDischarge == patient.dateDischarge);
        } else {
            if (!dateDischarge.equals(patient.dateDischarge)) {
                return false;
            }
        }

        return true;


    }

    @Override
    public int hashCode() {
        final int primeNumber = 17;
        int result;
        result = primeNumber * idPatient + ((null == firstName) ? 0 : firstName.hashCode());
        result = primeNumber * result + ((null == lastName) ? 0 : lastName.hashCode());
        result = primeNumber * result + ((null == secondName) ? 0 : secondName.hashCode());
        result = primeNumber * result + ((null == gender) ? 0 : gender.hashCode());
        result = primeNumber * result + ((null == birthDate) ? 0 : birthDate.hashCode());
        result = primeNumber * result + ((null == dateReceipt) ? 0 : dateReceipt.hashCode());
        result = primeNumber * result + ((null == complaints) ? 0 : complaints.hashCode());
        result = primeNumber * result + ((null == provisDiagnosis) ? 0 : provisDiagnosis.hashCode());
        result = primeNumber * result + ((null == therapist) ? 0 : therapist.hashCode());
        result = primeNumber * result + ((null == finalDiagnosis) ? 0 : finalDiagnosis.hashCode());
        result = primeNumber * result + ((null == treatmentRegimen) ? 0 : treatmentRegimen.hashCode());
        result = primeNumber * result + ((null == status) ? 0 : status.hashCode());
        result = primeNumber * result + ((null == dateDischarge) ? 0 : dateDischarge.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(getClass().getSimpleName());
        info.append("{idPatient='").append(idPatient).
                append(", lastName='").append(lastName).
                append(", firstName='").append(firstName).
                append(", secondName='").append(secondName).
                append(", gender='").append(gender).
                append(", birthDate='").append(birthDate).
                append(", dateReceipt='").append(dateReceipt).
                append(", complaints='").append(complaints).
                append(", provisDiagnosis='").append(provisDiagnosis).
                append(", therapist='").append(therapist).
                append(", finalDiagnosis='").append(finalDiagnosis).
                append(", treatmentRegimen='").append(treatmentRegimen).
                append(", status='").append(status).
                append(", dateDischarge='").append(dateDischarge).
                append('}');
        return info.toString();
    }
}

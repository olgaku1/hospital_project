package by.epamtc.kulikolga.hospital_project.bean;

import java.io.Serializable;
import java.util.Map;

public class TreatmentRegimen implements Serializable {
    private static final long serialVersionUID = 5586280532890153912L;

    private int idTreatmentRegimen;
    private User medStaff;
    private Diagnosis finalDiagnosis;
    private Map<String, String> drugs;
    private Map<String, String> procedures;
    private String description;

    public TreatmentRegimen() {
    }

    public int getIdTreatmentRegimen() {
        return idTreatmentRegimen;
    }

    public void setIdTreatmentRegimen(int idTreatmentRegimen) {
        this.idTreatmentRegimen = idTreatmentRegimen;
    }

    public User getMedStaff() {
        return medStaff;
    }

    public void setMedStaff(User medStaff) {
        this.medStaff = medStaff;
    }

    public Diagnosis getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(Diagnosis finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public Map<String, String> getDrugs() {
        return drugs;
    }

    public void setDrugs(Map<String, String> drugs) {
        this.drugs = drugs;
    }

    public Map<String, String> getProcedures() {
        return procedures;
    }

    public void setProcedures(Map<String, String> procedures) {
        this.procedures = procedures;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        TreatmentRegimen treatmentRegimen = (TreatmentRegimen) obj;

        if (idTreatmentRegimen != treatmentRegimen.idTreatmentRegimen) {
            return false;
        }

        if (null == medStaff) {
            return (medStaff == treatmentRegimen.medStaff);
        } else {
            if (!medStaff.equals(treatmentRegimen.medStaff)) {
                return false;
            }
        }
        if (null == finalDiagnosis) {
            return (finalDiagnosis == treatmentRegimen.finalDiagnosis);
        } else {
            if (!finalDiagnosis.equals(treatmentRegimen.finalDiagnosis)) {
                return false;
            }
        }

        if (null == drugs) {
            return (drugs == treatmentRegimen.drugs);
        } else {
            if (!drugs.equals(treatmentRegimen.drugs)) {
                return false;
            }
        }

        if (null == procedures) {
            return (procedures == treatmentRegimen.procedures);
        } else {
            if (!procedures.equals(treatmentRegimen.procedures)) {
                return false;
            }
        }

        if (null == description) {
            return (description == treatmentRegimen.description);
        } else {
            if (!description.equals(treatmentRegimen.description)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int primeNumber = 17;
        int result;
        result = primeNumber * idTreatmentRegimen + ((null == medStaff) ? 0 : medStaff.hashCode());
        result = primeNumber * result + ((null == finalDiagnosis) ? 0 : finalDiagnosis.hashCode());
        result = primeNumber * result + ((null == drugs) ? 0 : drugs.hashCode());
        result = primeNumber * result + ((null == procedures) ? 0 : procedures.hashCode());
        result = primeNumber * result + ((null == description) ? 0 : description.hashCode());

        return result;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(getClass().getSimpleName());
        info.append("{idTreatmentRegimen='").append(idTreatmentRegimen).
                append(", medStaff='").append(medStaff).
                append(", drugs='").append(drugs).
                append(", procedures='").append(procedures).
                append(", description='").append(description).
                append('}');
        return info.toString();
    }
}

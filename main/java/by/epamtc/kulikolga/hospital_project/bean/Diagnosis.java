package by.epamtc.kulikolga.hospital_project.bean;

import java.io.Serializable;

public class Diagnosis implements Serializable {
    private static final long serialVersionUID = -1446796228209166254L;

    private int idDiagnosis;
    private String diagnosisName;
    private String codeICD10;

    public Diagnosis() {
    }

    public int getIdDiagnosis() {
        return idDiagnosis;
    }

    public void setIdDiagnosis(int idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getCodeICD10() {
        return codeICD10;
    }

    public void setCodeICD10(String codeICD10) {
        this.codeICD10 = codeICD10;
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
        Diagnosis diagnosis = (Diagnosis) obj;

        if (idDiagnosis != diagnosis.idDiagnosis) {
            return false;
        }

        if (null == diagnosisName) {
            return (diagnosisName == diagnosis.diagnosisName);
        } else {
            if (!diagnosisName.equals(diagnosis.diagnosisName)) {
                return false;
            }
        }
        if (null == codeICD10) {
            return (codeICD10 == diagnosis.codeICD10);
        } else {
            if (!codeICD10.equals(diagnosis.codeICD10)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int primeNumber = 17;
        int result;
        result = primeNumber * idDiagnosis + ((null == diagnosisName) ? 0 : diagnosisName.hashCode());
        result = primeNumber * result + ((null == codeICD10) ? 0 : codeICD10.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(getClass().getSimpleName());
        info.append("{idDiagnosis='").append(idDiagnosis).
                append(", diagnosisName='").append(diagnosisName).
                append(", codeICD10='").append(codeICD10).append('}');
        return info.toString();
    }
}

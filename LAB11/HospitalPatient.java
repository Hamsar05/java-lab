//Write a Java program to create a Hospital class with Patient details, pass the object to update diagnosis and display updated information.
class PatientData {
    String diagnosis;

    PatientData(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    void display() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}

public class HospitalPatient {

    static void updateDiagnosis(PatientData p) {
        p.diagnosis = "Recovered";
    }

    public static void main(String[] args) {

        PatientData p1 = new PatientData("Fever");

        System.out.println("Before Update:");
        p1.display();

        updateDiagnosis(p1);

        System.out.println("After Update:");
        p1.display();
    }
}
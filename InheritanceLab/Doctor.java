public class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int number, String specialty_1) {
        super(name, number);
        this.specialty = specialty_1;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String toString() {
        return "Doctor [name=" + emp_name + ", number=" + emp_no + ", specialty=" + specialty + "]";
    }
}

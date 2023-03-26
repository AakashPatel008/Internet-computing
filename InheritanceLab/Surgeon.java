public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public String toString() {
        return "Surgeon [name=" + emp_name + ", number=" + emp_no + ", specialty=" + getSpecialty() + ", operating=" + operating + "]";
    }
}

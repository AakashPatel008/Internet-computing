public class Nurse extends HospitalEmployee {
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
        
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    
    public String toString() {
        return "Nurse [name=" + emp_name + ", number=" + emp_no + ", numOfPatients=" + numOfPatients + "]";
    }
    
    
}


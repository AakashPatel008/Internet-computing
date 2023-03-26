public class HospitalEmployee {
    protected String emp_name;
    protected int emp_no;

    public HospitalEmployee(String Emp_name, int Emp_no) {
        this.emp_name = Emp_name;
        this.emp_no = Emp_no;
    }

    public String getName() {
        return emp_name;
    }

    public void setName(String name) {
        this.emp_name = name;
    }

    public int getNumber() {
        return emp_no;
    }

    public void setNumber(int number) {
        this.emp_no = number;
    }

    public String toString() {
        return "HospitalEmployee [name=" + emp_name + ", number=" + emp_no + "]";
    }

    public void work() {
        System.out.println(emp_name + " works for the hospital.");
    }
    
    
    	

    
    
}

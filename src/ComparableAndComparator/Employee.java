package ComparableAndComparator;

public class Employee {
    private int empID;
    private String empName;
    private String role;

    public Employee(int empID,String empName,String role){
        this.empID = empID;
        this.empName = empName;
        this.role = role;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

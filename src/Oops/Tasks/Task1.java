package Oops.Tasks;

public class Task1 {
    private String empName;
    private int empExp;
    private double empSalary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpExp() {
        return empExp;
    }

    public void setEmpExp(int empExp) {
        this.empExp = empExp;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "empName='" + empName + '\'' +
                ", empExp=" + empExp +
                ", empSalary=" + empSalary +
                '}';
    }
}

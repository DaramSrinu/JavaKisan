package ComparableAndComparator;

public class Student implements Comparable<Student> {
    private int stuId;
    private String stuName;
    private String stuDept;

    public Student(int stuId, String stuName,String stuDept){
        this.stuId  = stuId;
        this.stuName = stuName;
        this.stuDept = stuDept;
    }

    @Override
    public String toString() {
        return "{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuDept='" + stuDept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return this.stuId - o.stuId;
        //return this.stuName.compareTo(o.stuName);
        return this.stuDept.compareTo(o.stuDept);
    }
}

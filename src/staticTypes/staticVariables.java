package staticTypes;

public class staticVariables {

    static String comName = "Mphasis";

    int Emp_id;
    String Emp_name;

    staticVariables(int id, String name){
        Emp_id=id;
        Emp_name=name;
    }
    public static void main(String[] args){
        staticVariables sv = new staticVariables(101,"Srinu");
        staticVariables sv1 = new staticVariables(102,"Monish");
        staticVariables sv2 = new staticVariables(103,"Tharun");

        System.out.println("Comp_Name: " + comName + " Emp_Id: "+sv.Emp_id + " Emp_Name: " + sv.Emp_name);
        System.out.println("Comp_Name: " + comName + " Emp_Id: "+sv1.Emp_id + " Emp_Name: " + sv1.Emp_name);
        System.out.println("Comp_Name: " + comName + " Emp_Id: "+sv2.Emp_id + " Emp_Name: " + sv2.Emp_name);



    }
}

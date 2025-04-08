package BasicsOfClassesAndObjects_java;

 class employee {
    String name ;
    String jobtittle;
    double salary;

    employee(String n , String jt , double s){   //CONSTRUCTOR
        name = n;
        jobtittle = jt;
        salary = s;
    }

    void displayInfo(){
        System.out.println("NAME" +name);
        System.out.println("JOBTITTLE" +jobtittle);
        System.out.println("SALARY" +salary);
    }

    void UpdateSalary(double newSalary){
        salary = newSalary;
    }

    void RaiseSalary(double percent){
        salary = salary + (salary*percent/100);
    }
}

public class Employee {
    public static void main(String[] ar){
    employee ee = new employee("KARAN" , "JAVA DEVLOPER" , 50000);
    ee.displayInfo();
    ee.RaiseSalary(10);
    ee.UpdateSalary(60000);

    System.out.println("ALL THE UPDATED ATTRIBUTES");
    ee.displayInfo();
    }
}

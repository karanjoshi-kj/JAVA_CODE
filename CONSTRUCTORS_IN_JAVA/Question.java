package CONSTRUCTORS_IN_JAVA;

class Employee{
    public void work(){
        System.out.println("EMPLOY IS WORKING");
    }

    public int getsalary(){
         return 1000000;
    }
}

class HRManger extends Employee{
    public void work(){
        System.out.println("HR IS THE MANAGER");
    }

    public void addemployee(){
       System.out.println("NEW EMPLOYEE IS ADDED");
    }
}
public class Question {
    public static void main(String[] args) {
       Employee emp = new Employee();
       System.out.println("EMPLOYE;S SALARY" +emp.getsalary());        
    }
}

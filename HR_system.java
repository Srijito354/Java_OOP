import java.io.*;

public class HR_system{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Subhash";
        manager.id = 101;
        manager.salary = 150000.0;
        manager.manager_of = "Sales";
        manager.displayDetails();

        System.out.println(" ");

        Intern intern = new Intern();
        intern.name = "Satish";
        intern.id = 309;
        intern.salary = 25000;
        intern.duration = 0.5;
        intern.displayDetails();
    }
}

class Employee{
    protected String name;
    protected int id;
    protected double salary;

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary paid: "+salary);
    }
}

class Manager extends Employee{
    String manager_of;

    @Override
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary paid: "+salary);
        System.out.println("Manager of department: "+manager_of);
    }
}

class Intern extends Employee{
    String works_in_department;
    double duration;

    @Override
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary paid: "+salary);
        System.out.println("Duration of internship: "+duration);
    }
}
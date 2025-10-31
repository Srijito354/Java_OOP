import java.io.*;

public class Student_grading_system2{
    public static void main(String[] args){

    }
}

class Grade{
    double marks;
    double pass_marks;

    void change_mks(){
        if (marks > pass){
            System.out.println("Womp. Womp. Failed!");
        }
        else{
            System.out.println("Ya made it. Passed!");
        }
    }
}

class Theory extends Grade{
    Theory(double pass_marks){
        super(marks, pass_marks=40)
    }
}

class Practical extends Grade{
    Practical(double pass_marks){
        super(marks, pass_marks=40)
    }
}

class Student{
    int roll;
    double th_marks;
    double prac_marks;
    String name;
    Theory th_marks;
    Practical prac_marks;

    Student(int roll, double marks, String name){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
}
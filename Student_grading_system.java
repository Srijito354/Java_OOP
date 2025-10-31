import java.io.*;

public class Student_grading_system{
    public static void main(String[] args){
        Grade Prakash = new Grade();
        Prakash.roll = 2023;
        int th_marks = 60;
        Prakash.marks = th_marks;
        Prakash.grade = th_marks;

        Practical Prakash = new Practical();
        Prakash.roll = 2023;
        int prac_marks = 40;
        Prakash.marks = th_marks;
        Prakash.grade = th_marks;
    }
}

class Student{
    int roll;
    double marks;

    Student(int roll, double marks){
        this.roll = roll;
        this.marks = marks;
    }
}

class Grade{
    int roll;
    double marks;
    double pass_marks = 40;

    void grade(double marks){
        if (marks < pass_marks){
            System.out.println("Sorry, blud. you failed!");
        }
        else{
            System.out.println("Hell yeah, man. Ya made it. Passed!");
        }
    }
}

/*
class Theory extends Student_grade{
    void th_change(double marks){
        marks = marks
    }
}
*/

class Practical extends Grade{
    double pass_marks = 60;
}
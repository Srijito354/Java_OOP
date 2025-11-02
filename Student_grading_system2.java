import java.io.*;

public class Student_grading_system2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of students, you wanna input information about.");
        int n = Integer.parseInt(br.readLine());

        Student[] student = new Student[n];

        for (int i = 0; i<n; i++){
            System.out.print("\n\nEnter roll number of student.");
            int roll_no = Integer.parseInt(br.readLine());

            System.out.print("\nEnter name of student: ");
            String name = br.readLine();

            System.out.print("\nEnter theory marks of student: ");
            double th_marks = Double.parseDouble(br.readLine());

            System.out.print("\nEnter practical marks of student: ");
            double prac_marks = Double.parseDouble(br.readLine());

            student[i] = new Student(roll_no, th_marks, prac_marks, name);
        }

        System.out.print("\n\n");

        for (int i = 0; i<n; i++){
            student[i].print_details();
            System.out.print("\n");
        }
    }
}

class Grade{
    double marks;
    double pass_marks;
    String remarks;

    Grade(double marks, double pass_marks){
        this.marks = marks;
        this.pass_marks = pass_marks;
    }

    String pass_or_fail(){
        if (marks < pass_marks){
            remarks = "Womp. Womp. Failed!";
            return remarks;
        }
        else{
            remarks = "Ya made it. Passed!";
            return remarks;
        }
    }
}

class Theory extends Grade{
    Theory(double marks){
        super(marks, 60);
    }
}

class Practical extends Grade{
    Practical(double marks){
        super(marks, 40);
    }
}

class Student{
    int roll;
    double th_marks;
    double prac_marks;
    String name;
    String remarks;
    /*
    Theory th_marks;
    Practical prac_marks;
    */

    Student(int roll, double th_marks, double prac_marks, String name){
        this.roll = roll;
        /*
        this.th_marks = new Theory(th_marks);
        this.prac_marks = new Practical(prac_marks);
        */
        this.th_marks = th_marks;
        this.prac_marks = prac_marks;
        this.name = name;
    }

    void print_details(){
        Theory th =  new Theory(th_marks);
        Practical pr = new Practical(prac_marks);
        String th_remarks = th.pass_or_fail();
        String prac_remarks = pr.pass_or_fail();

        System.out.println("\n" + name);
        System.out.println(roll);
        System.out.println("Theory remarks: " + th_remarks);
        System.out.println("Practical remarks: " + prac_remarks);
    }
}
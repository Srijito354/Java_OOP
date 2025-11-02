import java.io.*;

public class Sample_str_obj_test{
    public static void main(String[] args){
        int i = 0;
        String obj_name = String.format("s%i");
        sample obj_name = new sample();
        obj_name.i = 5;
        obj_name.printf();
    }
}

class sample{
    int i = 0;

    void printf(){
        System.out.print(i);
    }
}
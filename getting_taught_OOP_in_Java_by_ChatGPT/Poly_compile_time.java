import java.io.*;

// We implement compile-time polymorphism using method overloading.
public class Poly_compile_time{
    public static void main(String[] args){
        MathUtil mathu = new MathUtil();
        System.out.println(mathu.add(10, 5));
        System.out.println(mathu.add(10.0, 5.0));
    }
}

class MathUtil {
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}
import java.io.*;

public class OOPS {  // Renaming to follow convention
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();

	Pen pen2 = new Pen();
	pen2.color = "black";
	pen2.type = "ballpoint";
	pen2.write();
    }
}

class Pen {
    String color;
    String type;
    
    public void write() {
        System.out.println("Write stupid stuff!");
	System.out.println(this.color);
    }
}



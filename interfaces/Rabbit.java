public class Rabbit{
    public static void main(String[] args){
        Rabbit1 r1 = new Rabbit1();
        r1.flee();
    }
}

/*
public interface Prey_interface{
    void flee();
}

public interface Predator_interface{
    void hunt();
}
*/

class Rabbit1 implements Prey_interface{
    @Override
    public void flee(){
        System.out.println("Rabbit is fleeing.");
    }
}
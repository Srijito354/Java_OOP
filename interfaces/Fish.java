public class Fish{
    public static void main(String[] args){
        Fish1 f1 = new Fish1();
        f1.flee();
        f1.hunt();
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

class Fish1 implements Prey_interface, Predator_interface{
    @Override
    public void flee(){
        System.out.println("Fish is fleeing.");
    }

    public void hunt(){
        System.out.println("Fish is hunting.");
    }
}
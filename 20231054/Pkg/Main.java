import Pkg.Pkg2.A;
import Pkg.Pkg2.B;
import Pkg.Pkg2.C;
import Pkg.Pkg2.D;

class Main {
    public static void main(String[] args) {
        A A_obj = new A();
        A_obj.a = 10;
        A_obj.display();

        B B_obj = new B();
        B_obj.b = 20;
        B_obj.display();

        C C_obj = new C();
        C_obj.c = 30;
        C_obj.display();

        D D_obj = new D();
        D_obj.d = 40;
        D_obj.display();
    }
}

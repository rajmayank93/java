
// All methods are public and abstract
interface A{
    // variables are default - final and static
    int age=44;
    String area="Anisabad";
    void show();
    void config();
}
// class -> class = extends
// interface -> class = implements
// interface -> interface = extends

interface X{
    void run();
}

interface Y extends X{

}


class B implements A,Y{
    public void show(){
        System.out.println("in Show");
    }

    public void config(){
        System.out.println(" in Config");
    }

    public void run(){
        System.out.println(" in Run");
    }
}

public class Demo5 {
    public static void main(String[] args){
        A obj= new B();
        obj.show();
        obj.config();
        // obj.run();

        X obj1= new B();
        obj1.run();
        System.out.println(B.age);
    }
}

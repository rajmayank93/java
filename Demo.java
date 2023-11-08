
class A{
    public void show(){
        System.out.println("in A show");
    }


}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}


// final - variable(constant), method(to stop overriding), class(it can't be superclass for any dereived class)
//eg:
//  class Calc{            // with final word it couldnot be extended
//     public final void show(){  // method could be modified later
//         System.out.println("in Calc");
//     }

//     public  void add(int n1, int n2){
//        System.out.println(n1+n2);
   
//     }
// }
// // we cant extend Calc after using final keyword
// class AdvCalc extends Calc{
//     public void show(){
//         System.out.println("in AdvCalc");
//     }
// }

public class Demo {
    public static void main(String args[]){
        // Dynamic method Dispatching (IMPORTANT)
        A obj= new A();
        obj.show();

        obj= new B();
        obj.show();

        obj= new C();
        obj.show();

        // AdvCalc c= new AdvCalc();
        // c.show();


        
    }
}

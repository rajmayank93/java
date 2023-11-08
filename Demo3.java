// Inner Class Concept
class A{
    int age;

    public void show(){
        System.out.println("in Show");
    }

    static class B{
        public void config(){
            System.out.println("in Config");
        }
    }
}

public class Demo3 {
    public static void main(String[] args){
    //   A obj= new A();
    //   obj.show();
    //      A.B obj1=obj.new B();
    //      obj1.config();
// for static inner class
        A obj= new A();
        obj.show();
        A.B obj1=new A.B();  // after making B class static we dont need to create a object
        obj1.config();
    }
}


// class A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }

//Inner Anonymous class could be used for abstract class
abstract class A{
    public abstract void show();
}

public class Demo4 {
    
    public static void main(String[] args){
        // inner Anonymous Class example (ANother way to override)
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

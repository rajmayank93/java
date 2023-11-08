
@FunctionalInterface // only have one method
interface A{
    // void show(int i);
    int add(int i, int j);
    // void run();
}

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }


public class FuncInterface {
    public static void main(String[] args) {
        // A obj= new A(){
        //     public void show(int i){
        //         System.out.println("in show " + i);
        //     }
        // };

        // lambda expression works only with the functional interface as only one method is allowed
        // A obj= (i)->
        //         System.out.println("in show " + i);

        // A obj=new A(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        // lamda expression
        A obj=(i,j) -> i+j;  // if expression is in one line return then avoid return to write
            

        int res= obj.add(7,8);
        System.out.println(res);
            
       

        // obj.show(5);
    }
}

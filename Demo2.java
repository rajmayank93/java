
// object upcasting and DOwncasting is also possible
// A obj= new B();
// obj.show1();
// B obj2= (B) obj;
// obj2.show2();


//Abstract Class

abstract class Car{
    public abstract void drive();  // this is optional 
    public abstract void fly();  // this is optional 

    public void MusicPlayer(){
        System.out.println("Music Playing...");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("WagonR driving");
    }
}

class extendedWagnor extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}
public class Demo2{

    public static void main(String[] args){
        Car a= new extendedWagnor(); // you can not create a object of abstract class
        a.drive();
        a.MusicPlayer();
        a.fly();

    }

   

     
}

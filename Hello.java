import java.util.*;
import tools.*;
// import tools.Calc;
// import tools.AdvCalc;

// Access Modifiers
//----------------------------------------------------------------
// Whenever we make variable or method must add public/private/protected 
// if class are at same file then its fine.

// class Calculator{
//     int num = 5;  // heap meomory

//     public int add(int x, int y){ // add function stored in stack 
//     System.out.println(num);
//         return x + y;
//     }
// }

// class Computer{
//     public void MusicPlaying(){
//         System.out.println("Music Playing ... ");
//     }

//     public String getMeaPen(int cost){
//         if(cost>=10)return "Pen";
//         return "Nothing";
//     }
// }
// // class load first
// // static class loaded first
// // then object instantiated
// class Mobile{
//     String name;
//     int price;
//     static String Type;

//     Mobile(){
//         name="";
//         price=0;
//     }

//     static{
//         Type = "Mobile";
//     }

    


//     void show(){
//         System.out.println(name +": " + price + ":"+ Type);
//     }

//     public static void show1(Mobile obj){
//         System.out.println(obj.name +": " + obj.price + ":"+ Type);
//     }
// }

// class Human{
//     private int age;
//     private String name;

//      public void setAge(int age){
//        this.age=age;
//     }
//      public void setName(String name){
//        this.name=name;
//     }

//     public int getAge(){
//         return age;
//     }

//     public String getName(){
//         return name;
//     }
// }

// class A{
//    public A(){
//     super();
//     System.out.println("in A");
//    }

//    public A(int x){
//     super();
//     System.out.println("in A int");
//    }
// }

// class B extends A{
//     public B(){
//         super();
//         System.out.println("in B");
//     }

//     public B(int x){
//         super(x);
//         System.out.println("in B int");
//     }
// }


// class C{
//     public C(){
//         System.out.println("Object Created");
//     }

//     public void show(){
//         System.out.println("in  C show");
//     }
// }

// multilevel Inhertiance is fine.
// multiple Inheritance Not possible Ambiguity issue if methods are of same Type
// eg of Calc having add, sub
// Again AdvCalc having multi,div with Calc method with
// again MoreAdvCalc having Pow 
 class A{

 }

 class B extends A{

 }

 class C extends B{

 }

 // There is concept i.e : Method Overriding
//  Parent( )
//  |
//  Child (method of same name overides the parent's method)



class Hello{

    public static void main(String a[])throws ClassNotFoundException{

        AdvCalc k= new AdvCalc();
        System.out.println(k.multi(5,4));




        // new C(); // anonymous object

        // C obj= new C(); //
        // obj.show();

        // super Keyword
        // B obj= new B(5);

        //-----------------------------------------------
        // Human obj= new Human();
        // obj.setAge(20);
        // obj.setName("MAx");

        // // System.out.println(obj.name);
        // System.out.println(obj.getAge());
        // System.out.println(obj.getName());
        // ;
        // System.out.println("Hello World!");
        // int n= 5 + 3;
        // double d= 7.2;    // double is default in java(8 bytes) and float is for 4 bytes
        // float p = 5.4f; 
        // char c='k'; // values are called literals
        // boolean v= false;
        // int m= 1_00_00_000;  // easy to  read count zeros and readable
        // System.out.println(v);
        // System.out.println(m);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(p);
        // System.out.println(n);

        // // TYPECASTING

        // int l= 259;
        // byte b= (byte)l;
        // System.out.println(b);

        // byte x= 10;
        // byte y= 20;
        // int res= y*x; // type conversion (overflow case)
        // System.out.println(res);


        // int i=1;
        // while(i<=4){
        //     System.out.println("Hi " + i);
        //     i++;
        // }

        // int num1=4;
        // int num2=5;
        // int res=num1 + num2;

        
        // Calculator c= new Calculator();
        // Calculator c1= new Calculator();
        // c1.num=8;
        // int res= c.add(num1,num2);
        // int res1= c1.add(num1,num2);
        // System.out.println(res);

        // Computer obj= new Computer();
        // obj.MusicPlaying();
        // String str= obj.getMeaPen(2);

        // System.out.println(str);

        //  int arr[][] = new int[3][4];
        //  Random rand = new Random();

        //  // for jagged array
        //  int arr1[][]= new int[3][];
        //  // if arrays are of different length
        //  arr1[0]= new int[5];
        //  arr1[1]= new int[3];
        //  arr1[2]= new int[4];
   
        // // Generate random integers in range 0 to 999
       

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //          int rand_int1 = rand.nextInt(1000);
        //        arr[i][j]= rand_int1;
        //     }
            
        //  }

        //  for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println("");
        //  }

        // StringBuffer sb = new StringBuffer("Mayank");

        // sb.append(" Gupta");
        

        // System.out.println(sb);

        // // STatic Use case
        // Mobile obj1= new Mobile();
        // obj1.name="Nokia";
        // obj1.price=1500;
        // Mobile.Type="SmartPhone";  // it is defined at one place and refernce is used everywhere so Defining that way is correct

        // Mobile obj2= new Mobile();
        // obj2.name="Apple";
        // obj2.price=2100;  
        // Mobile.Type="Lappy";

        // obj1.show();
        // obj2.show();

        // // Class.forName("Mobile");

        // Mobile.show1(obj1);









    }
}

// enum Status{
//     Running, Failed, Pending, Success;
// }

enum Laptop{
    Macbook(2000),XPS(2200),ThinkPad,chromebook;

    private int price;

    private Laptop(){
        price=500;
    }
    private Laptop(int price){
        this.price=price;
        System.out.println(" in Laptop" +  this.name());
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}



public class Enum {
    public static void main(String[] args){
        // Status s = Status.Success;
        // Status [] s= Status.values();
        // for(int i=0;i<s.length;i++){
        //     System.out.println(s[i] + " " + s[i].ordinal() );;
        // }
        // System.out.println(s);

        // Laptop lap= Laptop.Macbook;
        // System.out.println(lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + ": " + lap.getPrice());
        }


        
    }
}

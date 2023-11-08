interface Computer{
  void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile, run: Faster");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}


public class Demo6 {
    public static void main(String[] args){
      Computer lap = new Laptop();
      Developer mayank= new Developer();
      Computer desk= new Desktop();
      mayank.devApp(lap);
      mayank.devApp(desk);
    }
}

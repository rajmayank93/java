
//create own exception 
class MayankException extends Exception {
    public MayankException(String message){
        super(message);
    }
}

// how exception works
public class excep {
    public static  void main(String[] args) {
        int i=20;
        int j= 0;
        // int arr[]=new int[5];
        // String ans= null;

        try{
            j=18/i;
            if(j==0){
                throw new MayankException("I dont want to print zero");
            }
            // System.out.println(ans.length());
            // System.out.println(arr[1]);
            // System.out.println(arr[5]);
        }
        catch(MayankException e){
            // System.out.println("can't be divide by zero" +  e);
            j=18/1;
            System.out.println("thats the default output" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Byeee");
    }
}

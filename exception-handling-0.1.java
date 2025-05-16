import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int number,value;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number you want to divide : ");
        number=s.nextInt();
        System.out.print("Enter number you want to divide with : ");
        value=s.nextInt();
        
        try{
            int result=number/value;
            System.out.println("Result : "+result);
        }
        catch(Exception a){
            System.out.println("Oops , Wrong choice :"+ a.getMessage());
        }
        finally{
            System.out.println("Everything Done");
        }
    }
}

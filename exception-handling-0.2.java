import java.util.Scanner;

class result{
    result(int marks) throws Exception {
        if(marks<33){
            throw new Exception("You failed");
        }
        System.out.println("Passed");
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark to see result : ");
        int mark=sc.nextInt();
        
        try{
        result a=new result(mark);
        }
        catch(Exception a){
            System.out.println(a.getMessage());
        }
        finally{
            System.out.println("Thanks For Checking");
        }
    }
}

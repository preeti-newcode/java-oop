import java.util.Scanner;

class ageException extends RuntimeException{
  public ageException(String message){
      super(message);
  }
} 

class Main{
    
    static void age(int number){
        if(number<18){
            throw new ageException("Too young");
        }
        System.out.println("You are selected");
    }
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Age : ");
        int value=scan.nextInt();
        try{
            age(value);
        }
        catch(ageException e){
            System.out.println("Custom Exception : "+ e.getMessage());
        }
    }
}

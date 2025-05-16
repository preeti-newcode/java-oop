import java.util.Scanner;

class gradeException extends Exception{
    public gradeException(String line){
        super(line);
    }
}



class grade{
    static void result(int no) throws gradeException{
        
        if(no<33){
            throw new gradeException("Fail");
        }
        if(no>=90) System.out.println("A");
        else if(no>=80) System.out.println("B");
        else if(no>=70) System.out.println("C");
        else System.out.println("D");
        
    }
}

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=scan.nextInt();
        try{
            grade.result(marks);
        }catch(gradeException ge){
            System.out.println("Custom exception : "+ ge.getMessage());
        }
        
    }
}

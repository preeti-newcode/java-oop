import java.util.Scanner;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        File f=new File("New.txt");
        FileWriter fw=new FileWriter("New.txt");
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String value=sc.nextLine();
        String data="Your name please : "+value;
        
        fw.write(data);
        fw.close();
        
        FileReader fr=new FileReader(f);
        int no;
        while((no=fr.read()) != -1){
            System.out.print((char)no);
        }
        fr.close();
    }
}

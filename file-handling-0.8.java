import java.io.*;

class Main{
    public static void main(String[] args){
        try(FileReader fr=new FileReader("File.txt")){
            int no;
            while((no=fr.read()) != -1){
                System.out.print((char)no);
            }
        }catch(Exception e){
            System.out.println(" Handled Exception");
        }
    }
}

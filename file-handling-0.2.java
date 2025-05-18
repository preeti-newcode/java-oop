import java.io.FileReader;

class Main{
    public static void main(String[] args){
        int data;
        try{
        FileReader fr=new FileReader("File.txt");
        while((data=fr.read())!= -1){
            System.out.print((char)data);
        }
        fr.close();}
        catch(Exception e){
            
        }
        
    }
}

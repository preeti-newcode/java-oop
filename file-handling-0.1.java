import java.io.File;
import java.io.FileWriter;

class Main{
    public static void main(String[] args) throws Exception{
        File f=new File("File.txt");
        String data="Your name ";
        FileWriter fw=new FileWriter(f);
        fw.write(data);
        fw.close();
        
        if(f.exists()){
            System.out.print("Exists");
        }else{
            System.out.print("NOT");
        }
    }
}

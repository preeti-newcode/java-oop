import java.io.File;
class Main{
    public static void main(String[] args){
        File f=new File("File.txt");
        System.out.print("Address: "+ f.getAbsolutePath());
    }
}

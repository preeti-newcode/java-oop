import java.io.FileWriter;

class Main{
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("File.txt",true);
        String data=" xyz idk";
        fw.write(data);
        fw.close();
    }
}


class Mythread extends Thread{
    public void run(){
        for(int i=0;i<=10;++i){
            System.out.println(i);
            try{
            Thread.sleep(5000);
            }catch(InterruptedException e){
                
            }
        }
    }
}

class Main{
    public static void main(String[] args){
        Mythread t=new Mythread();
        t.start();
    }
}

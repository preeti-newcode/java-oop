
class Mythread implements Runnable{
    
    public int numb;
    
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(numb+"X"+i+"="+numb*i);
        }
    }
}

class Main{
    public static void main(String[] args){
    
        Mythread thread1=new Mythread();
        Mythread thread2=new Mythread();
        
        thread1.numb=5;
        thread2.numb=2;
        
        Thread t=new Thread(thread1);
        Thread t2=new Thread(thread2);
        
        t.start();
        t2.start();
    }
}

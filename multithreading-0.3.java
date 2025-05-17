
class Mythread extends Thread{
    private int numb;
    Mythread(int numb){
        this.numb=numb;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(numb+"X"+i+"="+numb*i);
        }
    }
}

class Main{
    public static void main(String[] args){
        Mythread t=new Mythread(5);
        Mythread t2=new Mythread(2);
        t.start();
        t2.start();
    }
}

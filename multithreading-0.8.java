class thread extends Thread{
    public int value;
    public void run(){
        for(int a=0;a<5;a++){
            System.out.println(value++);
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}

class Main{
    public static void main(String[] args){
        thread t=new thread();
        t.value=2;
        thread t2=new thread();
        t2.value=100;
        
        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
        t.start();
    }
}

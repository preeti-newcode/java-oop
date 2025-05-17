class My implements Runnable{
    private int no;
    My(int no){
        this.no=no;
    }
    public void run(){
        for(int a=0;no>=a;no--){
            System.out.println(no);
        }
    }
}
class Main{
    public static void main(String[] args){
        My th=new My(5);
        My thh=new My(7);
        Thread t=new Thread(th);
        Thread t2=new Thread(thh);
        
        t.start();
        t2.start();
        
        try{
                t2.join();
            }
            catch(Exception e){}
    }
}

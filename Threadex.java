public class Threadex extends Thread{
    public void run(){
        for (int i=0; i <3; i++) {
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Threadex t1= new Threadex();
        Threadex t2=new Threadex();
        t1.start();
        t2.start();
    }
}

package org.example;
class Runner1 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(" Hello"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Thread thread=new Thread(new Runner1()) ;
        thread.start();
    }
}
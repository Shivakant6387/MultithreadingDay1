package org.example;
class Runner extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(" Hello"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class App {
    public static void main(String[] args) {
Runner runner=new Runner();
runner.start();
    }
}

package org.example;

public class ThreadApp {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable(){
            public void run(){
                for (int i=0;i<10;i++){
                    System.out.println(" Hello"+i);

                    try{Thread.sleep(100);
                }catch (InterruptedException e){
                        System.out.println(e);}
                }
            }
        });
        thread.start();
    }
}

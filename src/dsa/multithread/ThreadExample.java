package dsa.multithread;

class Task1 extends Thread {

    @Override
    public void run(){
        System.out.println("thread is running :"+ Thread.currentThread().getName());

    }


}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        Task1 task1 =  new Task1();

        task1.start();
        task1.join();
        System.out.println(task1.isAlive());
    }
}

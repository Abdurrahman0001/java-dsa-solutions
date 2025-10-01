package dsa.multithread;


class Task implements Runnable {

    @Override
    public void run() {

        System.out.println("Thread is running: "+Thread.currentThread().getName());
    }
}

public class RunnableExample {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }

}

package DaTienTrinh_Runnable;

public class TestMyThread_runnable {
    public static void main(String[] args) {
        MyThread run1 = new MyThread();
        MyThread run2 = new MyThread();
        MyThread run3 = new MyThread();
        Thread tt1 = new Thread(run1);
        tt1.setName("Tiến trình A");
        Thread tt2 = new Thread(run2);
        tt2.setName("Tiến trình B");
        Thread tt3 = new Thread(run3);
        tt3.setName("Tiến trình C");

        tt1.start();
        tt2.start();
        tt3.start();
    }
}

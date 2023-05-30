package DaTienTrinh_Thread;

public class MyThread extends Thread {
    @Override
    public void run() { // run la 1 Phuong thuc thuoc class read
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+":i= "+i);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

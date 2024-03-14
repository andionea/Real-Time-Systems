package L2;

public class Execution3 extends Thread{
    Integer monitor1, monitor2;
    int sleep_min, activity_min, activity_max;

    public Execution3(Integer monitor1, Integer monitor2, int sleep_min, int activity_min, int activity_max) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.sleep_min = sleep_min;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
    }

    public void run() {
        System.out.println(this.getName() + " - STATE 1");

        int k = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }

        synchronized (monitor1) {
            synchronized (monitor2) {
            System.out.println(this.getName() + " - STATE 2");

            k = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
            for (int i = 0; i < k * 100000; i++) {
                i++;
                i--;
            }

                System.out.println(this.getName() + " - STATE 3");
                
                try {
                    Thread.sleep(sleep_min * 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
       
        System.out.println(this.getName() + " - STATE 4");
    }
}

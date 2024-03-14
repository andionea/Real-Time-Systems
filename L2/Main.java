package L2;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Integer monitor1 = new Integer(1);
        @SuppressWarnings("unused")
        Integer monitor2 = new Integer(1);
        Integer monitor = new Integer(1);
        
        /*
        new ExecutionThread(monitor, 2, 4, 3, 6).start();
        new ExecutionThread(monitor, 3, 5, 4, 7).start();
        */

        /* 
        new Execution1(monitor1, 4, 4, 2, 4).start();
        new Execution2(monitor1, monitor2, 3, 3, 3, 6).start();
        new Execution1(monitor2, 5, 5, 2, 5).start();
        */

        /*
        new Execution3(monitor1, monitor2, 4, 2, 4).start();
        new Execution3(monitor2, monitor1, 3, 3, 6).start();
        */

        new Execution4(monitor, 3, 2, 4).start();
        new Execution4(monitor, 6, 3, 6).start();
        new Execution4(monitor, 5, 2, 5).start();
    }
}
 
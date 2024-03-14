package L1;

public class Main {

    public static void main(String[] args) {
        /*
        ComplexNumber num1 = new ComplexNumber(2, 5);
        ComplexNumber num2 = new ComplexNumber(4, -1);

        Fir f1 = new Fir(2);
        Fir f2 = new Fir(3);
        Fir f3 = new Fir(5);

        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);
        Thread t3 = new Thread(f3);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Fir.totalSum(f1,f2,f3));
        */

        Resursa res = new Resursa();
        FirS fs = new FirS(res);
        FirC fc = new FirC(res);

        fs.start();
        fc.start();

    }
} 

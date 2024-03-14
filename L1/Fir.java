package L1;

public class Fir extends Thread{
    int pas;
    int suma;

    Fir(int pas){
        this.pas = pas;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void run(){
        Thread t = Thread.currentThread();
        for(int i = 0; i < 30; i += pas){
            suma += i;
        }
        System.out.println(t.getName() + "  " + suma );
    }

    public static int totalSum(Fir f1, Fir f2, Fir f3){
        return f1.suma + f2.suma + f3.suma;
    }
}

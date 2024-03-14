package L1;

public class Resursa {
    int res;

    public Resursa() {
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public synchronized void scrie(int r){
        res = r;
        notify();
        try {
            wait(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int citeste(){
        try {
            wait(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        return res;
    }
}

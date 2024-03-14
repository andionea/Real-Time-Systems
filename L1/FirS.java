package L1;

public class FirS extends Thread{
    Resursa r;

    FirS(Resursa r){
        this.r = r;
    }

    public void run(){
        for(int i = 0; i < 10; i ++){
            r.scrie(i);
            System.out.println(this.getName() + " am scris " + i );
        }
    }
}

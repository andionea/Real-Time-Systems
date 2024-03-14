package L1;

public class FirC extends Thread{
    Resursa r;

    FirC(Resursa r){
        this.r = r;
    }

    public synchronized void run(){
        for(int i = 0; i < 10; i ++){
            System.out.println(this.getName() + " " +  r.citeste() );
        }
    }
}

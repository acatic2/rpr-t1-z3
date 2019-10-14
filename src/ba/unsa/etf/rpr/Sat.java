package ba.unsa.etf.rpr;

public class Sat {
    private int sati,minute,sekunde;

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati,minute,sekunde);
    }

    public final void Postavi(int sati,int minute,int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public final void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    public final void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    public final void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<-pomak; i++) Prethodni();
    }
    public final int DajSate()  { return sati; }
    public final int DajMinute()  { return minute; }
    public final int DajSekunde()  { return sekunde; }
    public final void Ispisi() { System.out.print(sati);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(sekunde);
    }
}

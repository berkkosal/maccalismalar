package arac_uretimi3;

import java.time.Year;
import java.util.ArrayList;

abstract class Tasit {

    private static String modelAdi;
    private int anlikHiz;
    private int motorHacmi;
    private int yakitTuketimi;
    private final int uretimYili = Year.now().getValue();
    private boolean tasitCalisiyorMu;
    private Klima klima;
    private ArrayList<Tasit> tumArabalarListesi = new ArrayList<Tasit>();


    public Tasit(String modelAdi, int motorHacmi, Klima klima) {
        this.modelAdi = modelAdi;
        this.motorHacmi = motorHacmi;
        this.klima = klima;

    }


    abstract void gazaBas();

    abstract void freneBas();

    abstract void araciCalistir();

    abstract void araciDurdur();

    abstract void ozellikleriGoster();


    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        this.anlikHiz = anlikHiz;
    }

    public boolean isTasitCalisiyorMu() {
        return tasitCalisiyorMu;
    }

    public void setTasitCalisiyorMu(boolean tasitCalisiyorMu) {
        this.tasitCalisiyorMu = tasitCalisiyorMu;
    }

    public Klima getKlima() {
        return klima;
    }

    public void setKlima(Klima klima) {
        this.klima = klima;
    }

    public int getYakitTuketimi() {
        return yakitTuketimi;
    }

    public void setYakitTuketimi(int yakitTuketimi) {
        this.yakitTuketimi = yakitTuketimi;
    }

    public ArrayList<Tasit> getTumArabalarListesi() {
        return tumArabalarListesi;
    }

}


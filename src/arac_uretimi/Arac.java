package arac_uretimi;

import java.time.Year;
import java.util.ArrayList;

abstract class Arac {

    public static int toplamUretilenAracSayisi;
    private ArrayList<Arac> tasitlar = new ArrayList<>();
    private String modelAdi;
    private int yakitTuketimi;
    private int motorHacmi;
    private int maksimumHiz;
    private int oankiHiz;
    private boolean acikMi;
    private boolean klimaVarMi;
    private boolean araciCalistir;
    private Kamyon kamyon;
    private Minibus minibus;
    private Otomobil otomobil;

    public Arac(String modelAdi, int yakitTuketimi, int motorHacmi) {
        this.modelAdi = modelAdi;
        this.yakitTuketimi = yakitTuketimi;
        this.motorHacmi = motorHacmi;
        acikMi=false;

    }


    public ArrayList<Arac> getTasitlar() {
        return tasitlar;
    }

    public void setTasitlar(ArrayList<Arac> tasitlar) {
        this.tasitlar = tasitlar;
    }

    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public int getYakitTuketimi() {
        return yakitTuketimi;
    }

    public void setYakitTuketimi(int yakitTuketimi) {
        this.yakitTuketimi = yakitTuketimi;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getMaksimumHiz() {
        return maksimumHiz;
    }


    public int getOankiHiz() {
        return oankiHiz;
    }

    public void setOankiHiz(int oankiHiz) {
        this.oankiHiz = oankiHiz;
    }

    public boolean isAcikMi() {
        return acikMi;
    }

    public void setAcikMi(boolean acikMi) {
        this.acikMi = acikMi;
    }

    public boolean isKlimaVarMi() {
        return klimaVarMi;
    }

    public void setKlimaVarMi(boolean klimaVarMi) {
        this.klimaVarMi = klimaVarMi;
    }

    abstract void hizlan();

    abstract void yavasla();

    abstract void calisiyorMu();

}

package arac_uretimi4_son;

import java.time.Year;

public abstract class Tasit {

    private String modelAdi;
    private final int uretimYili;
    private int oAnkiHiz;
    private int motorHacmi;
    private int maksimumHiz;
    private boolean calisiyorMu;
    private boolean klimaVarMi;
    private String klima;
    private static int uretilenToplamAracSayisi;


    public Tasit(String modelAdi, int motorHacmi, int maksimumHiz,String klima) {
        this.uretimYili = Year.now().getValue();
        this.oAnkiHiz = 0;
        this.calisiyorMu = false;
        this.modelAdi = modelAdi;
        this.motorHacmi = motorHacmi;
        this.maksimumHiz = maksimumHiz;
        this.klimaVarMi = true;
        this.klima = klima;
        uretilenToplamAracSayisi++;
    }

    public void tasitiCalistir() {
        this.calisiyorMu = true;
    }

    public void tasitiDurdur() {
        this.calisiyorMu = false;
    }

    abstract public void gazaBas();

    abstract public void freneBas();


    public String getModelAdi() {
        return modelAdi;
    }


    public int getUretimYili() {
        return uretimYili;
    }

    public int getoAnkiHiz() {
        return oAnkiHiz;
    }

    public void setoAnkiHiz(int oAnkiHiz) {
       if(oAnkiHiz > maksimumHiz){
           this.oAnkiHiz = maksimumHiz;
       } else if( oAnkiHiz < 0 ){
           this.oAnkiHiz = 0;
       } else this.oAnkiHiz = oAnkiHiz;
    }


    public int getMotorHacmi() {
        return motorHacmi;
    }


    public int getMaksimumHiz() {
        return maksimumHiz;
    }

    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }

    public boolean isKlimaVarMi() {

        return klimaVarMi;
    }

}

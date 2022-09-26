package arac_uretimi2;

import java.time.Year;

abstract class Tasit implements TasitOzellikleri {

    public static int uretilenTumAracSayisi;
    private final int uretimYili = Year.now().getValue();
    private String modelAdi;
    private int yakitTuketimi;
    private int motorHacmi;
    private int anlikHiz;


    public Tasit(String modelAdi, int yakitTuketimi, int motorHacmi) {
        this.modelAdi =modelAdi;
        this.yakitTuketimi = yakitTuketimi;
        this.motorHacmi = motorHacmi;
        uretilenTumAracSayisi++;
    }

    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        this.anlikHiz = anlikHiz;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public String getModelAdi() {
        return modelAdi;
    }


    public int getYakitTuketimi() {
        return yakitTuketimi;
    }


    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }


}

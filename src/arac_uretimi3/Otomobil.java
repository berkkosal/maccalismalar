package arac_uretimi3;

abstract class Otomobil extends Tasit {

    private final int maksimumHiz = 180;
    private String vitesTuru;

    public Otomobil(String modelAdi, int motorHacmi, Klima klima, String vitesTuru) {
        super(modelAdi, motorHacmi, klima);
        this.vitesTuru = vitesTuru;
    }

    public int getMaksimumHiz() {
        return maksimumHiz;
    }

    public String getVitesTuru() {
        return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {
        this.vitesTuru = vitesTuru;
    }
}

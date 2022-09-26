package arac_uretimi4_son;

public class Main {
    public static void main(String[] args) {
        Otomobil t1 = new S350(Vites.OTOMATIK_VITES);
        Otomobil t2 = new C200(Vites.DUZ_VITES);

        Kamyon k1 = new K1(new Damper());
        k1.gazaBas();


    }
}

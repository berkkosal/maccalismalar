package arac_uretimi3;

public class Main {

    public static void main(String[] args) {

        Klima klima = new Klima();


        O1 otomobil1 = new O1("toyota", 100,klima,"OTOMATİK");
        System.out.println(otomobil1.getAnlikHiz());
        otomobil1.araciCalistir();
        otomobil1.gazaBas();
        otomobil1.gazaBas();
        otomobil1.gazaBas();
        otomobil1.freneBas();
        otomobil1.freneBas();


        K1 kamyon1 = new K1("volvo", 45,"damperli", klima);
    }

}

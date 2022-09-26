package arac_uretimi;

import java.util.ArrayList;

public class AracUretimiMain {


    public static void main(String[] args) {

        Kamyon k1 = new Kamyon("Volvo",44,52,8,55,true);
        k1.hizlan();
        k1.isDamper();
        k1.setAcikMi(true);
        k1.isAcikMi();

    }
}

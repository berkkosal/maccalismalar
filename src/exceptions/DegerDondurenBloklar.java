package exceptions;

public class DegerDondurenBloklar {
    public static void main(String[] args) {

        System.out.println(stringDegerDondurenBloklar());


    }

    private static String stringDegerDondurenBloklar() {

        String selam = "merhaba";

        try {
            selam = selam + "try";
           // return selam;
        } catch (Exception e) {
            selam = selam + "catch";
           // return selam;
        } finally {
            selam = selam + " finally";
            return selam;
            //En sonunda finally çalışacak, geriye döner döndürdüğü için diğerlerinde yazmaya gerek kalmadı.
        }
    }
}

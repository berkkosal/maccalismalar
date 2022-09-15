package abstract_interface;

 class Daire extends GeometrikSekil {

     public Daire(int yaricap) {
         setBirinciKenar(yaricap);
     }

     @Override
     public void cevreHesapla() {

         System.out.println("Dairenin çevresi: " + 2*3.14*getBirinciKenar());

     }

     @Override
     public void alanHesapla() {
         setHesaplananAlan((int) (3.14 * getBirinciKenar()*getBirinciKenar()));
         System.out.println("Dairenin alanı: " + getHesaplananAlan());

     }
 }

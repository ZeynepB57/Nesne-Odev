package paket;

public class sicaklikAlgilayicisi implements ISicaklik {
private static int derece;
    public int sicaklikOku(){
    	anaIslemPlatformu ai=new anaIslemPlatformu();
        secim sec=new secim();
        agArayuzu ay=new agArayuzu();
        if(ai.sicakilk<=0) {
        	 System.out.println("Sicaklik 0 derece ve altı haberin olsun !!!!!!");
        }

        derece=ai.sicakilk;
        sec.guncelle(derece);
        ay.ekle(ay);
		return derece;



    }


}

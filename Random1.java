package paket;
import java.util.Random;

public class Random1 implements IRandom{
	int sicak;
	public void RandomSayiUret() {
		Random rnd=new Random();
	    sicak=rnd.nextInt(0,51);
	}
}

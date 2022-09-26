package Ex02;

public class JinLamunAdapter implements Lamun {
	   
	   private JinLamun jinLamun;

	   
	   
	   public JinLamunAdapter(JinLamun jinLamun) {
	      this.jinLamun = jinLamun;
	   }



	   @Override
	   public void cook() {
	      jinLamun.cook();
	      System.out.println("계란추가");
	      
	   }

	}

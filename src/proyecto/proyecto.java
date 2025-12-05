package proyecto;

public class proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int f = 0; f < 20; f++) {
			int num = (int) (Math.random() * 10 ) + 1;
			System.out.println("Número " + (f + 1) + ": " + num);
		}
	}

}

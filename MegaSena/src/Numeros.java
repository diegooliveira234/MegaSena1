import java.util.Random;

public class Numeros {
	public String numeros() {
		Random num = new Random();
		String n1 =Integer.toString(num.nextInt(60));
		String n2 =Integer.toString(num.nextInt(60));
		String n3 =Integer.toString(num.nextInt(60));
		String n4 =Integer.toString(num.nextInt(60));
		String n5 =Integer.toString(num.nextInt(60));
		String n6 =Integer.toString(num.nextInt(60));
		return n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6;
	}
public void mostrarNumeros() {
	System.out.println(" Os números da sorte são: "+numeros());
}
}

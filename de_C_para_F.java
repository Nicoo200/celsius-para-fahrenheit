package C_para_F;

 import java.util.Scanner;
 
public class de_C_para_F {

	public static void main(String[] args) {
	
		Scanner x = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Graus Celsius");
		double cl = x.nextDouble();
		
		
		double F = cl * 9/ 5+32;
		
		
		System.out.print("O valor de celsius para Fahrenheit é:" + F);
		
	}

}

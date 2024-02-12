import java.util.Scanner;

public class EjercicioClase6{
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String saborHelado;
		System.out.println("Cual es tu sabor de helado favorito? ");
		saborHelado=in.nextLine();
		System.out.println("Tu sabor elegido fue: "+saborHelado);
		
		double porcentajComision;
		System.out.println("Cual es tu porcentaje de comision en la venta? ");
		porcentajComision=in.nextDouble();
		System.out.println("Tu porcentaje de comision es: "+porcentajComision);
	}
}
		
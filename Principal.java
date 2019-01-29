package ejercicioArrayList2;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Double> aReales = new ArrayList <Double> ();
		Scanner teclado = new Scanner(System.in);
		double dob;
		int num,onum = 0;
		System.out.println("soy rama 2");
		do
		{
			
			System.out.println("Introduce una opción:");
			System.out.println("1 Inserta un número");
			System.out.println("2 Buscar un número");
			System.out.println("3 Modificar un número");
			System.out.println("4 Borrar un número");
			System.out.println("5 Inserta un número en un posición dada");
			System.out.println("6 Salir");
					
			System.out.println("Introduce numero ");
			num = Integer.parseInt(teclado.nextLine());
	
			switch (num)
			{
			case 1:
				System.out.println("Introduce el número a insertar");
				dob = Double.parseDouble(teclado.nextLine());
				aReales.add(dob);
				break;		
			case 2:
				System.out.println("Introduce el número a buscar");
				dob = Double.parseDouble(teclado.nextLine());				 
				if (aReales.contains(dob))
				{
					onum = aReales.indexOf(dob);
					System.out.println("El número" + dob  + "está en la posición " + onum);
				}
				else
				{
					System.out.println("El número " + dob + "no se encuentra en la lista.");
				}
				
				break;	
			case 3:
				System.out.println("Introduce el número a modificar");
				dob = Double.parseDouble(teclado.nextLine());				 
				if (aReales.contains(dob))
				{
					onum = aReales.indexOf(dob);
					System.out.println("Introduce el número nuevo");
					dob = Double.parseDouble(teclado.nextLine());
					aReales.set(onum, dob);
				}
				else
				{
					System.out.println("El número " + dob + "no se encuentra en la lista.");
				}
				
				break;	
			case 4:
				System.out.println("Introduce el número a borrar");
				dob = Double.parseDouble(teclado.nextLine());
				if (aReales.contains(dob))
					aReales.remove(dob);
				else
				{
					System.out.println("No existe el número a borrar");
				}
				break;	
			case 5:
				System.out.println("Introduce una posición a insertar");
				onum = Integer.parseInt(teclado.nextLine());
				if (onum < aReales.size())
				{
					System.out.println("Introduce el número a insertar");
					dob = Double.parseDouble(teclado.nextLine());
					aReales.add(onum, dob);
				}
				else
				{
					System.out.println("No se puede insertar en esa posición");
					
				}
				break;
			case 6: 
				break;
			default: System.out.println("Número erroneo.");
				
			}
			for (Double d : aReales)
			{
				System.out.println(d);
			}
			
		}		
		while (num != 6);
		
		
		

	}

}

package examen;
import java.util.Scanner;
public class Conversio {

	public static void main(String[] args) {
		//Declaro la variable opcion
		String opcion;
		//Preparo los do scanners que vamos a usar
		Scanner sc=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		//Y declaro la variable que vamos a utilizar para los euros que ponga el user
		double eur;
		//Damos entrada al programa, y explicamos las reglas
		System.out.println("------------------------------------------------------------");
		System.out.println("|Esta aplicacion sirve para pasar de euros a dolares/libras|");
		System.out.println("|Introducca cuantos euros desea convertir		   |");
		System.out.println("|Y los convertiremos por usted				   |");
		System.out.println("------------------------------------------------------------");
		System.out.println("Introducca aqui: ");
		//Guardo el scann euros, con lo que me haya puesto el usuario
		eur=num.nextDouble();
		//Doy entrada ha que escoja una opcion
		System.out.println("------------------------------------------");
		System.out.println("|Usted va a cambiar "+eur+"€                 |");
		System.out.println("|Si quiere cambiar a dolares introducca A|"+"\n"+"|Si quiere pasar a libras introducca B   |");
		System.out.println("|Recuerde poner la opcion en mayuscula   |");
		System.out.println("------------------------------------------");
		System.out.println("Introducca aqui: ");
		//Guardo la opcion,con lo que me haya escrito
		opcion=sc.nextLine();
		//Declaro variables a la vez que les doy un valor en este caso sera euros * la conversion de la moneda
		double dolares=eur*1.18;
		double libras=eur*0.90;
		//Cambio la opcion de String a Char y cojo el numero 0 de esa cadena de caracteres
		char A=opcion.charAt(0);
		//Por ultimo escribo el mensaje final que sera la conversion a dolares en caso de que haya pulsado A, la conversion a libras en caso de que haya pulsado B o mensaje de error en caso de que no sea niguna de las dos
		System.out.println(A=='A'?"Tus "+eur+"€ son "+dolares+"$":A=='B'?"Tus "+eur+"€ son "+libras+" LBR":"Lo siento marca una opcion valida, reinicia el programa");			
	}

}

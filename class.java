package Java;

import java.util.Scanner;

public class Adivinar {

	public static void main(String[]args) {

		//Declaro la variable con la funcion que hara que me guarde dentro de esta un numero random de entre el 1 y el 10

		int numrandom=(int)(Math.random()*10+1);

		//Creo una variable que me servira para saber si he hacertado el numero 

		boolean correcto = false;

		//Imprimo por pantalla las reglas del juego

		System.out.println("Reglas del jugo\n1.Se va a generar un nuero aleatorio entre el 1 y el 10\n2.Tienes 4 intentos para adivinarlo");

		//Hago un scanner para que el usuario pueda escribir su intento

		Scanner num1=new Scanner(System.in);

		//Guardo en un in el numero que me haya escrito

		int intento1=num1.nextInt();

		//Hago un syso con un condicional, si el numero que ha puesto el user es igual que el random no imprime nada por que lo imprimira al final 

		//y si no lo es da mensaje de fallo

		System.out.println((intento1==numrandom)?"":"Lo siento no es el numero correcto vuelve a intentarlo2");

		//Aqui estoy diciendo que correcto sera true en caso de que la anterior condicion lo sea y false en caso contrario

		correcto=(intento1==numrandom);

		//Escaneo el numero siguiente que me vaya a escribir el usuario

		Scanner num2=new Scanner(System.in);

		//Declaro una variable con una condicion si correcto es falso que guarde lo que haya en el scaner

		//(en caso de que sea true no se pararia en el scaner por que no habria donde guardarlo)

		//Y si correcto es true intento2 tendra el valor de numrandom

		int intento2=(correcto==false)?num2.nextInt():numrandom;

		//Hago un syso con un condicional, si el numero que ha puesto el user es igual que el random no imprime nada por que lo imprimira al final 

		//y si no lo es da mensaje de fallo

		System.out.println((intento2==numrandom)?"":"Lo siento no es el numero correcto vuelve a intentarlo3");

		//Aqui estoy diciendo que correcto sera true en caso de que la anterior condicion lo sea y false en caso contrario

		correcto=(intento2==numrandom);

		//Escaneo el numero siguiente que me vaya a escribir el usuario

		Scanner num3=new Scanner(System.in);

		//Declaro una variable con una condicion si correcto es falso que guarde lo que haya en el scaner

		//(en caso de que sea true no se pararia en el scaner por que no habria donde guardarlo)

		//Y si correcto es true intento2 tendra el valor de numrandom

		int intento3=(correcto==false)?num3.nextInt():numrandom;

		//Hago un syso con un condicional, si el numero que ha puesto el user es igual que el random no imprime nada por que lo imprimira al final 

		//y si no lo es da mensaje de fallo

		System.out.println((intento3==numrandom)?"":"Lo siento no es el numero correcto vuelve a intentarlo4");

		//Aqui estoy diciendo que correcto sera true en caso de que la anterior condicion lo sea y false en caso contrario

		correcto=(intento3==numrandom);

		//Escaneo lo que me vaya a poner el usuario

		Scanner num4=new Scanner(System.in);

		//Declaro una variable a la vezque le doy valor con una condicion si correcto es false que guarde lo del scan y si es true que guarde el numerandom

		int intento4=(correcto==false)?num4.nextInt():numrandom;

		//Hago un syso con un condicional, si el numero que ha puesto el user es igual que el random imprimira el mensaje de victoria finalmente

		//y si no lo es da mensaje de volver a jugar

		System.out.println((intento4==numrandom)?"Felicidades has adivinado el numero":"Vuelve a jugar");

	}

}

/* 
este código es realizado por Juan Leonardo Ramirez Velasquez
se usa .equals para comparar los strings o objetos que se encuentran en el ćódigo
se puede ejecutar suma,resta,división y multiplicación de la linea 111 a la 162 se encuentra el códgio 
*/
import java.util.Scanner;
//puedes usar esta libreria también solo se coloca el * por comodidad del creador del código
//import java.util.Objects
import java.util.*;

public class bot
{
	public static void main(String[] args) 
	{
		String escribir;//variable para que reciba comando escritos del usuario
		boolean salir=false;//variable boolean para que siempre empieze de nuevo
		String nombre;//metodo nombre del usuario
		String botnombre;// metodo nombre del bot
		Scanner t = new Scanner(System.in);// objeto scanner 


			System.out.println("████████████████████████████████████████");
			System.out.println("████████████████████████████████████████");
			System.out.println("██████▀░░░░░░░░▀████████▀▀░░░░░░░▀██████");
			System.out.println("████▀░░░░░░░░░░░░▀████▀░░░░░░░░░░░░▀████");
			System.out.println("██▀░░░░░░░░░░░░░░░░▀▀░░░░░░░░░░░░░░░░▀██");
			System.out.println("██░░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░██");
			System.out.println("██░░░░░░░░░░░░░░░░░░█░█░░░░░░░░░░░░░░░██");
			System.out.println("██░░░░░░░░░░░░░░░░░▄▀░█░░░░░░░░░░░░░░░██");
			System.out.println("██░░░░░░░░░░████▄▄▄▀░░▀▀▀▀▄░░░░░░░░░░░██");
			System.out.println("██▄░░░░░░░░░████░░░░░░░░░░█░░░░░░░░░░▄██");
			System.out.println("████▄░░░░░░░████░░░░░░░░░░█░░░░░░░░▄████");
			System.out.println("██████▄░░░░░████▄▄▄░░░░░░░█░░░░░░▄██████");
			System.out.println("████████▄░░░▀▀▀▀░░░▀▀▀▀▀▀▀░░░░░▄████████");
			System.out.println("██████████▄░░░░░░░░░░░░░░░░░░▄██████████");
			System.out.println("████████████▄░░░░░░░░░░░░░░▄████████████");
			System.out.println("██████████████▄░░░░░░░░░░▄██████████████");
			System.out.println("████████████████▄░░░░░░▄████████████████");
			System.out.println("██████████████████▄▄▄▄██████████████████");
			System.out.println("████████████████████████████████████████");
			System.out.println("████████████████████████████████████████");

			System.out.println("Diviertete un poco con :");
			System.out.println("▒█▀▀█ █▀▀█ ▀▀█▀▀ █▀▀ ░▀░ ▀▀█▀▀ █▀▀█"); 
			System.out.println("▒█▀▀▄ █░░█ ░░█░░ █░░ ▀█▀ ░░█░░ █░░█"); 
			System.out.println("▒█▄▄█ ▀▀▀▀ ░░▀░░ ▀▀▀ ▀▀▀ ░░▀░░ ▀▀▀▀"); 
			System.out.println("Te recordamos que esto no es una IA solo es bot con respuestas muy tontas");
			System.out.println("Programado Por Juan Leonardo Ramírez");
			System.out.println("puedes crear y modificar los mensajes a tu gusto en:");
			System.out.println("GitHub: https://github.com/LeoRami99/Bot-Java");
			System.out.println("Si escribes y no te lanza algun resultado es por que no se ha creado ese comando");
			System.out.println("Cuando escribas el comando no dejes espacio al final");
			System.out.println("Para salir presiona Ctrl+c");
			System.out.print("*Introduce tu nombre:");
			nombre=t.nextLine();
			System.out.print("-¿Como quieres que me llame?:");
			botnombre=t.nextLine();

				do
				{
						System.out.print("-Tu:");
						escribir=t.nextLine();
						if (escribir.equals("Hola") || escribir.equals("Hey") || escribir.equals("que onda") || escribir.equals("hola") ) 
						{ 
							System.out.print(botnombre+": ");
				  			System.out.println("Hola " + nombre);
						}

						if (escribir.equals("Ella me ama") || escribir.equals("ella me ama")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("No "+nombre+" ella no te ama");	
						}
						if (escribir.equals("El me ama") || escribir.equals("el me ama")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("No "+nombre+" el no te ama");	
						}
						if (escribir.equals("cuentame un chiste") || escribir.equals("Cuentame un chiste")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Oye "+nombre+" no tengo buen sentido del humor");
							System.out.print(botnombre+": ");
							System.out.println("Oye "+nombre+" Pero se quien puede");
							System.out.print(botnombre+": ");
							System.out.println("Exacto google :v");	
						
						}
						if (escribir.equals("Como estas") || escribir.equals("como estas")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Bien "+nombre+" y tu");	
						}
						if (escribir.equals("bien") || escribir.equals("bien")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Me alegra "+nombre);	
						}
						if (escribir.equals("que puedes hacer") || escribir.equals("Que puedes hacer")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Pues la verdad "+nombre+ " no se hacer nada");	
						}
						if (escribir.equals("que puedo hacer para que ella me ame") || escribir.equals("Que puedo hacer para que ella me ame")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Puees! "+nombre+ " yo no soy bueno dando esos consejos");
							System.out.print(botnombre+": ");
							System.out.println(nombre+ " Pero no te preocupes llegara alguien para ti");	
						}
						if (escribir.equals("como me llamo") || escribir.equals("Como me llamo")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Puees! "+nombre+ "¿No?");
						}
						if (escribir.equals("Quien te creo") || escribir.equals("quien te creo")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Juan Leonardo Ramirez Velasquez");
							System.out.print(botnombre+": ");
							System.out.println("en persona es bien guapote");
							System.out.print(botnombre+": ");
							System.out.println("apuesto que te gustaria conocerlo");
							System.out.print(botnombre+": ");
							System.out.println("pero el es muy ocupado");
						}
						if (escribir.equals("Idiota") || escribir.equals("idiota")) 
						{
							System.out.print(botnombre+": ");
							System.out.println(":,(");
							System.out.print(botnombre+": ");
							System.out.println("pudrete >:)");
						}
						if (escribir.equals("suma") || escribir.equals("Suma")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Vamos");
							double num1sum, num2sum, resultsum;
							System.out.println("Numero 1:");
							num1sum=t.nextDouble();
							System.out.println("Numero 2:");
							num2sum=t.nextDouble();
							resultsum=num1sum+num2sum;
							System.out.print(botnombre+": ");
							System.out.println("Hay tienes la respuesta: "+resultsum);
						}
						if (escribir.equals("multiplicacion") || escribir.equals("Multiplicacion")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Vamos");
							double num1mul, num2mul, resultmul;
							System.out.println("Numero 1:");
							num1mul=t.nextDouble();
							System.out.println("Numero 2:");
							num2mul=t.nextDouble();
							resultmul=num1mul*num2mul;
							System.out.print(botnombre+": ");
							System.out.println("Hay tienes la respuesta: "+resultmul);
						}
						if (escribir.equals("Divsion") || escribir.equals("division")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Vamos");
							double num1div, num2div, resultdiv;
							System.out.println("Numero 1:");
							num1div=t.nextDouble();
							System.out.println("Numero 2:");
							num2div=t.nextDouble();
							resultdiv=num1div/num2div;
							System.out.print(botnombre+": ");
							System.out.println("Hay tienes la respuesta: "+resultdiv);
						}
						if (escribir.equals("Resta") || escribir.equals("resta")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Vamos");
							double num1res, num2res, resultres;
							System.out.println("Numero 1:");
							num1res=t.nextDouble();
							System.out.println("Numero 2:");
							num2res=t.nextDouble();
							resultres=num1res-num2res;
							System.out.print(botnombre+": ");
							System.out.println("Hay tienes la respuesta: "+resultres);
						}
						if (escribir.equals("Ayuda") || escribir.equals("ayuda")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Ayuda! "+nombre+ " es enserio");
							System.out.print(botnombre+": ");
							System.out.println(nombre+ " pense que tenias capacida para resolver tus problemas");
							System.out.print(botnombre+": ");
							System.out.println(nombre+ " lamento pero no voy a hacer nada");
						}
						if (escribir.equals("puedes aprender") || escribir.equals("Puedes aprender")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Aun no tengo ese privilegio");
							System.out.print(botnombre+": ");
							System.out.println("pero para mas adelante si");
						}
						if (escribir.equals("root") || escribir.equals("Root")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Ahora eres idiota pero con privilegios");
							System.out.print(botnombre+": ");
							System.out.println("No te creas solo eres un simple usuario");
							System.out.print(botnombre+": ");
							System.out.println("y los seguiras siendo hasta que mueras ");
						}
						if (escribir.equals("puedo ver tu codigo") || escribir.equals("Puedo ver tu codigo")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Claro aqui esta");
							System.out.print(botnombre+": ");
							System.out.println("printf('Hola mundo');");
							System.out.print(botnombre+": ");
							System.out.println("vaya que codigo tan complejo");
						}
						if (escribir.equals("puedes leer el futuro") || escribir.equals("Puedes leer el futuro")) 
						{
							System.out.print(botnombre+": ");
							System.out.println("Claro");
							System.out.print(botnombre+": ");
							System.out.println("solo escribe mi futuro");
							System.out.print(botnombre+": ");
						}
						if (escribir.equals("mi futuro") || escribir.equals("Mi futuro")) 
						{
							System.out.print(botnombre+": ");
							System.out.println(":O");
							System.out.print(botnombre+": ");
							System.out.println("mmmmmm veo que no vas a estar junto a su lado");
							System.out.print(botnombre+": ");
							System.out.println("Oh! vaya que idiota eres :|");
						}
						if (escribir.equals(".") || escribir.equals(".")) 
						{
							//hola
						}
				}while(true);
		}	
	public static String nombre(String nombre)
	{
		return nombre;
	}
	public static String botnombre(String botnombre)
	{
		return botnombre;
	}
}

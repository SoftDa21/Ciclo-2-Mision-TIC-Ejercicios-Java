import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args){
        
        Ejercicio();

    }   
        private static void Ejercicio(){

            System.out.println("------------------EJERCICIOS CLASE 1------------------");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ejercicio 6");
            System.out.println("Ejercicio 7");
            System.out.println("Ejercicio 8");
            System.out.println("Ejercicio 9");
            System.out.println("Ejercicio 10");
            System.out.println("Ejercicio 11");
            System.out.println("Ejercicio 12");
            System.out.println("Ejercicio 13");
            System.out.println("Ejercicio 14");
            System.out.println("Ejercicio 15");
            System.out.println("-----------------------------------------------------");
    
            System.out.print("Seleccione un ejercicio: ");  
            
            

        var sc = new Scanner(System.in);
        var opcion = sc.nextLine();

        
        switch(opcion){

            case "1":
                
                System.out.println("EJERCICIO 1");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Implemente un algoritmo que dado un nombre en una variable de tipo cadena, imprima un saludo en consola");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.print("Ingresa tu nombre: ");
                var nombre = new Scanner(System.in);
                var nombre1 = sc.nextLine();

                System.out.println("Hola, " + nombre1 + ". ¿Cómo estás?");

                nombre.close();

            break;
            
            case "2":

                System.out.println("EJERCICIO 2");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Implemente un algoritmo que reciba un número por teclado y cuente cuántas cifras (o dígitos) contiene e imprima el mensaje en consola.");
                System.out.println("--------------------------------------------------------------------");
            break;

            case "3":

                System.out.println("EJERCICIO 3");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.");
                System.out.println("--------------------------------------------------------------------");
                System.out.print("Ingresa un número: ");
                var num = new Scanner(System.in);
                int num1 = num.nextInt();
                var mult2 = 2*num1;
                var mult3 = 3*num1;
                
                System.out.println("El doble del número ingresado es: " + mult2);
                System.out.println("El triple del número ingresado es: " + mult3);

                num.close();
            
            break;

            case "4":

                System.out.println("EJERCICIO 4");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Escribe un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.print("Ingresa la temperatura: ");
                var cent = new Scanner(System.in);
                var cent1 = cent.nextInt();
                float fahr =(9 * cent1 / 5) + 32;

                System.out.println("La temperatutra ingresada convertida a grados Fahrenheit es igual a: " + fahr + "F");

                cent.close();

            break;

            case "5":

                System.out.println("EJERCICIO 5");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Escribe un programa java que lea una variable de tipo entero por teclado A continuación muestra un mensaje indicando si la variable es par o impar. Utiliza el operador condicional ( ? : ) para resolverlo. Ej: '14 es par' o '15 es impar'");
                System.out.println("--------------------------------------------------------------------");

            break;

            case "6":

                System.out.println("EJERCICIO 6");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado y mostrar en pantalla 'La <operación> de <número 1> y <número 2> es igual a <resultado>'");

                System.out.print("Ingresa el primer número: ");
                var numero1 = new Scanner(System.in);
                var nume1 = numero1.nextInt();
                System.out.print("Ingresa el segundo número: ");
                var numero2 = new Scanner(System.in);
                var nume2 = numero2.nextInt();

                var suma = (nume1 + nume2);
                var resta = (nume1 - nume2);
                float divi = (nume1 / nume2);
                var multi = (nume1 * nume2); 

                System.out.println("La SUMA de " + nume1 + " y " + nume2 + " es igual a: " + suma);
                System.out.println("La RESTA de " + nume1 + " y " + nume2 + " es igual a: " + resta);
                System.out.println("La DIVISIÓN de " + nume1 + " y " + nume2 + " es igual a: " + divi);
                System.out.println("La MULTIPLICACIÓN de " + nume1 + " y " + nume2 + " es igual a: " + multi);

            
            break;

        }

        sc.close();
    
    }    
}

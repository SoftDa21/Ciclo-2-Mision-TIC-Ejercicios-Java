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
                System.out.println("Implemente un algoritmo que dado un nombre en una variable de tipo cadena, imprima un saludo en consola");
                System.out.print("Ingresa tu nombre: ");
                var nombre = new Scanner(System.in);
                var nombre1 = sc.nextLine();

                System.out.println("Hola, " + nombre1 + ". ¿Cómo estás?");

                nombre.close();
                break;

        }

        sc.close();
    
    }    
}

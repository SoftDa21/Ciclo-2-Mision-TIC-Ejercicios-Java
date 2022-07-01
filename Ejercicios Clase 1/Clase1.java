import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        
        
    }
    private static void CondicionalIf(){
        var sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El número es negativo.");
        }else if (numero > 0){
            System.out.println("El número es positivo.");
        }else{
            System.out.println("El número es cero.");
        }

        sc.close();
    }

    private static void CondicionalSwitch(){
        var sc = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        var letra = sc.nextLine();
        
      

        switch (letra.toLowerCase()){
            case "a":
            case "e": 
            case "i":             
            case "o":         
            case "u":
                System.out.println("Es una vocal.");
            break;

            default:
                System.out.println("Es una consonante.");
        }


        sc.close();   
    }

    private static void CicloWhile(){
        var numero = 5;

        while (numero > 0){
            System.out.println(numero);
            numero--;
        }
        System.out.println("¡BOOM!");
    }
    
    private static void CicloDoWhile(){
        var numero = 10;

        do{
            System.out.println(numero);
            numero--;
        }while (numero > 0);
        System.out.println("¡Despegue!");
    }

    private static void CicloFor(){
        
        for(var numero = 5; numero > 0; numero--){
            System.out.println(numero);
        }
        System.out.println("¡BOOOOOOOOOOM!");
    }

    private static void CicloForEach(){
        var frutas = new String[]{
            "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
        };
        for (var fruta : frutas){
            System.out.println("La fruta es: "+fruta);
        }
    }

}

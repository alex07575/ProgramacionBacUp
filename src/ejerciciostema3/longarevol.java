package ejerciciostema3;
import java.util.Scanner;
public class longarevol {
    public static void main(String[] arg){
       escribeMenu(); 
    }
    
    static void escribeMenu(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Longitud de la circunfecia: ");
        System.out.println("Area del circulo: ");
        System.out.println("Area de la esfera: ");
        System.out.println("Area del cilindro: ");
        System.out.println("Volumen de la esfera: ");
        System.out.println("Volumen del cilindro: ");
        System.out.println("Nueva radio: ");
        System.out.println("Terminar: ");
        System.out.println("Escribe un numero: ");
        op = sc.nextInt();
        casos(op);
    }
    static void casos(int op){
        Scanner sc = new Scanner(System.in);
        double resultado;
        double altura;
        System.out.println("Escribe el radio: ");
        double radio = sc.nextDouble();
        switch (op){
            case 1 -> {
                resultado = 2 * Math.PI * radio;
                System.out.println(resultado);
            }
            case 2 -> {
                resultado = Math.PI * Math.pow(radio, 2);
                System.out.println(resultado);
            }
            case 3 -> {
                resultado = 4 * Math.PI * Math.pow(radio, 2);
                System.out.println(resultado);
            }
            case 4 -> {
                System.out.println("Escribe la altura :");
                altura = sc.nextInt();
                resultado = 2 * Math.PI * radio * (radio + altura);
                System.out.println(resultado);
            }
            case 5 -> {
                resultado = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
                System.out.println(resultado);
            }
            case 6 -> {
                System.out.println("Escribe la altura: ");
                altura = sc.nextInt();
                resultado = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println(resultado);
            }
            case 7 -> {
                System.out.println("Escribe el nuevo radio :");
                radio = sc.nextDouble();
            }
            case 8 -> {
                System.out.println("Opcion no valida, intenta de nuevo");
            }
        }
    }
}

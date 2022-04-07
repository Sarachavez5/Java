import java.util.Scanner;

public class calculaSigno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        // System.out.println("Este es tu dia de nacimiento "+ dia);
        int mes = scanner.nextInt();
        //System.out.println("Este es tu mes de nacimiento " + mes);

        switch (mes) {
            case 1:
                System.out.println("Tu eres de Enero");
                if(dia >= 1 && dia <= 20){
                    System.out.println("You are Capricorn");
                }
                else if(dia > 20 && dia <= 31){
                    System.out.println("You are Acuario");
                }
                else{
                    System.out.println("Te saliste del rango");
                }
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
            System.out.println("Dato no encontrado");
                break;
        }
    }
}

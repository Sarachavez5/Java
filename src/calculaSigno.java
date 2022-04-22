import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.io.InputStream;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;

public class calculaSigno {

    public static void main(String[] args) throws FileNotFoundException {
        int Opc;
        System.out.println("\n               MENU  \n");
        System.out.println(" 1. Para saber su signo Zodiacal ");
        System.out.println(" 2. Para saber sus días vividos");
        System.out.println(" 3. Para saber sus años en perro");
        System.out.println(" 4. Hallar su número de nacimiento");
        // int Opc = teclado.nextInt();
        Opc = Integer.parseInt(JOptionPane.showInputDialog("OPCIONES"));
        System.out.println("Ingrese su día de nacimiento");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("DIA"));
        // System.out.println("Este es tu dia de nacimiento "+ dia);
        System.out.println("Ingrese su mes de nacimiento");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("MES"));
        // System.out.println("Este es tu mes de nacimiento " + mes);
        System.out.println("Ingrese su año de nacimiento");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("AÑO"));
        switch (Opc) {
            case 1:
                /*
                 * System.out.println("Ingrese su día de nacimiento");
                 * int dia = Integer.parseInt(JOptionPane.showInputDialog("DIA"));
                 * // System.out.println("Este es tu dia de nacimiento "+ dia);
                 * System.out.println("Ingrese su mes de nacimiento");
                 * int mes = Integer.parseInt(JOptionPane.showInputDialog("MES"));
                 * //System.out.println("Este es tu mes de nacimiento " + mes);
                 */

                switch (mes) {
                    case 1:
                        System.out.println("Tu eres de Enero");
                        if (dia >= 1 && dia <= 20) {
                            System.out.println("eres capricornio");
                        } else if (dia > 20 && dia <= 31) {
                            System.out.println("eres acuario");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 2:
                        System.out.println("Febrero");
                        if (dia >= 1 && dia < 20) {
                            System.out.println("Eres acuario");
                        } else if (dia >= 20 && dia <= 28) {
                            System.out.println("Eres piscis");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 3:
                        System.out.println("Marzo");
                        if (dia >= 1 && dia <= 20) {
                            System.out.println("Eres piscis");
                        } else if (dia > 20 && dia <= 31) {
                            System.out.println("Eres aries");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 4:
                        System.out.println("Abril");
                        if (dia >= 1 && dia <= 20) {
                            System.out.println("Eres aries");
                        } else if (dia > 20 && dia < 31) {
                            System.out.println("Eres tauro");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 5:
                        System.out.println("Mayo");
                        if (dia >= 1 && dia <= 21) {
                            System.out.println("Eres tauro");
                        } else if (dia >= 22 && dia <= 31) {
                            System.out.println("Eres geminis");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 6:
                        System.out.println("Junio");
                        if (dia >= 1 && dia <= 21) {
                            System.out.println("Eres géminis");
                        } else if (dia >= 22 && dia <= 30) {
                            System.out.println("Eres cáncer");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 7:
                        System.out.println("Julio");
                        if (dia >= 1 && dia <= 22) {
                            System.out.println("Eres cáncer");
                        } else if (dia >= 23 && dia <= 31) {
                            System.out.println("Eres leo");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 8:
                        System.out.println("Agosto");
                        if (dia >= 1 && dia <= 23) {
                            System.out.println("Eres leo");
                        } else if (dia >= 24 && dia <= 31) {
                            System.out.println("Eres virgo");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        if (dia >= 1 && dia <= 23) {
                            System.out.println("Eres virgo");
                        } else if (dia >= 24 && dia <= 30) {
                            System.out.println("Eres libra");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 10:
                        System.out.println("Octubre");
                        if (dia >= 1 && dia <= 23) {
                            System.out.println("Eres libra");
                        } else if (dia >= 24 && dia <= 31) {
                            System.out.println("Eres escorpio");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        if (dia >= 1 && dia <= 22) {
                            System.out.println("eres escorpio");
                        } else if (dia >= 23 && dia <= 30) {
                            System.out.println("Eres sagitario");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        if (dia >= 1 && dia <= 21) {
                            System.out.println("eres sagitario");
                        } else if (dia >= 22 && dia <= 31) {
                            System.out.println("eres capricornio");
                        } else {
                            System.out.println("Te saliste del rango");
                        }
                        break;
                    default:
                        System.out.println("Por favor ingrese un mes valido");
                        break;
                }
                break;
            case 2:
                LocalDate naci = LocalDate.of(anio, mes, dia);
                LocalDate actu = LocalDate.now();
                Long totalDeDias = ChronoUnit.DAYS.between(naci, actu);
                System.out.println("Tu numero de dias Vividos es " + totalDeDias);
                break;
            case 3:
                LocalDate naciP = LocalDate.of(anio, mes, dia);
                LocalDate actuP = LocalDate.now();
                int conver = (int) ChronoUnit.DAYS.between(naciP, actuP);
                System.out.println((conver / 365) / 7);
                break;
        }
    }
}

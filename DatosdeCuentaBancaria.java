/*
 Saludos. Desarrolle el algoritmo que le permita ingresar 
los datos de su cuenta de Banco.
 */
package datosdecuentabancaria;

/**
 *
 * @author: Ana Graciela Pico Solis
 */
import java.util.Scanner;
public class DatosdeCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado= 1520;
        Scanner objeto=new Scanner(System.in); //New es almacenamiento de memoria
        System.out.println("Banco de Ambato");
        System.out.println("Datos del cliente");
        
        System.out.println("Ingrese su nombre completo:");
        String nombrecompleto=objeto.nextLine();
        
        System.out.println("Ingrese su número de cédula:");
        String numerodecedula=objeto.nextLine();
        
        System.out.println("Ingrese su número de cuenta:");
        String numerodecuenta=objeto.nextLine();
        
        System.out.println("Su saldo en la cuenta es de:"+resultado);//Dolares
        
        
        
    }
    
}

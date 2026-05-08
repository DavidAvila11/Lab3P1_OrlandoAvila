/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_orlandoavila;
import java.util.Scanner;
/**
 *
 * @author Avila
 */
public class Lab3P1_OrlandoAvila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. La puerta misteriosa.");
        System.out.println("2. Sumatoria.");
        System.out.println("3. Arco y Flecha.");
        System.out.println("4. Salir.");
        int opcion = sc.nextInt(); 
        while (opcion!=4){
            switch (opcion){
                case 1: {
                    System.out.println("Ingrese la cantidad de terminos (N > 0:)");
                    int terminos = sc.nextInt();
                    if (terminos > 0){
                        System.out.println("Ingrese un numero mayor que 0:");                      
                    }// Fin de if
                    System.out.println("Resultado de la sucesion: ");
                    
                    int primerNum = 3;
                    int segundoNum = 0;
                    int tercerNum = 2;
                    int temp;
                    for (int i = 0; i < terminos; i++) {
                        if (i == 1) {
                            System.out.println(primerNum);
                        } else if (i == 2) {
                            System.out.println(segundoNum);
                        } else if (i == 3) {
                            System.out.println(tercerNum);
                        } else {
                            temp = primerNum + segundoNum;
                            System.out.println(temp);
                            primerNum = segundoNum;
                            segundoNum = tercerNum;
                            tercerNum = temp;
                        }// fin de If
                    }
                }// fin de case 1
            }// fin de switch  
        }// fin de while
    }// fin de void  
}// fin de clase

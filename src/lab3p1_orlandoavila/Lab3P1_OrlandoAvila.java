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
                break;
                case 2: {
                    System.out.println("Ingrese el limite (n):");
                    int Numpositivo = sc.nextInt();
                    double suma = 0; 
                    double cont = 0;
                    for (int i = 1; i<=Numpositivo; i++){
                        double numerador = (((i*i)+(3*i)+1)*(i+2));
                        double denominador = ((2*i)+1); 
                        double fact = 1;
                        for (double j = 1; j<=denominador; j++){
                            fact *= j;                             
                        }// fin de segundo for
                        suma += numerador / fact;
                        cont += suma;
                    System.out.println("n=" +i+ "suma = " + suma );
                    }// fin de primer for
                    System.out.println("La suma de los numeros es de: "+ cont);
                }// fin de case 2
                break;
                case 3: { 
                    int tamano;
                    System.out.println("Ingrese tamaño: ");
                    tamano = sc.nextInt();
                    while (tamano >= 7){                  
                        for(int i = 0; i <= tamano; i++){
                            for(int j = 0; j <= tamano; j++){
                                if (j==0){
                                    System.out.print("* ");
                                }    
                                else if(i==tamano-1){
                                    System.out.print("* ");
                                }
                                else if(i==j){
                                    System.out.print("* ");
                                }
                                else if(j==tamano-i-1){
                                    System.out.print("* ");
                                }
                                else if(i==0 && j>=tamano-3){
                                    System.out.print("* ");
                                }
                                else if(i==1 && j>=tamano-2){
                                    System.out.print("* ");
                                }
                                else{
                                    System.out.print(" ");
                            }
                        }
                        System.out.println();
                }
                        System.out.println();
                    }// fin de while
                    System.out.println();
                }// fin de case 3
                break;
            }// fin de switch  
        }// fin de while
    }// fin de void  
}// fin de clase

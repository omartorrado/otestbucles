/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blucles;

import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Blucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escoje un numero");
        int number=sc.nextInt();
        while (n<=10){
            System.out.println(number+" x "+n+" = "+(number*n));
            n++; 
        }
        System.out.println("Fin");
            //el incrementador lo ponemos despues para que opere del 0 al 10
            //sino lo haria del 1 al 11 pq cumple la condicion n<=10 y a continuacion 
            //incrementa antes de operar en el system.out
            //while (n<=10){
            //n++;
            //System.out.println(number+" x "+n+" = "+(number*n));
            //el "fin" ya esta fuera del bucle
        
        for (n=0;n<=10;n++){ //vuelve a poner el contador n a 0, la condicion y
            //el incremento son como los del while
            System.out.println(number+"x"+n+"="+number*n);
            number++; //hace que se incremente el numero en cada vuelta
            //el contador ya se incrementa por lo indicado en el for(n++)
        }
        System.out.println("Fin2");
        
        for (n=10;n>=0;n--){
            //pilla el number de antes, que estaria en valor numberinicial+11 
            //(el bucle de antes va del 0 al 10, 11 incrementos
            System.out.println(number+"x"+n+"="+number*n);
        }
    }
    
}

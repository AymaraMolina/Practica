/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.Scanner;

/**
 *
 * @author dyzab
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc=1;
        String pal="";
        
        Func act = new Func();        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        do {            
            System.out.println("¿Cual va a ser su valor de entrada?: "+"\n"+
                           "Seleccione uno de los valores: "+"\n"+
                           "1- Ingreso de palabras"+"\n"+"2- Ingreso de codigo genetico");
            opc = entrada2.nextInt();
        } while (opc<=0 || opc>=3);
        
        
        switch(opc){
            case 1:
                    System.out.println("Ingrese una palabra para traducirla en lenguaje de ADN");
                    pal = entrada.nextLine();

                    System.out.println("La traduccion es: "+act.palabras(pal));
                break;
            case 2:
                    System.out.println("Ingrese una cadena de ADN para pasarla a labra \n ¡Los cuatro caracteres deben estar separados por un espacio!: ");
                    pal = entrada.nextLine();

                    System.out.println("La traduccion es: "+act.codigo(pal));
                break;
            case 4: 
                System.err.println("Sistemas Op");
                break;
        }
                
        
    }
    
}

/*
Desarrolla una aplicación que pida el nombre de 2 personas. A 
continuación, las mostrará ordenadas alfabéticamente
*/
package cadena6;

import java.util.*;

public class Cadena6 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String nombre1;
        String nombre2;
        
        System.out.println("Dime un nombre");
        nombre1=teclado.nextLine();
        System.out.println("Dime otro");
        nombre2=teclado.nextLine();
        
        if(nombre1.charAt(0)<nombre2.charAt(0))
        {
            System.out.println(nombre1);
            System.out.println(nombre2);
        }else
        {
        
           System.out.println(nombre2);
           System.out.println(nombre1); 
        }
        
        
        
        
        
        
        
        
    }
    
}

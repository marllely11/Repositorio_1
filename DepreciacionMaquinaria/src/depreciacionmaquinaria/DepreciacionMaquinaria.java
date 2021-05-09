
package depreciacionmaquinaria;

import java.util.Scanner;

/**
 @author R. Marllely
 */
public class DepreciacionMaquinaria {

    public static void main(String[] args) {
        // TODO code application logic here
         double costoMaquinaria = 0;
        String nombreMaquinaria = "";
        int tiempo = 0;
        
        
        double sumaDigitos = 0;
        double porcentajeDepreciacion = 0;
        double montoDepreciacion = 0;
        int x = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Costo de la maquinaria");
        costoMaquinaria = leer.nextDouble();
        
        System.out.println(" Ingrese el nombre de la maquinaria");
        nombreMaquinaria = leer.next();
        
        System.out.println("introduzca loa años de depreciacion");
        tiempo = leer.nextInt();
        
        sumaDigitos = (tiempo * (tiempo+1))/2;
        
        System.out.println("N°"
                + " \t porcentaje"
                + "\t Monto depreciacion");
       for(int i= 1; i<=tiempo; i++){
       
           
            porcentajeDepreciacion = (i / sumaDigitos);
            montoDepreciacion = costoMaquinaria * porcentajeDepreciacion;
          
            System.out.println(x + "\t" + porcentajeDepreciacion + "\t" + montoDepreciacion);
            x = tiempo - i;
       }    
       
    }
}

    

 

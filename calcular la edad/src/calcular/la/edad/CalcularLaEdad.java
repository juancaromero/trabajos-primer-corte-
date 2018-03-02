/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular.la.edad;

import java.util.Calendar;

/**
 *
 * @author JUAN CARLOS
 */
public class CalcularLaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
    int mesActual=Calendar.FEBRUARY,añoActual=Calendar.YEAR,
            diaActual=Calendar.DAY_OF_MONTH;
    int año,dia,mes;
    int añoresultado,diaresultado,mesresultado;
    System.out.println("calcular la edad que tienes");
    System.out.println("escriba un año");
    año= sca.nextInt();
     System.out.println("escriba un dia");
     dia= sca.nextInt();
      System.out.println("escriba un mes");
     dia= sca.nextInt();
     añoresultado=Math.abs(año-añoActual);
     mesresultado=Math.abs(mes-mesActual);
     diaresultado=Math.abs(dia-diaActual);
     System.out.println("tienes"+añoresultado+"años"+","+mesresultado+
             "meses"+"y"+diaresultado+("dias"));
     
    
     
     
    
    
    }
    
}

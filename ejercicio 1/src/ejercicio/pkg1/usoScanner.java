
package ejercicio.pkg1;
import java.util.Scanner;
public class usoScanner {

   
    public static void main(String[] args) {
    Scanner sc=new  Scanner (System.in);
    float h,b,res;
    System.out.print("escriba el valor de la altura del triangulo");
    h=sc.nextFloat();
    System.out.print("escriba el valor de la base del triangulo ");
    b=sc.nextFloat();
    res=b*h/2;
    System.out.print("el area del triangulo es:"+res);
    
    
    
    }
    
}

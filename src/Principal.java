
import funcionalidades.Vehiculo;




/**
 *
 * @author Vinni
 */
public class Principal {
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "MOTO");
        
        System.out.println(v1.getPlaca());
        
        int numeros[] = new int[5];
        numeros[3] = 99;
        numeros[4] = 76;
        
        for(int i = 0;i<5;i++){
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("vehiculos");
        Vehiculo[] lista = new Vehiculo[3];
        lista[2]=v1;
        for(int i = 0;i<lista.length;i++){
            System.out.print("["+lista[i]+"]");
        }
    }
    
}

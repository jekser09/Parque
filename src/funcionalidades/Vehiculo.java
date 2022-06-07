package funcionalidades;


import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Vinni
 */
public class Vehiculo {
    private String placa;
    private Date hEntrada;
    private Date hSalida;
    private String tipo;
    
    public Vehiculo(String placa, String tipo){
        this.placa = placa;
        this.tipo = tipo;
    }
    
    public long calcularPago(int tarifa){
        
        return 0;
        
    }
//    public void setPlaca(String placa){
//       this.placa = placa; 
//    }
    public void setHEntrada(Date hEntrada){
        this.hEntrada = hEntrada;
    }
    public void setHSalida(Date hSalida){
        this.hSalida = hSalida;
    }
//    public void setTipo(String tipo){
//        this.tipo = tipo;
//    }
    public String getPlaca(){
        return this.placa;
    }
    public Date getHSalida(){
        return this.hSalida;
    }
    public String getTipo(){
        return this.tipo;
    }
    public Date getHEntrada(){
        return this.hEntrada;
    }
}

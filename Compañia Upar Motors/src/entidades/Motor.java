/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Luis F Contreras
 */
public abstract class Motor {
    private long Nserial;
    private String Marca;

    public Motor() {
    }

    public Motor(long Nserial, String Marca) {
        this.Nserial = Nserial;
        this.Marca = Marca;
    }

    
    
    public long getNserial() {
        return Nserial;
    }

    public void setNserial(long Nserial) {
        this.Nserial = Nserial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public abstract double getImporteReserva();
    public abstract String getDatosTipoMotor();
    
    public String getDatosMotor(){
     
        return  "No Serial: "+this.Nserial +"\n Marca: "+this.Marca + this.getDatosTipoMotor() ;
    
    }
    
}

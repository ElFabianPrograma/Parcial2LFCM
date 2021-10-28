/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Luis F Contreras
 */
public class MotoMecanico extends Motor{
    private double TamañoMotor;
    private String Combustible;

    public MotoMecanico() {
    }

    public MotoMecanico(long Nserial, String Marca, double TamañoMotor, String Combustible) {
        super(Nserial, Marca);
        this.Combustible;
        this.TamañoMotor
    }
    
    

    public double getTamañoMotor() {
        return TamañoMotor;
    }

    public void setTamañoMotor(double TamañoMotor) {
        this.TamañoMotor = TamañoMotor;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Comustible) {
        this.Combustible = Comustible;
    }

    @Override
    public double getImporteReserva() {
   return 0;
        }

    @Override
    public String getDatosTipoMotor() {
    return "Tamaño del Motor: "+this.TamañoMotor + "\n"+
            "Comsbustible: "+this.Combustible;
    }
    
    
}

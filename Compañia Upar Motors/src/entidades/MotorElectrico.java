/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Luis F Contreras
 */
public class MotorElectrico extends Motor{
    private int KvMinut;

    

    public MotorElectrico() {        
    }

    public MotorElectrico(long Nserial, String Marca ,int KvMinut) {
        super(Nserial,Marca);
        this.KvMinut = KvMinut;
    }

    public int getKvMinut() {
        return KvMinut;
    }

    public void setKvMinut(int KvMinut) {
        this.KvMinut = KvMinut;
    }
    
    @Override
    public double getImporteReserva() {
    return this.KvMinut*60;    
    }   

    @Override
    public String getDatosTipoMotor() {
    return "Kv x Minutos: "+this.KvMinut +"\n"+
            "Kv x Hora: "+this.getImporteReserva();
    }

    
    
}

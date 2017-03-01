/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_haroldmendoza_11541045;

/**
 *
 * @author Harold Mendoza
 */
public class Vuelo {
    protected String Ciudad_Salida;
    protected String Ciudad_Entrada;
    protected String Aerolinea;
    protected double costo;
    protected double distancia;

    public Vuelo() {
    }

    public Vuelo(String Ciudad_Salida, String Ciudad_Entrada, String Aerolinea,String costo, String distancia) {
        this.Ciudad_Salida = Ciudad_Salida;
        this.Ciudad_Entrada = Ciudad_Entrada;
        this.Aerolinea= Aerolinea;
        this.costo = Double.parseDouble(costo);
        this.distancia = Double.parseDouble(distancia);
    }

    public String getCiudad_Salida() {
        return Ciudad_Salida;
    }

    public void setCiudad_Salida(String Ciudad_Salida) {
        this.Ciudad_Salida = Ciudad_Salida;
    }

    public String getCiudad_Entrada() {
        return Ciudad_Entrada;
    }

    public void setCiudad_Entrada(String Ciudad_Entrada) {
        this.Ciudad_Entrada = Ciudad_Entrada;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "FLIGHT INFO:{" + "FROM: " + Ciudad_Salida + ", TO: " + Ciudad_Entrada + ", AIRLINE: " + Aerolinea + ", COST: " + costo + ", DISTANCE: " + distancia + '}';
    }
    
    
}

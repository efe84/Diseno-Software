package e1;

import java.util.ArrayList;

public class Billete{
    private String origen;
    private String destino;
    private float precio;
    private String fecha;

    public Billete(String origen, String destino, float precio, String fecha) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public float getPrecio() {
        return precio;
    }
    public String getFecha() {
        return fecha;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

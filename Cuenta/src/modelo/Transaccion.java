/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author DELL-PC
 */
public class Transaccion {
    private Date fecha;
    private char tipo;
    private double cantidad;

    public Transaccion(Date fecha, char tipo, double cantidad) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public Date getFecha() {
        return fecha;
    }
    public char getTipo() {
        return tipo;
    }
    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Fecha:" + new SimpleDateFormat("dd/MM/yyyy").format(this.fecha) + ", Tipo:" + tipo + ", Cantidad:" + cantidad + "\n";
    }
}

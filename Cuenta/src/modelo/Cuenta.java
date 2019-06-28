package modelo;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Cuenta {

    private String nombre;
    private int id = 0;
    private double saldo = 0;
    private double tasaInteresAnual = 0;
    private Date fechaCreacion = new Date();
    private ArrayList<Transaccion> transacciones = new ArrayList<>();

    public Cuenta() {
        
    }

    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Cuenta(int id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = (tasaInteresAnual / 100);
    }

    public double getTasaInteresMensual() {
        return this.tasaInteresAnual / 12;
    }

    public double getInteresMensual() {
        return (this.saldo) * (this.getTasaInteresMensual());
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void Retirar(double extraccion) {
        if (extraccion < this.saldo) {
            this.saldo = this.saldo - extraccion;
            Date fechaTransaccion = new Date();
            Transaccion transaccion1 = new Transaccion(fechaTransaccion, 'R', extraccion);
            transacciones.add(transaccion1);
            System.out.println("Has retirado: $" + extraccion + " de la cuenta" + " ::Transaccion registrada::" );
        } else {
            System.out.println("El saldo es insuficiente para completar la extraccion.");
        }
    }

    public void Depositar(double deposito) {
        if (deposito > 0){           
        Date fechaTransaccion = new Date();
        Transaccion transaccion1 = new Transaccion(fechaTransaccion, 'D', deposito);
        transacciones.add(transaccion1);
        System.out.println("Has depositado: $" + deposito + " en la cuenta" + " ::Transaccion registrada::");
        this.saldo = this.saldo + deposito;
        }
    }

    @Override
    public String toString() {
        return "Titular de la cuenta: \n" + this.nombre + "InteresMensual: " + this.getInteresMensual() + "\n" + "Saldo: " + this.saldo + "\nTransacciones: \n " + this.getTransacciones().toString();
    }

}

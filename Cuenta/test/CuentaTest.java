/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import modelo.Cuenta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL-PC
 */
public class CuentaTest {
    @Test
    public void test1(){ 
    Cuenta cuenta1 = new Cuenta(123,"Florencia", 1500);  // Se crea una Cuenta con id, nombre de la persona y saldo (Unitaria)
    }
    @Test
    public void test2() { //Test integrado
        Cuenta cuenta2 = new Cuenta (456, "Candela", 3500);
        long esperado = 2000; //Este es el resultado que esperamos
        cuenta2.Retirar(1500); //Retiramos efectivo 
        long resultado = (long)cuenta2.getSaldo(); //Guardamos en una variable el saldo actual de la cuenta a comparar
        assertEquals(esperado,resultado); // Comparativa de lo esperado y el resultado
    }
}

package sistema;

import modelo.Cuenta;

/**
 *
 * @author Gabriel
 */
public class Sistema {

    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1234,"Florencia", 1000);
        cuenta1.setTasaInteresAnual(5.00);
        cuenta1.Depositar(30);
        cuenta1.Depositar(40);
        cuenta1.Depositar(50);
        cuenta1.Retirar(5);
        cuenta1.Retirar(4);
        cuenta1.Retirar(2);
        
        System.out.println(cuenta1.toString());
    }
    
}

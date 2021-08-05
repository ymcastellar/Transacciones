package transacciones;

import javax.swing.*;

/**
 *
 * @author Yoyman-local
 */
public class Transacciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoActual=0, abonoActual=0;
        //int cuenta;
        //String cliente;

        int op = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO ¿QUE OPERACION DESEA REALIZAR? \n"
                + "1. Retiro \n"
                + "2. Abono \n"
                + "3. Consultar Saldo \n"
        ));
        switch (op) {
            case 1 -> {
                retiro(saldoActual);
            }
            case 2 -> {
                abono(abonoActual);
            }
            case 3 -> {
                consultarSaldo(saldoActual);
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Opcion Inválida");
            }
        }

    }

    public static double retiro(double saldoActual) {
        double cantRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad a retirar"));
        if (saldoActual < cantRetiro) {
            JOptionPane.showMessageDialog(null, "ERROR!, SALDO INSUFICIENTE");
            return saldoActual;
        }
        saldoActual = saldoActual - cantRetiro;
        JOptionPane.showMessageDialog(null, "RETIRO EXITOSO! " + saldoActual);
        return saldoActual;
    };
    
    public static void consultarSaldo(double saldoActual) {
        JOptionPane.showMessageDialog(null, "Su saldo es: " + saldoActual);
    };
    
    public static void abono(double abonoActual){
        double nuevoAbono = Double.parseDouble(JOptionPane.showInputDialog("¿Digite valor a ingresar?"));
        abonoActual = abonoActual + nuevoAbono;
        JOptionPane.showMessageDialog(null, "EL ABONO SE REALIZÓ SATISFACTORIAMENTE " + abonoActual);
        
    }
    
    

}

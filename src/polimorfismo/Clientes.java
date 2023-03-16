/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Clientes {
 
    public static void main(String[] args) {
        int opcion, valor1, valor2;
        InterfazCalculadora clienteNormal = new CalculadoraNormal();
        InterfazCalculadora clienteEspecial = new CalculadoraEspecial();
        try {
            do {                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 si es cliente normal\n"+" Digite 2 si es cliente especial\n"+" Digite 3 para salir"));
                if(opcion == 1){
                    JOptionPane.showMessageDialog(null, "Usted es cliente normal");
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer numero"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo numero"));
                    JOptionPane.showMessageDialog(null, "La suma es: "+clienteNormal.sumar(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La resta es: "+clienteNormal.restar(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: "+clienteNormal.multiplicar(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La division es: "+clienteNormal.dividir(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La raiz cuadrada es: "+clienteNormal.calcularRaizCuadrada(valor1));
                }else if(opcion == 2){
                    JOptionPane.showMessageDialog(null, "Usted es cliente especial");
                    valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer numero"));
                    valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo numero"));
                    JOptionPane.showMessageDialog(null, "La suma es: "+clienteEspecial.sumar(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La resta es: "+clienteEspecial.restar(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: "+clienteEspecial.multiplicar(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La division es: "+clienteEspecial.dividir(valor1, valor2));
                    JOptionPane.showMessageDialog(null, "La raiz cuadrada es: "+clienteEspecial.calcularRaizCuadrada(valor1));
                }else if(opcion == 3){
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Esta opcion no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion <= 1 || opcion >= 2);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error en la digitación: "); 
        }
    }
    
}

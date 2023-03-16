/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author samue
 */
public class CalculadoraEspecial implements InterfazCalculadora{
    
    @Override
    public int sumar(int numero1, int numero2) {
        return (numero1 + numero2) / 2;
    }

    @Override
    public int restar(int numero1, int numero2) {
        return (numero1 - numero2) / 2;
    }

    @Override
    public int multiplicar(int numero1, int numero2) {
        return (numero1 * numero2) / 2;
    }

    @Override
    public int dividir(int numero1, int numero2) {
        return (numero1 / numero2) / 2;
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        return Math.sqrt(numero1) / 2;
    }
        
}

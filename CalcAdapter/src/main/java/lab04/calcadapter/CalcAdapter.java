/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab04.calcadapter;

/**
 *
 * @author Luiz Octavio
 */
public class CalcAdapter {

    public static void main(String[] args) {
        CalculadoraAdapter adapter = new CalculadoraAdapter(new CalculadoraDecimal(),new CalculadoraBinaria());
        
        System.out.println("Soma binaria de 101 + 100 = " + adapter.somar("101", "100"));
        System.out.println("Subtracao binaria de 101 + 100 = " + adapter.subtrair("101", "100"));
        System.out.println("Soma decimal de 101 + 100 = " + adapter.somar(101, 100));
        System.out.println("Subtracao decimal de 101 - 100 = " + adapter.subtrair(101, 100));
        System.out.println("Multiplicacao decimal de 101 * 100 = " + adapter.multiplicar(101, 100));
    }
}

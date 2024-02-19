/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04.calcadapter;

/**
 *
 * @author Luiz Octavio
 */
public class CalculadoraAdapter implements CalculadoraI{

    private CalculadoraDecimalI calcDecimal;
    private CalculadoraBinariaI calcBin;
    
    
    CalculadoraAdapter(CalculadoraDecimalI calcDecimal, CalculadoraBinariaI calcBin){
        this.calcDecimal = calcDecimal;
        this.calcBin = calcBin;
    }
    
    @Override
    public int somar(int a, int b) {
        return this.calcDecimal.somar(a, b);
    }

    @Override
    public int subtrair(int a, int b) {
        return this.calcDecimal.subtrair(a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
         return this.calcDecimal.multiplicar(a, b);
    }

    @Override
    public String somar(String a, String b) {
        return this.calcBin.somar(a, b);
    }

    @Override
    public String subtrair(String a, String b) {
        return this.calcBin.subtrair(a, b);
    }
    
}

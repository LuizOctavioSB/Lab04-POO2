/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04.calcadapter;

/**
 *
 * @author Luiz Octavio
 */
public class CalculadoraBinaria implements CalculadoraBinariaI{

    @Override
    public String somar(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("As entradas não podem ser nulas ou vazias.");
        }

        int maxLength = Math.max(a.length(), b.length());

        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0';

            int soma = bitA + bitB + carry;
            resultado.insert(0, soma % 2);
            carry = soma / 2;
        }

        if (carry > 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }

    @Override
    public String subtrair(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("As entradas não podem ser nulas ou vazias.");
        }

        int maxLength = Math.max(a.length(), b.length());

        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        StringBuilder resultado = new StringBuilder();
        int borrow = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0';

            int diferenca = bitA - bitB - borrow;

            if (diferenca < 0) {
                diferenca += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultado.insert(0, diferenca % 2);
        }

        return resultado.toString();
    }
}

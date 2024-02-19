/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tortaadapter;

/**
 *
 * @author Luiz Octavio
 */
public class TortaMorango implements Torta {
    @Override
    public String prepararMassa() {
        return "Torta com massa de morango, ";
    }

    @Override
    public String assar() {
        return "assada por 25 minutos e, ";
    }

    @Override
    public String colocarCobertura() {
        return "com cobertura de chocolate.";
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tortaadapter;

/**
 *
 * @author Luiz Octavio
 */
public class AdaptadorTorta implements Torta {
    private Torta tortaChocolate;
    private Torta tortaMorango;

    public AdaptadorTorta(Torta tortaChocolate, Torta tortaMorango) {
        this.tortaChocolate = tortaChocolate;
        this.tortaMorango = tortaMorango;
    }

    @Override
    public String prepararMassa() {
        return tortaChocolate.prepararMassa();
    }

    @Override
    public String assar() {
        return tortaChocolate.assar();
    }

    @Override
    public String colocarCobertura() {
        return tortaMorango.colocarCobertura();
    }
}

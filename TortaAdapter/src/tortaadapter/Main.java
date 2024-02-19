/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tortaadapter;

/**
 *
 * @author Luiz Octavio
 */
public class Main {
    public static void main(String[] args) {
        Torta tortaChocolate = new TortaChocolate();
        Torta tortaMorango = new TortaMorango();

        AdaptadorTorta adaptador = new AdaptadorTorta(tortaChocolate, tortaMorango);

        System.out.println(adaptador.prepararMassa() + adaptador.assar() + adaptador.colocarCobertura());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aveadapter;

/**
 *
 * @author Luiz Octavio
 */
public class PavaoAveAdapter implements Ave {
    
    Pavao pavao;
    
    public PavaoAveAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavao nao voa");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
    
}

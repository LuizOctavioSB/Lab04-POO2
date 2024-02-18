/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aveadapter;

/**
 *
 * @author Luiz Octavio
 */
public class AveAdapter {

    public static void main(String[] args) {
        Pato pt = new PatoDomestico();
        Ave ptAve = new PatoAveAdapter(pt);
        
        
        Pavao pv = new PavaoAzul();
        Ave pvAve = new PavaoAveAdapter(pv);
        
        AveAdapter main = new AveAdapter();
        
        main.habilidadesDaAve(ptAve);
        main.habilidadesDaAve(pvAve);
        
    }
    
    public void habilidadesDaAve(Ave ave) {
        ave.emitirSom();
        ave.voar();
    } 
}

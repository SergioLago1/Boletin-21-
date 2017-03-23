/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg21;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   OrdenarAlfabeticamente obx = new OrdenarAlfabeticamente();
        obx.cargarArray();
        obx.guardarFichero();
    }
    
}

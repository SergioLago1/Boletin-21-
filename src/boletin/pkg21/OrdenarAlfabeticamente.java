/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class OrdenarAlfabeticamente {
 
    private final String[] palabras = new String[10];
    
    public void cargarArray(){
        for(int i=0;i<palabras.length;i++){
            palabras[i]=JOptionPane.showInputDialog("Palabra");
        }
    }
    
    public void ordenarPalabras(){
        Arrays.sort(palabras);
    }
    
    public void guardarFichero(){
        ordenarPalabras();
        PrintWriter escritor=null;
        try{
            escritor = new PrintWriter(new File("/home/local/DANIELCASTELAO/slagogonzalez/Documentos/Programacion/Boletin 21/words.txt"));
            for(int i=0;i<palabras.length;i++){
               
                escritor.println(i+1 + " " + palabras[i]);
                escritor.println(palabras[i]);
            }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"NOT FOUND");
        }finally{
            escritor.close();
        }
    }
}


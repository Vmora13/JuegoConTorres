/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocontorres;

import javax.swing.JOptionPane;

/**
 *
 * @author heze-
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        try {
            construirTablero();
        } catch (Error e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            main(null);                    
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void construirTablero() {
        JuegoConTorres juegoTorres = new JuegoConTorres();
        int R = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor R"));
        int C = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor C"));
        int N = R*C;     
        String[] respuesta = juegoTorres.construir(R, C, N);        
        imprimirRespuesta(respuesta);
    }

    private static void imprimirRespuesta(String[] respuesta) {
        System.out.print("{ ");
        for (int i = 0; i < respuesta.length; i++) {
            if (i == (respuesta.length-1)) {
                System.out.print("\"" + respuesta[i] + "\"");  
            }else{
                System.out.print("\"" + respuesta[i] + "\",");  
            }
        }
        System.out.print(" }\n");
    }

}

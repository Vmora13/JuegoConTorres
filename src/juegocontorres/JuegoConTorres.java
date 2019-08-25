/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocontorres;

/**
 *
 * @author VivianaM-
 */
public class JuegoConTorres {

    public String[] construir(int R, int C, int N) {
        String[] res = new String[R];
        if (R < 1 || R > 50 || C < 1 || C > 50) {
            throw new Error("El valor R o C, no se encuentra en el rango de 1 a 50");
        }
        String[][] tablero = new String[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int mod = (i + j) % 2;
                if (i == 0) {
                    ponerTorres(tablero, mod, i, j);
                } else if (i == (R - 1)) {
                    ponerTorres(tablero, mod, i, j);
                } else {
                    tablero[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < R; i++) {
            String linea = "";
            for (int j = 0; j < C; j++) {
                linea += tablero[i][j];
            }
            res[i] = linea;
        }
        return res;
    }

    private void ponerTorres(String[][] tablero, int mod, int i, int j) {
        if (mod == 0) {
            tablero[i][j] = "W";
        } else {
            tablero[i][j] = "B";
        }
    }

}

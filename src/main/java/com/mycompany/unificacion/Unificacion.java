/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unificacion;

import java.io.IOException;

/**
 *
 * @author merin
 */
public class Unificacion {

    public static void main(String[] args) throws IOException {
        Conexion c1 = new Conexion();
        c1.listarLenguajesDePaisesAfricanos();
        c1.insertEsperantoInUE();
        c1.escribirRegionFichero("Micronesia", "caribbean_languages.txt");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Data.Data;

/**
 *
 * @author Jordi Gisbert Ferriz
 */
public class main {
    public static void main(String[] args) {
        Data d1 = new Data(12,12,2023);
        d1.mostrarEnFormatES();
        System.out.println(d1.getDiaSetmana());
        
        Data d2 = new Data(1,1,2012);
        d2.mostrarEnFormatES();
        System.out.println(d2.getDiaSetmana());
//        System.out.println("Dias: "+d1.getDiesTranscorregutsOrigen());
    }
}

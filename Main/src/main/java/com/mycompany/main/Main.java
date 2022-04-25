/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        Collection binary = new Binary();

        System.out.println(binary.toString());
        binary.inversion(4);
        System.out.println(binary.toString());
        binary.setTrue(4);
        System.out.println(binary.toString());
        binary.setFalse(4);
        System.out.println(binary.toString());
        binary.setTrue(4);
        binary.setTrue(7);
        binary.setTrue(10);
        binary.setTrue(32);
        System.out.println(binary.toString());
        binary.setBoolean(7, false);
        System.out.println("Количество элементов в true = "+binary.getByTrue());
        binary.setBoolean(7, false);
        System.out.println(binary.toString());
        System.out.println();

        Collection bool = new Bool();

        System.out.println(bool.toString());
        bool.inversion(4);
        System.out.println(bool.toString());
        bool.setTrue(4);
        bool.setTrue(5);
        System.out.println(bool.toString());
        bool.setFalse(5);
        System.out.println(bool.toString());
        bool.setTrue(21);
        bool.setTrue(15);
        System.out.println(bool.getByIndex(6));
        System.out.println("Количество элементов в true = "+bool.getByTrue());
        bool.setBoolean(4, false);
        System.out.println(bool.toString());
    }
}

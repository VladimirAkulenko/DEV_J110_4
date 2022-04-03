/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
public interface Collection {
    int SIZE = 1024;
    boolean getByIndex (int index);
    void setTrue (int index);
    void setBoolean(int index, boolean value);
    void setFalse (int index);
    void inversion (int index);
    int getByTrue ();
    @Override
    String toString();
}

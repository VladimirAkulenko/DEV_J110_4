/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
import java.util.Arrays;

public class Bool implements Collection{
    boolean [] booleanArray = new boolean[SIZE];

    //Проверка элемента с заданным индексом
    @Override
    public boolean getByIndex(int index) {
        if(index<0 || index>=booleanArray.length)
            throw new IllegalArgumentException("Некоректно куазан идекс");
        return booleanArray[index];
    }
    // Установка (в true) элемента с заданным индексом
    @Override
    public void setTrue(int index) {
        if(index<0 || index>=booleanArray.length)
            throw new IllegalArgumentException("Некоректно куазан идекс");
        booleanArray[index] = true;
    }
    // Установка элемента с заданным индексом заданным логическим значением
    @Override
    public void setBoolean(int index, boolean value) {
        booleanArray[index] = value;

    }
    //Сброс (в false) элемента с заданным индексом
    @Override
    public void setFalse(int index) {
        if(index<0 || index>=booleanArray.length)
            throw new IllegalArgumentException("Некоректно куазан идекс");
        booleanArray[index] = false;
    }
    //Инвертирование элемента с заданным индексом
    @Override
    public void inversion(int index) {
        if(index<0 || index>=booleanArray.length)
            throw new IllegalArgumentException("Некоректно куазан идекс");
        booleanArray[index] = !booleanArray[index];
    }
    // Метод, возвращающий количество элементов, установленных в true
    @Override
    public int getByTrue() {
        int n=0;
        for (int i = 0; i<booleanArray.length; i++)
            if(getByIndex(i))
                n++;
        return n;
    }
    // Метод toString(), возвращающий последовательность нулей и единиц
    @Override
    public String toString() {
        String [] result = new String[SIZE];
        for (int i = 0; i<result.length; i++)
            if(getByIndex(i)) result[i] = "1";
            else result[i] = "0";
        return Arrays.toString(result);
    }
}

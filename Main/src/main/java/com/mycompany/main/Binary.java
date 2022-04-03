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

public class Binary implements Collection {

    int [] intArray = new int[SIZE/32];

  //Проверка элемента с заданным индексом
    @Override
    public boolean getByIndex (int index){
        int elementIndex =index/32;
        int bitIndex = index%32;
        int element = intArray[elementIndex];
        int mask = 1<<bitIndex;
        return (element & mask) == mask;
    }
    // Установка (в true) элемента с заданным индексом
    @Override
    public void setTrue(int index) {
        int elementIndex =index/32;
        int bitIndex = index%32;
        int element = intArray[elementIndex];
        int mask = 1<<bitIndex;
        intArray[elementIndex] = element | mask;
    }
    // Установка элемента с заданным индексом заданным логическим значением
    @Override
    public void setBoolean(int index, boolean value) {
        if (value)
            setTrue(index);
        else
            setFalse(index);
    }

    //Сброс (в false) элемента с заданным индексом
    @Override
    public void setFalse(int index) {
        int elementIndex =index/32;
        int bitIndex = index%32;
        int element = intArray[elementIndex];
        int mask = 1<<bitIndex;
        intArray[elementIndex] = element & (~mask);
    }

    //Инвертирование элемента с заданным индексом
    @Override
    public void inversion (int index){
        int elementIndex =index/32;
        int bitIndex = index%32;
        int element = intArray[elementIndex];
        int mask = 1<<bitIndex;
        intArray[elementIndex] = element ^ mask;
    }
    // Метод, возвращающий количество элементов, установленных в true
    @Override
    public int getByTrue() {
        int [] result = new int[SIZE];
        int n=0;
        for (int i = 0; i<result.length; i++)
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

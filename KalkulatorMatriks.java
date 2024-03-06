/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulatormatriks;

/**
 *
 * @author m
 */
public class KalkulatorMatriks {
    public static void main(String[] args) {
        Matriks m1 = new Matriks(2, 2);
        m1.setElemen(0, 0, 1);
        m1.setElemen(0, 1, 2);
        m1.setElemen(1, 0, 3);
        m1.setElemen(1, 1, 4);

        Matriks m2 = new Matriks(2, 2);
        m2.setElemen(0, 0, 5);
        m2.setElemen(0, 1, 6);
        m2.setElemen(1, 0, 7);
        m2.setElemen(1, 1, 8);

        System.out.println("Matriks 1:");
        m1.cetak();

        System.out.println("Matriks 2:");
        m2.cetak();

        Matriks hasilTambah = m1.tambah(m2);
        System.out.println("Hasil Penjumlahan:");
        hasilTambah.cetak();

        Matriks hasilKurang = m1.kurang(m2);
        System.out.println("Hasil Pengurangan:");
        hasilKurang.cetak();
    }
}
    


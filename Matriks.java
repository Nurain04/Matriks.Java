/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatormatriks;

/**
 *
 * @author m
 */
public class Matriks {
    private int[][] data;

    // Constructor untuk inisialisasi matriks
    public Matriks(int baris, int kolom) {
        data = new int[baris][kolom];
    }

    // Setter untuk elemen matriks
    public void setElemen(int baris, int kolom, int nilai) {
        data[baris][kolom] = nilai;
    }

    // Getter untuk mendapatkan elemen matriks
    public int getElemen(int baris, int kolom) {
        return data[baris][kolom];
    }

    // Penjumlahan matriks
    public Matriks tambah(Matriks m) {
        Matriks hasil = new Matriks(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int elemen = this.data[i][j] + m.getElemen(i, j);
                hasil.setElemen(i, j, elemen);
            }
        }
        return hasil;
    }

    // Pengurangan matriks
    public Matriks kurang(Matriks m) {
        Matriks hasil = new Matriks(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int elemen = this.data[i][j] - m.getElemen(i, j);
                hasil.setElemen(i, j, elemen);
            }
        }
        return hasil;
    }

    // Cetak matriks
    public void cetak() {
        for (int[] baris : data) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}
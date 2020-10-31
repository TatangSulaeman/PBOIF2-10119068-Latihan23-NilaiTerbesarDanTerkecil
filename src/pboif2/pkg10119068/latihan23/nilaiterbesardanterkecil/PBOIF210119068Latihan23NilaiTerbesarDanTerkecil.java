/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perhitungan Nilai Terbesar dan terkecil
 */
public class PBOIF210119068Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static int nilaiTerbesar (int nilaiTerbesar, int nilai[],int n){
        nilaiTerbesar = nilai [1];
        for(int i = 1; i <= n; i++){
            if (nilai[i] > nilaiTerbesar ){
                nilaiTerbesar = nilai[i];
            }
        }
        return nilaiTerbesar;
    }
    
    public static int nilaiTerkecil (int nilaiTerkecil,int nilai[],int n){
        nilaiTerkecil = nilai[1];
        for (int i = 1; i <= n; i++){
            if (nilai[i] < nilaiTerkecil){
                nilaiTerkecil = nilai[i];
            }
        }
        return nilaiTerkecil;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int[]nilai = new int [10];
        int n;
        int nilaiTerbesar = 0;
        int nilaiTerkecil = 0;
        String namaPetugas;
        
        System.out.println("----------Program Terbesar dan Terkecil Nilai Mahasiswa----------");
        
        System.out.print("Masukan Nama petugas : ");
        namaPetugas = keyboard.nextLine();
        
        System.out.print("masukan Banyaknya Nilai Mahasiswa : ");
        n = keyboard.nextInt();
        
        for (int i = 1; i<= n; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " = ");
            nilai[i] = keyboard.nextInt();
        }
        System.out.println("");
        System.out.println("Hasil Nilai Mahasiswa");
        for ( int i = 1; i <= n; i++){
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
        System.out.println("");
        
        String outputText =  
            "Nilai Terbesar adalah\t" + nilaiTerbesar(nilaiTerbesar,nilai,n) + "\n" +
            "Nilai Terkecil adalah\t" + nilaiTerkecil(nilaiTerkecil,nilai,n) + "\n" +
            "" + "\n" +
            "Nama Petugas\t : " + namaPetugas + "\n" +
            "-----------------------------------------------------------------" + "\n" +
            "DIBUAT OLEH TATANG SULAEMAN";

        System.out.println(outputText);
        
    }
    
}

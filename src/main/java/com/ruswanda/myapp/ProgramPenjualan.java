/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruswanda.myapp;

import java.util.Scanner;


public class ProgramPenjualan {
    public static void main(String[] args) {
      
        while (true) {   
            
        Scanner input = new Scanner(System.in);
        String namaKasir, kodeBarang, namaBarang, caraBayar, ulangi;
        double hargaBarang, jumlahBeli, bayar, totalBayar = 0, diskon = 0, ppn, biayaKartu = 0;

        System.out.println("DATA PENJUALAN BARANG");
        System.out.print("PT 'PAMULANG TAMA'\nNama Kasir: ");
        namaKasir = input.nextLine();

        System.out.println("======================================================================");
        System.out.println("No. | Kode Barang | Nama Barang | Harga Barang | Jumlah Beli | Bayar");
        System.out.println("======================================================================");

        int no = 1;
        do {
            System.out.print(no + ".\t");
            kodeBarang = input.next();
            namaBarang = input.next();
            hargaBarang = input.nextDouble();
            jumlahBeli = input.nextDouble();
            bayar = hargaBarang * jumlahBeli;
            System.out.println(kodeBarang + "\t\t" + namaBarang + "\t\t" + hargaBarang + "\t\t" + jumlahBeli + "\t\t" + bayar);
            totalBayar += bayar;
            no++;

            System.out.print("Ada data lagi [YA/TIDAK]? ");
            ulangi = input.next();
        } while (ulangi.equalsIgnoreCase("YA"));

        // Menghitung diskon 5% (jika total bayar >= 500000)
        if (totalBayar >= 500000) {
            diskon = 0.05 * totalBayar;
        }

        // Menghitung PPN 10%
        ppn = 0.10 * totalBayar;

        // Menghitung biaya kartu Visa/Master (3% x total bayar)
        System.out.print("Cara Bayar (Visa/Master/Debit/Cash): ");
        caraBayar = input.next();
        if (caraBayar.equalsIgnoreCase("Visa") || caraBayar.equalsIgnoreCase("Master")) {
            biayaKartu = 0.03 * totalBayar;
        }

        // Menghitung total bayar akhir
        totalBayar -= diskon;
        totalBayar += ppn;
        totalBayar += biayaKartu;

        // Menampilkan jumlah bayar, diskon, PPN, dan total bayar
        System.out.println("\nJumlah Bayar: " + totalBayar);
        System.out.println("Diskon: " + diskon);
        System.out.println("PPN: " + ppn);
        System.out.println("Biaya Kartu: " + biayaKartu);
        System.out.println("Total Bayar: " + totalBayar);

        System.out.println("Terima kasih telah berbelanja di PT 'PAMULANG TAMA'");
    }
        }         
            
        }







  
    


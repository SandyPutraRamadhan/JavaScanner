
// Import
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class TugasJavaBasic {
    public static void main(String[] args) {
        // Input Scanner
        Scanner java = new Scanner(System.in);

        // Variable Dari Semua
        String Akses;
        String Password;
        String unik;
        int rahasia;
        String Uppercase = "";
        String LowerCase = "";
        String Reverse = "";
        int Pin;
        int menu = 1;
        int meter;
        int konversi;
        int suhu;
        int P;
        int Lebar;
        int Berat;
        int gram;
        int cel;
        int R = 4 / 5;
        int F = 9 / 5;
        int sisi;
        int all;
        int a;
        int t;
        int π = 22 / 7;
        int r;
        int panjang = 1;
        
        // Login
        System.out.println("<===Silahkan Login Terlebih Dahulu===>");

        System.out.print("Nama : ");
        Akses = java.nextLine();

        System.out.print("Password : ");
        Password = java.next();

        System.out.print("Pin : ");
        Pin = java.nextInt();

        if (Akses.equals("Administrator") && Password.length() >= 5 && Pin == 123456789) {
            System.out.println("Akses Diterima, Selamat Datang!!!");
        } else {
            System.out.println("Akses Ditolak");
            java.close();
        }
        // Menu Awal
        do {
            System.out.println("===Silahkan Pilih Menu===");
            
            System.out.println(" 1.Bangun Ruang/Datar \n 2.Konversi \n 3.Secret Menu \n 4.Exit");
            System.out.print("Input Untuk Memilih Menu Diatas : ");
            all = java.nextInt();
            // Switch All untuk membungkus Semua Case Contoh Dari Bangun Ruang Sampai Secred Menu
            switch (all) {
                case 1:
                // Soal 1 Bangun Ruang Datar
                do {
                    System.out.println("<==Bangun Ruang Datar==>");
                     System.out.println("Silahkan Pilih Rumus : \n 1.Luas(Meter Kuadrat) \n 2.Volume(Liter) \n 4.Exit");   
                     //  Input Data
                     System.out.print("Massukkan Nomor: ");
                     menu = java.nextInt();
                     switch (menu) {
                        case 1:
                        // Luas
                            do {
                                System.out.println("<==Luas (Meter Kuadrat)");
                                System.out.println("Silahkan pilih Bangun Datar : \n 1.Persegi Panjang \n 2.Persegi \n 3.Segitiga \n 4.Lingkaran \n 5.Exit");
                                // Input Data
                                System.out.print("Masukkan Nomor: ");
                                menu = java.nextInt();
                                // Switch Untuk Membungkus Semua Luas
                                switch (menu) {
                                    case 1:                
                                    System.out.println("==Persegi Panjang==");
                                    System.out.println("Rumus Persegi Panjang => luas = panjang * lebar ");
                                    System.out.println("Diketahui Persegi panjang memiliki");
                                    System.out.print("Panjang: ");
                                    P = java.nextInt();
                                    System.out.print("Lebar: ");
                                    Lebar = java.nextInt();
                                    System.out.println("Hasil Dari Luas Persegi Adalah : " + (P*Lebar)
                                            + " Meter Kuadrat");
                                    break;
                         case 2:      
                                    System.out.println("==Persegi==");
                                    System.out.println("Rumus Persegi => luas = sisi * sisi.");
                                    System.out.print("Diketahui Sisi Persegi Adalah: ");
                                    sisi = java.nextInt();
                                    System.out.println(
                                            "Hasil Dari Luas Persegi Adalah : " + (sisi*sisi) + " Meter Kuadrat");
                                    break;
                        case 3:         
                                    System.out.println("==Segitiga==");
                                    System.out.println("Rumus Segitiga =>  L = 1/2 * a * t");
                                    System.out.println("Diketahui Segitiga Memimiliki");
                                    System.out.print("Alas =");
                                    a = java.nextInt();
                                    System.out.print("Tinggi = ");
                                    t = java.nextInt();
                                    System.out.println(
                                            "Hasil dari luas segitiga adalah: " + (1/2 * a * t ) + " Meter Kuadrat");
                                    break;
                        case 4:
                                    System.out.println("==Lingkaran==");
                                    System.out.println("Rumus Lingkaran => phi*r*r");
                                    System.out.print("r = ");
                                    r = java.nextInt();
                                    System.out.println("Hasil Rumus Yang Anda Input : " + (π * r * r) + " Meter Kuadrat");
                                    break;
                                    default:
                                        break;
                                }
                            } while (menu < 4);
                            break;
 
                }
                // Volume
                            do {
                                System.out.println("<==Volume (Liter)==>");
                                System.out.println("Silahkan Pilih Bangun Ruang : \n 1.Balok \n 2.Kubus \n 3.Bola \n Exit");
                                // Input Data
                                System.out.print("Masukkan Nomor: ");
                                menu = java.nextInt();
                                // Switch Untuk Membungkus Semua Volume
                                switch (menu) {
                                        case 1:
                                        System.out.println("<==Balok==>");
                                        System.out.println("Rumus Balok = V balok = p * l * t");
                                        System.out.print("Masukan Panjang Balok dengan satuan liter: " );
                                         P = java.nextInt();
                                         System.out.print("Masukan Lebar Balok dengan satuan liter: " );
                                         Lebar = java.nextInt();
                                        System.out.print("Masukan Tinggi Balok dengan satuan liter: " );
                                         t = java.nextInt();
                                        System.out.println("Jadi Hasil Volume Balok adalah " + (P*Lebar*t) + " liter");
                                        break;

                                        case 2: 
                                        System.out.println("<==Kubus==>");
                                        System.out.println("Rumus Kubus = V = s * s * s atau V = s3");
                                        System.out.println("Masukkan Sisi Kubus dengan satuan Liter: ");
                                        sisi = java.nextInt();
                                        System.out.println("Jadi hasil volume Kubus adalah: " + (sisi*sisi*sisi));
                                        break;

                                        case 3 :
                                        System.out.println("<==Bola==>");
                                        System.out.println("Rumus Bola = V=4/3*phi*r3");
                                        System.out.println("Masukkan jari-jari bola dengan satuan liter: ");
                                        r = java.nextInt();
                                        System.out.println("Jadi hasil dari Volume Bola adalah: " + (4/3*π*r*r*r));
                                        break;

                                     default:
                                        break;
                                }

                            } while (menu < 3); 
                        } while (menu < 3); 
                        break;
                        // Soal 2 Konversi
                case 2:
                do {
                    // Menu Konversi
                        System.out.println("<==Konversi==>");
                        System.out.println(" 1.Derajat \n 2.Panjang(meter) \n 3.Berat (gram) \n 4.Exit");
                        konversi = java.nextInt();
                        // Switch Untuk Membungkus Semua Menu Konversi
                        switch (konversi) {
                            case 1:
                            // Menu Derajat
                        do {
                        System.out.println(" 1.Celcius Ke Reamur \n 2.Celcius ke Fahtenheit");
                        System.out.print("Silahkan Pilih Derajat yang akan Dikonversi : ");
                        suhu = java.nextInt();
                        // Switch Untuk Membungkus Semua Menu Derajat
                        switch (suhu) {
                            // Celcius Ke Reamur
                            case 1:
                                System.out.println("Celcius => Reamur");
                                System.out.print("Masukkan Suhu Celcius yang Akan di Konversi : ");
                                cel = java.nextInt();
                                System.out.println("Hasil Konversi Adalah " + (R * cel));
                                break;

                            // Celcius ke Fahtenheit
                            case 2:
                                System.out.println("Celcius => Fahtenheit");
                                System.out.print("Masukkan Suhu Celcius yang Akan di Konversi : ");
                                cel = java.nextInt();
                                System.out.println("Hasil Konversi Adalah " + ((F * cel) + 32));
                                break;
                        }
                    } while(suhu < 3);
                    break;
                    // Tangga Ukuran Panjang (Meter)
                    case 2:
                    // Menu Tangga Ukuran Panjang
                    do {
                        System.out.println("Mengonversi Satuan Meter Ke yg di bawah ;");
                        System.out.println(" 1.Km \n 2.hm \n 3.dam \n 4.dm \n 5.cm \n 6.mm");
                        System.out.print("Pilih Untuk Mengonversi Meter :");
                        panjang = java.nextInt();
                        // Switch Untuk Membungkus Semua Menu Tangga Ukuran Panjang
                        switch (panjang) {
                            case 1:
                                System.out.println("Konversi Meter => Kilometer ");
                                meter = java.nextInt();
                                System.out.println("Hasil " + (meter / 30) + "Km");
                                    break;
                            case 2:
                                System.out.println("Konversi Meter => HektaMeter ");
                                meter = java.nextInt();
                                System.out.println("Hasil " + (meter / 20) + "Hm");
                                break;
                            case 3:
                                System.out.println("Konversi Meter => Dam ");
                                meter = java.nextInt();
                                System.out.println("Hasil " + (meter / 10) + "Dam");
                                break;
                            case 4:
                                System.out.println("Konversi Meter => DesiMeter ");
                                meter = java.nextInt();
                                System.out.println("Hasil " + (meter * 10) + "Dm");
                                break;
                            case 5:
                                System.out.println("Konversi Meter => CentiMeter ");
                                meter = java.nextInt();
                                System.out.println("Hasil " + (meter * 20) + "Cm");
                                break;
                            case 6:
                                System.out.println("Konversi Meter => MiliMeter ");
                                meter = java.nextInt();
                                System.out.println("Hasil " + (meter * 30) + "Mm");
                                break;
                        }
                    } while (panjang < 7);
                    break;
                    // Tangga Ukuran Berat (Gram)
                    case 3:
                    // Menu Tangga Ukuran Berat
                    do {
                    System.out.println("Mengonversi Satuan Gram Ke yang Dibawah :");
                    System.out.println(" 1.Kg \n 2.hg \n 3.dag \n 4.dg \n 5.cg \n 6.mg");
                    System.out.print("Pilih Untuk Mengonversi Gram :");
                    Berat = java.nextInt();
                    // Switch Untuk Membungkus Semua Menu Tangga Ukuran Berat
                    switch (Berat) {
                        case 1:
                            System.out.print("Konversi Gram => KiloGram :");
                            gram =java.nextInt();
                            System.out.println("Hasil Dari Konversi :" + (gram / 30) + "Kg");
                            break;
                        case 2:
                            System.out.print("Konversi Gram => Hektogram :");
                            gram =java.nextInt();
                            System.out.println("Hasil Dari Konversi :" + (gram / 20) + "Hg");
                            break;
                        case 3:
                            System.out.print("Konversi Gram => Dekagram :");
                            gram =java.nextInt();
                            System.out.println("Hasil Dari Konversi :" + (gram / 10) + "Dag");
                            break;
                        case 4:
                            System.out.print("Konversi Gram => Desigram :");
                            gram =java.nextInt();
                            System.out.println("Hasil Dari Konversi :" + (gram * 10) + "Dg");
                            break;
                        case 5:
                            System.out.print("Konversi Gram => Centigram :");
                            gram =java.nextInt();
                            System.out.println("Hasil Dari Konversi :" + (gram * 20) + "Cg");
                            break;
                        case 6:
                            System.out.print("Konversi Gram => MiliGram :");
                            gram =java.nextInt();
                            System.out.println("Hasil Dari Konversi :" + (gram * 30) + "Mg");
                            break;
                    }
                } while (Berat < 7);
            }
            } while (konversi < 4);
            break;
            // Secred Menu
            case 3:
            // Login Menggunakan Nilai Unik Untuk Masuk Ke Secred Menu
                System.out.print("Untuk bisa mengakses Secret Menu harus Menginputkan Nilai Unik : ");
                unik = java.next();
                if (unik.length() < 8) {
                    System.out.println("Selamat Datang VIP");
                } else {
                    System.out.println("Salah Memasukkan Code!");
                    break;
                }
                // Menu Rahasia
                do {
                  System.out.println("Silahkan Pilih Menu Rahasia"); 
                  System.out.println(" 1.Uppercase \n 2.Lowercase \n 3.Reverse \n 4.Exit"); 
                  System.out.print(" Silihkan Pilih : ");
                  rahasia = java.nextInt();
                  // Switch Untuk Membungkus Semua Menu Rahasia
                  switch (rahasia) {
                    case 1:
                    // Merubah Kalimat Menjadi Uppercase/menjadi Huruf Kapital Semua
                            System.out.println("Uppercase : Membuat apa yg di Inputkan Menjadi Huruf Kapital Semua ");
                            System.out.print("Input Untuk Menjadikan Huruf Menjadi Uppercase : ");
                            Uppercase = java.next();
                            System.out.println("Hasil Dari Uppercase :" + Uppercase.toUpperCase());
                            break;
                    case 2:
                    // Merubah Kalimat Menjadi Lowercase/menjadi Huruf Kecil Semua
                           System.out.println(" Lowercase: Membuat apa yg di Inputkan Menjadi Huruf Kecil Semua ");
                           System.out.print("Input Untuk Menjadikan Huruf Menjadi Lowercase : " );
                           LowerCase = java.next();
                           System.out.println("Hasil Dari Lowercase :" + LowerCase.toLowerCase());
                           break;
                    case 3:
                    // Merubah Kalimat Menjadi Reverse/menjadi Kalimat Menjadi Terbalik
                   System.out.println("Reverse: Membuat apa yg di Inputkan Menjadi Kalimat Terbalik");
                   java.nextLine();
                   System.out.print("Input Untuk Menjadikan Kalimat Menjadi Reverse : ");
                   Reverse = java.nextLine();
                   List<String>list =
                   Arrays.asList(Reverse.split(""));
                   Collections.reverse(list);
                   System.out.println(String.join("", list));
                }
                java.close();
            } while (rahasia < 4);
            break;
        }
            } while (all < 4);
        }
    }

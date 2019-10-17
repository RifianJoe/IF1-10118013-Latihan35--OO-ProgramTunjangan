/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan35.oo.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menghitung Gaji Total Karyawan
 */
public class IF110118013Latihan35OOProgramTunjangan {
    public static double gajiPokok;
    public static String status;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan = new Karyawan();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========Program tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        status = scanner.next();
        
        karyawan.hitungGaji(gajiPokok, status);
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t\t : Rp. " + gajiPokok);
        System.out.println("Tunjangan\t\t : Rp. " + karyawan.tunjangan);
        System.out.println("Total Gaji\t\t : Rp. " + karyawan.totalGaji);
        
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}

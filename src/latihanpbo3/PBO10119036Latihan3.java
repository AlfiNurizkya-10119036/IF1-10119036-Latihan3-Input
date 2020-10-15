/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo3;

import java.util.Scanner;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : PBO
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : PERINTAH MENAMPILKAN MASUKAN DATA
 */
public class PBO10119036Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String Nama = scanner.next();
        System.out.println("Nama Anda Salah "+Nama);
    }
    
}

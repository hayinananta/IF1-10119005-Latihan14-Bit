/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10119005.latihan14;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Bit
 */
public class PBO110119005Latihan14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;/* 60 = 0011 1100 */
        int b = 13;/* 13 = 0000 1101 */
        int c = 0;
        c = a & b;
        /* 12 = 0000 1101 */
        System.out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1100 */
        System.out.println("a | b = " + c);
        c = a ^ b;
        /* 49 = 0011 1100 */
        System.out.println("a ^ b = " + c);
        c = ~a;
        /* ~61 = 1100 0011 */
        System.out.println("~a = b = " + c);
        c = a << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >> 2 = " + c);
    }
    
}

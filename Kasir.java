/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kasir {

    public static void main(String[] args) {
        String member;
        int belanja;

        Scanner kasir = new Scanner(System.in);
        System.out.println("Apakah anda seorang member?");
        member = kasir.nextLine();

        if (member.equalsIgnoreCase("ya")) {
            System.out.println("Masukkan total belanja anda");
            belanja = kasir.nextInt();
            if (belanja >= 100000 && belanja < 500000) {
                System.out.println("diskon 5%");
            } else if (belanja >= 500000) {
                System.out.println("diskon 15%");
            } else {
                System.out.println("diskon 2%");
            }
        } else {
            System.out.println("Maukkan total belanja anda");
            belanja = kasir.nextInt();
            if (belanja >= 500000) {
                System.out.println("diskon 5%");
            } else {
                System.out.println("diskon 0%");
            }
        }
    }
}

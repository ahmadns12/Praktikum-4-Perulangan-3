/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum4_3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Praktikum4_3 {

    public static void main(String[] args) {
        // Tugas no 3 (While)
        
        String mantra;
        Scanner sc = new Scanner(System. in);
        
        System.out.println("Input your spell");
        mantra = sc.nextLine();
        while(mantra.charAt(0) == 'a' && mantra.charAt(mantra.length() - 1) == 'a' ||
                mantra.charAt(0) == 'l' && mantra.charAt(mantra.length() - 1) == 'k' ||
                mantra.charAt(0) == 'b' && mantra.charAt(2) == 'c'){
            System.out.println("Your spell is magical!");
            mantra = sc.nextLine();
        }
        System.out.println("Your spell is Non-magical");
    }
}

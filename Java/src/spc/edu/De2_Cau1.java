/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class De2_Cau1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so fibonacci : ");
        int n = scanner.nextInt();

        ArrayList<Integer> ds = new ArrayList<>();
        int a = 0, b = 1;

        System.out.println("Day so Fibonacci:");
        for (int i = 0; i < n; i++) {
            ds.add(a);
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        int sum = 0;
        for (int num : ds) {
            sum += num;
        }

        System.out.println("\nTong: " + sum);
        scanner.close();
    }
}

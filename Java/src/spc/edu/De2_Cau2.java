/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class De2_Cau2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh chu vi va dien tich hinh cau");
         Scanner sc = new Scanner(System.in);
        double d,S,V;
        System.out.println("Nhap d: ");
        d = sc.nextDouble();
        S = Math.PI*(d*d);
        System.out.println("Dien Tich: " + S);
        V = (Math.PI*(d*d*d))/6;
        System.out.println("The tich: " + V);
    }
}

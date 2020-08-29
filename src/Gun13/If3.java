package Gun13;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // katsayıları verilen 2 bilinmeyenli denklemin köklerini bulunuz.
        // ax2 + bx +c;

        // çözüm adımları
        // kullanıcıdan a,b,c yi okutun.
        // delta = b*b - 4*a*c
        // delta > 0 => 2 tane kök vardır x1=(  -b + kök(d)) / (2*a) , x2= (-b - kök(d)) / (2*a)
        // delta = 0 => 1 tane kök vardır x = -b / 2a
        // delta < 0 ise kök yoktur

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        int delta = b * b - 4 * a * c;

        if (delta > 0) {
            System.out.println("x1: " + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2: " + ((-b - Math.sqrt(delta)) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("x: " + (-b / 2 * a));
        } else
            System.out.println("kök yoktur");
    }

}


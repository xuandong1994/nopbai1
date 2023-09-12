package baitap2;

import java.util.Scanner;

public class giaiphuongtrinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a :");
        double a = input.nextDouble();
        System.out.println("Nhập b :");
        double b = input.nextDouble();
        System.out.println("Nhập c :");
        double c = input.nextDouble();
        if (a != 0) {
            System.out.println("Phương trình có nghiệm là " + ((c - b) / a));
        } else {
            if (b == c) System.out.println("Phương trình có vô số nghiêm ");
            else System.out.println("phương trình vô nghiệm");


        }
    }
}


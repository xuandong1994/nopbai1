package baitap2;

import java.util.Scanner;

public class Tinhchisocannang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cân nặng");
        double weight = input.nextDouble();
        System.out.println("Nhập chiêu cao");
        double height = input.nextDouble();
        double bmi = weight / Math.pow(height, 2) ;
        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi < 24.9) {
            System.out.println("Bình thường");
        } else if (bmi < 29.9) {
            System.out.println("Hơi béo");
        } else {
            System.out.println("Béo phì");
        }
    }
}

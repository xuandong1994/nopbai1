package baitap2;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm :");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d là năm nhuận",year);
                }else {
                    System.out.printf("%d không phải năm nhuận" , year);
                }
            }else {
                System.out.printf("%d là năm nhuậm", year);
            }
        }else {
            System.out.printf("%d không phải năm nhuận",year);
        }

    }
}

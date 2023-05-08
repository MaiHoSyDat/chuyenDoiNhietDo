import java.util.Scanner;
import java.util.SortedMap;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doC;
        double doF;
        int num;
         do {
             System.out.println("Menu:");
             System.out.println("1. Chuyển độ C sang độ F:");
             System.out.println("2. Chuyển độ F sang độ C:");
             System.out.println("0. EXIT");
             System.out.println("Mời nhập số :");
             num= scanner.nextInt();
             switch (num){
                 case 1:
                     System.out.println("Mời nhập số độ C cần chuyển đổi sang độ F:");
                     doC = scanner.nextDouble();
                     System.out.println("Số độ F là : " + cSangF(doC));
                     break;
                 case 2:
                     System.out.println("Mời nhập số độ F cần chuyển đổi sang độ C:");
                     doF = scanner.nextDouble();
                     System.out.println("Số độ C là : " + fSangC(doF));
                     break;
                 case 0:
                     System.exit(0);
             }
         }while (num != 0);
    }

    public static double cSangF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double fSangC(double doF){
        double doC = (5.0 / 9)* (doF - 32);
        return doC;
    }
}

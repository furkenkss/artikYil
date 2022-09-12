import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl Giriniz :");
        yil = input.nextInt();

        if ((yil%4==0) && (yil%100!=0) || (yil%400==0)) {
            System.out.print(yil + " bir artık yıldır!");
        } else {
            System.out.print(yil + " bir artık yıl değildir");
        }
    }
}

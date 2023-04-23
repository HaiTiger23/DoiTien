import java.util.Scanner;

public class App {
    public static void sapXep(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int max = a[i];
            int max_idx = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j] > max) {
                    max = a[j];
                    max_idx = j;
                }
            }
            int temp = a[i];
                a[i] = a[max_idx];
                a[max_idx] = temp;
        }
    }

    public static void ATM(int menhGia[], int money) {
        int i = 0;
        while (money != 0) {
            if (i == menhGia.length && money == 0) {
                System.out.println("Doi Tien Thanh cong");
                break;
            }
            if (i == menhGia.length && money != 0) {
                System.out.println("Doi Tien Khong Thanh Cong");
                break;
            }
            int soTo = money / menhGia[i];
            money = money - soTo * menhGia[i];
            System.out.println("Ban nhan duoc " + soTo + " to menh gia " + menhGia[i] + " VND");
            i++;

        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int n;
       
        do {
            System.out.println("nhap vao so menh gia (> 0): ");
            n = sc.nextInt();
        }while(n <= 0);
        int[] menhGia = new int[n];
        System.out.println("Nhap vao cac menh gia: ");
        for (int i = 0; i < menhGia.length; i++) {
            menhGia[i] = sc.nextInt();
        }
        sapXep(menhGia);
        for (int i = 0; i < menhGia.length; i++) {
            System.out.println(menhGia[i]);
        }
        int money;
        System.out.println("Nhap so tien can rut: ");
        money = sc.nextInt();
        ATM(menhGia, money);

    }
}

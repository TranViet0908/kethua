import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong giang vien: ");
        int n = sc.nextInt();
        Giangvien[] a = new Giangvien[n];
        for(int i = 0; i < n; i++){
            a[i] = new Giangvien();
            a[i].input();
        }
        System.out.println("");
        for(int i = 0; i < n; i++){
            a[i].output();
            System.out.println("");
        }
        sc.close();
    }
}
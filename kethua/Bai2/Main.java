import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong thi sinh: ");
        int n = sc.nextInt();
        System.out.println("Nhap diem chuan: ");
        float m = sc.nextFloat();
        ThiSinh[] a = new ThiSinh[n];
        for(int i = 0; i < n; i++){
            a[i] = new ThiSinh();
            a[i].input();
        }
        System.out.println("");
        for(int i = 0; i < n; i++){
            if(a[i].kiemTraDiem(m)){
                a[i].output();
                System.out.println("");
            }
        }
        sc.close();
    }
}

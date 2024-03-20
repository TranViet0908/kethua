import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void LuongTangDan (ArrayList<NhanVien> dsnv){
        for(int i = 0; i < dsnv.size(); i++){
            for(int j = i +1; j < dsnv.size(); j++){
                if(dsnv.get(i).getTienLuong() > dsnv.get(j).getTienLuong()){
                    Collections.swap(dsnv, i, j);
                }
            }
        }
    }

    public static void LuongGiamDan (ArrayList<NhanVien> dsnv){
        for(int i = 0; i < dsnv.size(); i++){
            for(int j = i +1; j < dsnv.size(); j++){
                if(dsnv.get(i).getTienLuong() < dsnv.get(j).getTienLuong()){
                    Collections.swap(dsnv, i, j);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <NhanVien> dsnv = new ArrayList<>();
        System.out.println("Nhap so nhan vien: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            NhanVien nv = new NhanVien();
            nv.input();
            dsnv.add(nv);
        }
// a:
        LuongTangDan(dsnv);
        System.out.println("Danh sach luong tang dan: ");
        for(NhanVien x : dsnv){
            x.output();
            System.out.println("");
        }
// b:
        int cntThuong = 0;
        for(NhanVien x : dsnv){
            if(x.tinhThuong()!=0){
                cntThuong++;
            }
        }
        System.out.println("So nhan vien duoc thuong la: " + cntThuong);
// c:
        int cntPKT = 0;
        for(NhanVien x : dsnv){
            if(x.getPhongBan().toUpperCase().equals("PHONG KY THUAT")){
                cntPKT++;
            }
        }
        System.out.println("So nhan vien phong ky thuat: " + cntPKT);
// d:
        System.out.println("Nhan Vien co luong cao nhat: ");
        (dsnv.get(dsnv.size()-1)).output();
// e:
        for(NhanVien x : dsnv){
            if(x.getPhongBan().toUpperCase().equals("PHONG KE TOAN")){
                x.output();
                System.out.println("");
            }
        }
// f:
        LuongGiamDan(dsnv);
        System.out.println("Danh sach luong giam dan phong hanh chinh: ");
        for(NhanVien x : dsnv){
            if(x.getPhongBan().toUpperCase().equals("PHONG HANH CHINH")){
                x.output();
                System.out.println("");
            }
        }
// g:
        for(NhanVien x: dsnv){
            if(x.getTen().toUpperCase().equals("NGUYEN THU PHUONG")){
                x.output();
                System.out.println("");
            }
        }
        sc.close();
    }
}

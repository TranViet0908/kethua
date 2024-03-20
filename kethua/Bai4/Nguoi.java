import java.util.Scanner;

public class Nguoi {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public static Scanner sc = new Scanner(System.in);
    public Nguoi(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public Nguoi () {
        
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void input(){
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap ngay sinh: (xx/xx/xxxx)");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void output(){
        System.out.println("Ten: " + this.ten);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Dia chi: " + this.diaChi);
    }
}
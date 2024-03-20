import java.util.Scanner;

public class NhanVien extends Nguoi {
    private int tienLuong;
    private int soGioLam;
    private String phongBan;

    public static Scanner sc = new Scanner(System.in);
    public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, int tienLuong, int soGioLam,
            String phongBan) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.tienLuong = tienLuong;
        this.soGioLam = soGioLam;
        this.phongBan = phongBan;
    }
    public NhanVien(int tienLuong, int soGioLam, String phongBan) {
        this.tienLuong = tienLuong;
        this.soGioLam = soGioLam;
        this.phongBan = phongBan;
    }

    public NhanVien(){
        
    }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap tien luong: ");
        this.tienLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so gio lam: ");
        this.soGioLam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban: (PHONG KE TOAN / PHONG KY THUAT / PHONG HANH CHINH)");
        this.phongBan = sc.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Luong: " + this.tienLuong);
        System.out.println("So gio lam: " + this.soGioLam);
        System.out.println("Phong ban: " + this.phongBan);
    }

    public int tinhThuong(){
        int thuong = 0;
        if(this.soGioLam >= 200) return thuong = this.tienLuong * 2;
        else if (this.soGioLam <200 && this.soGioLam >= 100) return thuong = ((this.tienLuong * 10) / 100);
        else return thuong = 0;
    }

    public int getTienLuong() {
        return tienLuong;
    }
    public void setTienLuong(int tienLuong) {
        this.tienLuong = tienLuong;
    }
    public int getSoGioLam() {
        return soGioLam;
    }
    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    public String getPhongBan() {
        return phongBan;
    }
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
    
}

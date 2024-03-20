import java.util.Scanner;

public class May {
    private String tenNSX;
    private String diaChi;
    private String nhanHieu;
    private int giaThanh;
    public static Scanner sc = new Scanner(System.in);
    public May(String tenNSX, String diaChi, String nhanHieu, int giaThanh) {
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
        this.nhanHieu = nhanHieu;
        this.giaThanh = giaThanh;
    }

    public May(){

    }

    public void input(){
        System.out.println("Nhap NSX: ");
        this.tenNSX = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("Nhap nhan hieu: ");
        this.nhanHieu = sc.nextLine();
        System.out.println("Nhap gia thanh: ");
        this.giaThanh = Integer.parseInt(sc.nextLine());
    }

    public void output(){
        System.out.println("NSX: " + this.tenNSX);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Nhan hieu: " + this.nhanHieu);
        System.out.println("Gia thanh: " + this.giaThanh);
    }

    public String getTenNSX() {
        return tenNSX;
    }
    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getNhanHieu() {
        return nhanHieu;
    }
    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }
    public int getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }
}
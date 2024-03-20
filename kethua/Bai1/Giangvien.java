import java.util.Scanner;

public class Giangvien extends Nguoi {
    private String lopDay;
    private int luong1Gio;
    private int soGioDay;
    private int luong;
    private String caDay;

    public static Scanner sc = new Scanner(System.in);
    public Giangvien(String lopDay, int luong1Gio, int soGioDay, int Luong, String CaDay) {
        this.lopDay = lopDay;
        this.luong1Gio = luong1Gio;
        this.soGioDay = soGioDay;
        this.luong = Luong;
        this.caDay = CaDay;
    }

    public Giangvien(){
        
    }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap lop day: ");
        lopDay = sc.nextLine();
        System.out.println("Nhap so luong day trong 1 gio: ");
        luong1Gio = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so gio day: ");
        soGioDay = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ca day: (Sang/Chieu/Toi)");
        caDay = sc.nextLine();
        if(caDay.equals("Sang")){
            this.luong = this.luong1Gio * this.soGioDay;
        } else
        if(caDay.equals("Chieu")){
            this.luong = this.luong1Gio * this.soGioDay;
        } else
        if(caDay.equals("Toi")){
            this.luong = this.luong1Gio * this.soGioDay + 200000;
        } else System.out.println("Nhap ko hop le!");
    }
    
    @Override
    public void output(){
        super.output();
        System.out.println("Ca day: " + this.caDay);
        System.out.println("Lop day: " + this.lopDay);
        System.out.println("Luong day trong 1 gio: " + this.luong1Gio);
        System.out.println("So gio day: " + this.soGioDay);
        System.out.println("Luong: " + getLuong());
    }


    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public int getLuong1Gio() {
        return luong1Gio;
    }

    public void setLuong1Gio(int luong1Gio) {
        this.luong1Gio = luong1Gio;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }
    
    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}

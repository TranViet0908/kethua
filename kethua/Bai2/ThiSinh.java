public class ThiSinh extends Nguoi {
    private String sbd;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemChuan;
    private float diemThiSinh;

    public ThiSinh(String sbd, float diemToan, float diemLy, float diemHoa, float diemChuan, float diemThiSinh) {
        this.sbd = sbd;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemChuan = diemChuan;
        this.diemThiSinh = diemThiSinh;
    }

    public ThiSinh(){

    }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap SBD: ");
        sbd = sc.nextLine();
        System.out.println("Nhap so diem Toan: ");
        diemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap so diem Ly: ");
        diemLy = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap so diem Hoa: ");
        diemHoa = Float.parseFloat(sc.nextLine());
    }
    
    @Override
    public void output(){
        super.output();
        this.diemThiSinh = this.diemToan + this.diemLy + this.diemHoa;
        System.out.println("SBD: " + this.sbd);
        System.out.println("Diem Toan: " + this.diemToan);
        System.out.println("Diem Ly: " + this.diemLy);
        System.out.println("Diem Hoa: " + this.diemHoa);
        System.out.println("Diem Chuan: " + this.diemThiSinh);
    }
    
    public boolean kiemTraDiem(float diemChuan) {
        return (diemToan + diemLy + diemHoa) >= diemChuan;
    }

    public String getSbd() {
        return sbd;
    }
    public void setSbd(String sbd) {
        this.sbd = sbd;
    }
    public float getDiemToan() {
        return diemToan;
    }
    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }
    public float getDiemLy() {
        return diemLy;
    }
    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }
    public float getDiemHoa() {
        return diemHoa;
    }
    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    public float getDiemChuan() {
        return diemChuan;
    }
    public void setDiemChuan(float diemChuan) {
        this.diemChuan = diemChuan;
    }
    public float getDiemThiSinh() {
        return diemThiSinh;
    }
    public void setDiemThiSinh(float diemThiSinh) {
        this.diemThiSinh = diemThiSinh;
    }
}

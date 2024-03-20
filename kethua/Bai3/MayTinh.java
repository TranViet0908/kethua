public class MayTinh extends May {
    private int tocDo;
    private int RAM;
    private int HDD;
    
    public MayTinh(String tenNSX, String diaChi, String nhanHieu, int giaThanh, int tocDo, int rAM, int hDD) {
        super(tenNSX, diaChi, nhanHieu, giaThanh);
        this.tocDo = tocDo;
        this.RAM = rAM;
        this.HDD = hDD;
    }

    public MayTinh(int tocDo, int rAM, int hDD) {
        this.tocDo = tocDo;
        this.RAM = rAM;
        this.HDD = hDD;
    }

    public MayTinh(){
        
    }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap toc do cua may tinh: ");
        this.tocDo = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dung luong RAM: ");
        this.RAM = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dung luong o HDD: ");
        this.HDD = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Toc do may tinh: " + this.tocDo);
        System.out.println("Dung luong RAM: " + this.RAM);
        System.out.println("Dung luong o HDD: " + this.HDD);
    }

    public int getTocDo() {
        return tocDo;
    }
    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int rAM) {
        RAM = rAM;
    }
    public int getHDD() {
        return HDD;
    }
    public void setHDD(int hDD) {
        HDD = hDD;
    }
}

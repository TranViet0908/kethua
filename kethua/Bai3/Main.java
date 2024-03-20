import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    // public static void sapXepTangGia(ArrayList<MayTinh> mt) {
    //     Collections.sort(mt, new Comparator<MayTinh>() {
    //         @Override
    //         public int compare(MayTinh mT1, MayTinh mT2) {
    //             return Float.compare(mT1.getGiaThanh(), mT2.getGiaThanh());
    //         }
    //     });
    // }

    public static void sapXepTangGia(ArrayList<MayTinh> mt) {
        for(int i = 0; i < mt.size() - 1; i++) {
            for(int j = i + 1; j < mt.size(); j++){
                if(mt.get(i).getGiaThanh() > mt.get(j).getGiaThanh()){
                    Collections.swap(mt, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So luong may tinh: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <MayTinh> mt = new ArrayList<>();
        for(int i = 0; i < n; i++){
            MayTinh may = new MayTinh();
            may.input();
            mt.add(may);
            System.out.println("");
        }
        for (MayTinh x : mt) {
            if(x.getTenNSX().equals("IBM")){
                x.output();
                System.out.println("");
            }
        }

        sapXepTangGia(mt);
        System.out.println("Day sau khi sap xep");
        for (MayTinh x : mt) {
            x.output();
            System.out.println("");
        }

        for (MayTinh x : mt) {
            if(x.getTenNSX().toUpperCase().equals("IBM")){
                x.output();
                System.out.println("");
            }
        }

        for (MayTinh x : mt) {
            if(!x.getTenNSX().toUpperCase().equals("INTEL")){
                mt.remove(x);
                x.output();
                System.out.println("");
            }
        }
        sc.close();
    }
}

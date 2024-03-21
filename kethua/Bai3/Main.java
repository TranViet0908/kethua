import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

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

        System.out.println("May cua IBM: ");
        for (MayTinh x : mt) {
            if(x.getTenNSX().toUpperCase().equals("IBM")){
                x.output();
                System.out.println("");
            }
        }

        System.out.println("May ko phai Intel: ");
        Iterator<MayTinh> iterator = mt.iterator();
        while (iterator.hasNext()) {
            MayTinh mayTinh = iterator.next();
            if (!mayTinh.getTenNSX().toUpperCase().equals("INTEL")) {
                iterator.remove();
                mayTinh.output();
                System.out.println("");
            }
        }
        sc.close();
    }
}

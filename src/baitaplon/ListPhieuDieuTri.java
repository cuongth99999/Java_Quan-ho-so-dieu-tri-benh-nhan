package baitaplon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPhieuDieuTri {
    ArrayList<PhieuDieuTri> listPDT = new ArrayList<PhieuDieuTri>();

    public void nhapListPDT() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phieu dieu tri: ");
        n = scanner.nextInt();
        PhieuDieuTri PDT;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phieu dieu tri thu: " + (i + 1));
            PDT = new PhieuDieuTri();
            PDT.nhapPhieuDieuTri();
            listPDT.add(PDT);
            System.out.println("");
        }
    }

    public void hienListPDT() {
        for (PhieuDieuTri PDT : listPDT) {
            PDT.hienPhieuDieuTri();
            System.out.println("");
        }
    }

    public void suaPhieuDieuTri() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma phieu dieu tri can sua : ");
        String maPhieuSua = scanner.nextLine();
        for(int i=0; i < listPDT.size(); i++) {
            if(maPhieuSua.equalsIgnoreCase(listPDT.get(i).getMaPhieu())){
                PhieuDieuTri PDT = new PhieuDieuTri();
                PDT.nhapPhieuDieuTri();
                listPDT.set(i, PDT);
            }
        }
    }

    public void xoaPhieuDieuTri() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma phieu dieu tri muon xoa: ");
        String maPhieuMuonXoa = scanner.nextLine();
        for (int i = 0; i < listPDT.size(); i++) {
            if (listPDT.get(i).getMaPhieu().equalsIgnoreCase(maPhieuMuonXoa) == true) {
                listPDT.remove(i);
            }
        }
    }

    public void tongTienCacPhieu() {
        float tongTienCacPhieu = 0;
        for (PhieuDieuTri PDT : listPDT) {
            tongTienCacPhieu += PDT.tongTienDV();
        }
        System.out.println("Tong tien dich vu cac phieu dieu tri la: " + tongTienCacPhieu);
    }

    public void sapXepMaPhieuAlphabet() {
        for (int i = 0; i < listPDT.size() - 1; i++) {
            for (int j = i + 1; j < listPDT.size(); j++) {
                if (listPDT.get(i).getMaPhieu().compareTo(listPDT.get(j).getMaPhieu()) > 0) {
                    PhieuDieuTri temp = new PhieuDieuTri();
                    temp = listPDT.get(i);
                    listPDT.set(i, listPDT.get(j));
                    listPDT.set(j, temp);
                }
            }
        }
    }

    // public void timTongTienDVMax() {
    //     float tienDVMax = 0;
    //     for (int i = 0; i < listPDT.size(); i++) {
    //         if (listPDT.get(i).tongTienDV() > tienDVMax) {
    //             tienDVMax = listPDT.get(i).tongTienDV();
    //         }
    //     }

    //     System.out.println("Phieu dieu tri co tong tien dich vu lon nhat la: ");
    //     for (PhieuDieuTri PDT : listPDT) {
    //         if (PDT.tongTienDV() == tienDVMax) {
    //             PDT.hienPhieuDieuTri();
    //         }
    //     }
    // }

    public void ghiFile() throws FileNotFoundException, IOException {
        File fname = new File("DSphieuDieuTri.dat");

        FileOutputStream fout = new FileOutputStream(fname);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        objout.writeObject(listPDT);
        
        objout.close();
        fout.close();
    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fname = new File("DSphieuDieuTri.dat");

        FileInputStream fin = new FileInputStream(fname);
        ObjectInputStream objin = new ObjectInputStream(fin);

        listPDT = (ArrayList)objin.readObject();

        objin.close();
        fin.close();
        for (PhieuDieuTri PDT : listPDT) {
            PDT.hienPhieuDieuTri();
            System.out.println("");
        }
    }
}

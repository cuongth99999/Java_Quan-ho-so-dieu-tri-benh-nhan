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

public class DSBENHNHANKHAM {
    ArrayList<BENHNHANKHAM> dsBNKHAM = new ArrayList<BENHNHANKHAM>();

    public void nhapListBNKHAM() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so benh nhan kham: ");
        n = scanner.nextInt();
        BENHNHANKHAM BNKHAM;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin benh nhan kham thu: " + (i + 1));
            BNKHAM = new BENHNHANKHAM();
            BNKHAM.nhapThongTin();
            dsBNKHAM.add(BNKHAM);
            System.out.println("");
        }
    }

    public void hienListBNKHAM() {
        for (BENHNHANKHAM BNKHAM : dsBNKHAM) {
            BNKHAM.hienThongTin();
            System.out.println("");
        }
    }

    public void ghiFile() throws FileNotFoundException, IOException {
        File fname = new File("thiLTHDT.dat");

        FileOutputStream fout = new FileOutputStream(fname);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        objout.writeObject(dsBNKHAM);
        
        objout.close();
        fout.close();
    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fname = new File("thiLTHDT.dat");

        FileInputStream fin = new FileInputStream(fname);
        ObjectInputStream objin = new ObjectInputStream(fin);

        dsBNKHAM = (ArrayList)objin.readObject();

        objin.close();
        fin.close();
        for (BENHNHANKHAM BNKHAM : dsBNKHAM) {
            BNKHAM.hienThongTin();
            System.out.println("");
        }
    }

    public void suaThongTinBNK() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma benh nhan kham can sua thong tin: ");
        String maBNsua = scanner.nextLine();
        for(int i=0; i < dsBNKHAM.size(); i++) {
            if(maBNsua.equalsIgnoreCase(dsBNKHAM.get(i).getMaBenhNhan())){
                BENHNHANKHAM BNKHAM = new BENHNHANKHAM();
                BNKHAM.nhapThongTin();
                dsBNKHAM.set(i, BNKHAM);
            }
        }
    }
}

package baitaplon;

import java.io.Serializable;
import java.util.Scanner;

public class BacSi extends Person implements Serializable {
    private String maBacSi;
    private String chuyenNganh;
    private String khoaDieuTri;

    public BacSi() {
        super();
        maBacSi = "";
        chuyenNganh = "";
        khoaDieuTri = "";
    }

    public BacSi(String maBacSi, String chuyenNganh, String khoaDieuTri,
            String hoTen, String diaChi, String gioiTinh, int tuoi) {
        super(hoTen, diaChi, gioiTinh, tuoi);
        this.maBacSi = maBacSi;
        this.chuyenNganh = chuyenNganh;
        this.khoaDieuTri = khoaDieuTri;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getKhoaDieuTri() {
        return khoaDieuTri;
    }

    public void setKhoaDieuTri(String khoaDieuTri) {
        this.khoaDieuTri = khoaDieuTri;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma bac si: ");
        maBacSi = scanner.nextLine();
        System.out.print("Nhap chuyen nganh bac si: ");
        chuyenNganh = scanner.nextLine();
        System.out.print("Nhap khoa dieu tri: ");
        khoaDieuTri = scanner.nextLine();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Ma bac si: " + maBacSi);
        System.out.println("Ma chuyen nganh: " + chuyenNganh);
        System.out.println("Khoa bac si dang dieu tri: " + khoaDieuTri);
    }
}

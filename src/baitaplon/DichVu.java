package baitaplon;

import java.io.Serializable;
import java.util.Scanner;

public class DichVu implements Serializable {
    private String maDV;
    private String tenDV;
    private float donGia;

    public DichVu() {
        super();
        maDV = "";
        tenDV = "";
        donGia = 0;
    }

    public DichVu(String maDV, String tenDV, float donGia) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.donGia = donGia;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhapDV() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma dich vu: ");
        maDV = scanner.nextLine();
        System.out.print("Nhap ten dich vu: ");
        tenDV = scanner.nextLine();
        System.out.print("Nhap don gia dich vu: ");
        donGia = scanner.nextFloat();
    }

    public void hienDV() {
        System.out.println("Ma dich vu: " + maDV);
        System.out.println("Ten dich vu: " + tenDV);
        System.out.println("Don gia: " + donGia);
    }
}

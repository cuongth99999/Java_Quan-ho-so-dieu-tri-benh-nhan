package baitaplon;

import java.io.Serializable;
import java.util.Scanner;

public class BenhNhan extends Person implements Serializable {
    private String maBenhNhan;
    private String maBHYT;
    private String soDienThoai;

    public BenhNhan() {
        super();
        maBenhNhan = "";
        maBHYT = "";
        soDienThoai = "";
    }

    public BenhNhan(String maBenhNhan, String maBHYT, String soDienThoai,
            String hoTen, String diaChi, String gioiTinh, int tuoi) {
        super(hoTen, diaChi, gioiTinh, tuoi);
        this.maBenhNhan = maBenhNhan;
        this.maBHYT = maBHYT;
        this.soDienThoai = soDienThoai;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getMaBHYT() {
        return maBHYT;
    }

    public void setMaBHYT(String maBHYT) {
        this.maBHYT = maBHYT;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap ma benh nhan: ");
        maBenhNhan = scanner.nextLine();
        System.out.print("Nhap ma bao hiem y te: ");
        maBHYT = scanner.nextLine();
        System.out.print("Nhap so dien thoai benh nhan: ");
        soDienThoai = scanner.nextLine();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Ma benh nhan: " + maBenhNhan);
        System.out.println("Ma bao hiem y te: " + maBHYT);
        System.out.println("So dien thoai: " + soDienThoai);
    }
}

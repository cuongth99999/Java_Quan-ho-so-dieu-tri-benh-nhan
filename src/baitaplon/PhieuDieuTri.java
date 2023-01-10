package baitaplon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class PhieuDieuTri implements Serializable {
    private String maPhieu;
    private String ngayLap;
    private String ngayVaoVien;
    private String ngayXuatVien;
    private BenhNhan benhNhan;
    private BacSi bacSi;
    private String trieuChungBenh;
    ArrayList<DichVu> dsDV = new ArrayList<DichVu>();

    public PhieuDieuTri() {
        super();
        maPhieu = "";
        ngayLap = "";
        ngayVaoVien = "";
        ngayXuatVien = "";
        benhNhan = new BenhNhan();
        bacSi = new BacSi();
        trieuChungBenh = "";
        dsDV = new ArrayList<DichVu>();
    }

    public PhieuDieuTri(String maPhieu, String ngayLap, String ngayVaoVien, String ngayXuatVien,
            BenhNhan benhNhan, BacSi bacSi, String trieuChungBenh, ArrayList<DichVu> dsDV) {
        this.maPhieu = maPhieu;
        this.ngayLap = ngayLap;
        this.ngayVaoVien = ngayVaoVien;
        this.ngayXuatVien = ngayXuatVien;
        this.benhNhan = benhNhan;
        this.bacSi = bacSi;
        this.trieuChungBenh = trieuChungBenh;
        this.dsDV = dsDV;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getNgayVaoVien() {
        return ngayVaoVien;
    }

    public void setNgayVaoVien(String ngayVaoVien) {
        this.ngayVaoVien = ngayVaoVien;
    }

    public String getNgayXuatVien() {
        return ngayXuatVien;
    }

    public void setNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public BacSi getBacSi() {
        return bacSi;
    }

    public void setBacSi(BacSi bacSi) {
        this.bacSi = bacSi;
    }

    public String getTrieuChungBenh() {
        return trieuChungBenh;
    }

    public void setTrieuChungBenh(String trieuChungBenh) {
        this.trieuChungBenh = trieuChungBenh;
    }

    public ArrayList<DichVu> getDsDV() {
        return dsDV;
    }

    public void setDsDV(ArrayList<DichVu> dsDV) {
        this.dsDV = dsDV;
    }

    public void nhapPhieuDieuTri() {
        int k;
        DichVu dv;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma phieu dieu tri: ");
        maPhieu = scanner.nextLine();
        System.out.print("Nhap ngay lap phieu dieu tri: ");
        ngayLap = scanner.nextLine();
        System.out.print("Nhap trieu chung benh nhan: ");
        trieuChungBenh = scanner.nextLine();
        System.out.print("Nhap ngay vao vien: ");
        ngayVaoVien = scanner.nextLine();
        System.out.print("Nhap ngay xuat vien: ");
        ngayXuatVien = scanner.nextLine();
        System.out.print("Nhap thong tin benh nhan: ");
        System.out.println("");
        benhNhan.nhapThongTin();
        System.out.println("Nhap thong tin bac si ");
        bacSi.nhapThongTin();
        System.out.print("Nhap so dich vu benh nhan: ");
        k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.println("Nhap thong tin dich vu thu: " + (i + 1));
            dv = new DichVu();
            dv.nhapDV();
            dsDV.add(dv);
            System.out.println("");
        }
    }

    public float tongTienDV() {
        float tong = 0;
        for (DichVu dv : dsDV) {
            tong += dv.getDonGia();
        }
        return tong;
    }

    public void hienPhieuDieuTri() {
        System.out.println("Ma phieu dieu tri: " + maPhieu);
        System.out.println("Ngay lap phieu: " + ngayLap);
        System.out.println("Ngay vao vien: " + ngayVaoVien);
        System.out.println("Ngay xuat vien: " + ngayXuatVien);
        System.out.println("Trieu chung benh nhan: " + trieuChungBenh);
        benhNhan.hienThongTin();
        bacSi.hienThongTin();
        for (DichVu dv : dsDV) {
            dv.hienDV();
            System.out.println("");
        }
        System.out.println("Tong tien dich vu: " + tongTienDV());
    }
}

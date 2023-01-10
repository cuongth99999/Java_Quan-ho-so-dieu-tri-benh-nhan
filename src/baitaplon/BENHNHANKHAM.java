package baitaplon;

import java.io.Serializable;
import java.util.Scanner;

public class BENHNHANKHAM extends BenhNhan implements Serializable {
    public int soNgayNamVien;

    public BENHNHANKHAM() {
        super();
        soNgayNamVien = 0;
    }

    public int getSoNgayNamVien() {
        return soNgayNamVien;
    }

    public void setSoNgayNamVien(int soNgayNamVien) {
        this.soNgayNamVien = soNgayNamVien;
    }

    public float tinhTienNamVien() {
        return soNgayNamVien * 120000;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so ngay nam vien: ");
        soNgayNamVien = scanner.nextInt();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("So ngay nam vien: " + soNgayNamVien);
        System.out.println("So tien nam vien phai tra: " + tinhTienNamVien());
    }
}

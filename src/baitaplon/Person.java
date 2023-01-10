package baitaplon;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private int tuoi;

    public Person() {
        super();
        hoTen = "";
        diaChi = "";
        gioiTinh = "";
        tuoi = 0;
    }

    public Person(String hoTen, String diaChi, String gioiTinh, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = scanner.nextInt();
    }

    public void hienThongTin() {
         System.out.println("Ho ten: " + hoTen);
         System.out.println("Tuoi: " + tuoi);
         System.out.println("Gioi tinh: " + gioiTinh);
         System.out.println("Dia chi: " + diaChi);
    }
}

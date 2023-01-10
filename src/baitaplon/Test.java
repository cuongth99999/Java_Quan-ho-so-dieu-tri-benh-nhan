package baitaplon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("\t\t\t QUAN LY PHIEU DIEU TRI TAI BENH VIEN");
        System.out.println("1. Nhap danh sach benh nhan kham");
        System.out.println("2. Hien thi danh sach benh nhan kham");
        System.out.println("3. Ghi danh sach benh nhan kham vao file 'thiLTHDT.dat'");
        System.out.println("4. Doc danh sach benh nhan kham tu file 'thiLTHDT.dat'");
        System.out.println("5. Sua thong tin benh nhan kham theo ma benh nhan");
        System.out.println("0. Thoat!");
    }

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        DSBENHNHANKHAM listBNKHAM = new DSBENHNHANKHAM();
        int luachon;

        while(true) {
            menu();
            System.out.print("---> Moi ban chon de thuc hien: ");
            luachon = scanner.nextInt();
            System.out.print("\n");
            switch (luachon) {
                case 1:
                    listBNKHAM.nhapListBNKHAM();
                    break;
                case 2:
                    System.out.println("\t\t\tDANH SACH BENH NHAN KHAM");
                    listBNKHAM.hienListBNKHAM();
                    break;
                case 3:
                    listBNKHAM.ghiFile();
                    System.out.println("GHI FILE THANH CONG!");
                    break;
                case 4:
                    System.out.println("\t\t\tDANH SACH BENH NHAN KHAM TU FILE 'thiLTHDT.dat'");
                    listBNKHAM.docFile();
                    break;
                case 5:
                    listBNKHAM.suaThongTinBNK();
                    System.out.println("\t\t\tDANH SACH BENH NHAN KHAM SAU KHI SUA");
                    listBNKHAM.hienListBNKHAM();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("---> Lua chon sai!");
                    System.out.println("\n");
                    break;
            }
        }
    }
}


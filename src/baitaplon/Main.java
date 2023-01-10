// package baitaplon;

// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.util.Scanner;

// public class Main {
//     public static void menu() {
//         System.out.println("\t\t\t QUAN LY PHIEU DIEU TRI TAI BENH VIEN");
//         System.out.println("1. Nhap danh sach phieu dieu tri");
//         System.out.println("2. Hien thi danh sach phieu dieu tri");
//         System.out.println("3. Them phieu dieu tri");
//         System.out.println("4. Sua phieu dieu tri theo ma phieu");
//         System.out.println("5. Xoa phieu dieu tri theo ma pieu");
//         System.out.println("6. Tong tien dich vu danh sach cac phieu");
//         System.out.println("7. Sap xep danh sach phieu dieu tri Alphabet theo ma phieu");
//         System.out.println("8. Ghi danh sach phieu dieu tri vao file 'DSPhieuDieuTri.dat'");
//         System.out.println("9. Doc danh sach phieu dieu tri tu file 'DSPhieuDieuTri.dat'");
//         System.out.println("0. Thoat!");
//     }

//     public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
//         Scanner scanner = new Scanner(System.in);
//         ListPhieuDieuTri listPDT = new ListPhieuDieuTri();
//         int luachon;

//         while(true) {
//             menu();
//             System.out.print("---> Moi ban chon de thuc hien: ");
//             luachon = scanner.nextInt();
//             System.out.print("\n");
//             switch (luachon) {
//                 case 1:
//                     listPDT.nhapListPDT();
//                     break;
//                 case 2:
//                     listPDT.hienListPDT();
//                     break;
//                 case 3:
//                     listPDT.nhapListPDT();
//                     break;
//                 case 4:
//                     listPDT.suaPhieuDieuTri();
//                     System.out.println("\t\t\tDANH SACH PHIEU DIEU TRI SAU KHI SUA");
//                     listPDT.hienListPDT();
//                     break;
//                 case 5:
//                     listPDT.xoaPhieuDieuTri();
//                     System.out.println("\t\t\tDANH SACH PHIEU DIEU TRI SAU KHI XOA");
//                     listPDT.hienListPDT();
//                     break;
//                 case 6:
//                     listPDT.tongTienCacPhieu();
//                     break;
//                 case 7:
//                     listPDT.sapXepMaPhieuAlphabet();
//                     System.out.println("\t\t\tDANH SACH PHIEU DIEU TRI SAU KHI SAP XEP");
//                     listPDT.hienListPDT();
//                     break;
//                 case 8:
//                     listPDT.ghiFile();
//                     System.out.println("GHI FILE THANH CONG!");
//                     break;
//                 case 9:
//                     System.out.println("\t\t\tDANH SACH PHIEU DIEU TRI TU FILE 'DSPhieuDieuTri.dat'");
//                     listPDT.docFile();
//                     break;
//                 case 0:
//                     System.exit(0);
//                 default:
//                     System.out.print("---> Lua chon sai!");
//                     System.out.println("\n");
//                     break;
//             }
//         }
//     }
// }

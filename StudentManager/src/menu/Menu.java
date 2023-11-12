package menu;

import services.StudentManager;

import java.util.Scanner;

public class Menu {
   StudentManager studentManager = new StudentManager();
   Scanner inputInt = new Scanner(System.in);
   Scanner inputString = new Scanner(System.in);
   public void showMenu(){
       int choice;
       do {
          System.out.println("------ Menu ------\n" +
                  "1. Hiện thị tất cả học sinh \n" +
                  "2. Tìm học sinh theo ID \n" +
                  "3. Tìm học sinh theo tên \n" +
                  "4. Sửa thông tin học sinh \n" +
                  "5. Xóa thông tin học sinh \n" +
                  "0. Thoát");
          System.out.println("Nhập lựa chọn: ");
          choice = inputInt.nextInt();
       } while (choice != 0);
   }
}

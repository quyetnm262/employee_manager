package buoi5_baitap.bai12;

import java.util.Scanner;

public class Main {

    static void displayMenu(String[] str){
        for (String s: str   ) {
            System.out.println(s);
        }
        System.out.println("Choose one : ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        EmployeeManage employeeManage = new EmployeeManage();

        String[] str = {"---------Menu---------",
                "1. Add/edit a employee ",
                "2. Show all employee",
                "3. Delete employee with id",
                "4. Find employee by type",
                "5. Exit"};
        while (flag){
            displayMenu(str);
            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    employeeManage.addOrEditEmployee();

                    break;

                case 2:
                    employeeManage.showAllEmployee();

                    break;
                case 3:
                    employeeManage.deleteEmployee();


                    break;
                case 4:
                    employeeManage.findByType();


                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Choose again !! ");

                    break;

            }

        }
    }
}

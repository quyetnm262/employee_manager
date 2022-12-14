package buoi5_baitap.bai12;

import java.util.Scanner;

public class EmployeeManage {
    Scanner sc = new Scanner(System.in);
    Employee[] listEmployee;
    int employee_count;
    private int indexOfEmp;

    public EmployeeManage(){
        listEmployee = new Employee[100];
        employee_count = 0;
    }
    public void editEmployee(){
        System.out.println("Enter employee type ?");
        System.out.println("0. Experience");
        System.out.println("1. Fresher");
        System.out.println("2. Intern");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){
            case 0:
                listEmployee[indexOfEmp].setEmployee_type(0);
                listEmployee[indexOfEmp].changeEmployee();

                break;
            case 1:
                listEmployee[indexOfEmp].setEmployee_type(1);
                listEmployee[indexOfEmp].changeEmployee();

                break;
            case 2:
                listEmployee[indexOfEmp].setEmployee_type(2);
                listEmployee[indexOfEmp].changeEmployee();

                break;
            default:
                System.out.println("Choose wrong option !!");

                break;
        }
    }
    public void addOrEditEmployee(){
        System.out.println("Enter ID");
        String id = sc.nextLine();
        if (searchEmployee(id)){
            System.out.println("Found ID "+id);
            System.out.println("Edit employee");
            System.out.println("-----");
            editEmployee();

        }else {
            System.out.println("Not found ID "+id);
            System.out.println("Add new employee");
            System.out.println("-----");
            addEmployee();
        }
    }
    public void addEmployee(){
        System.out.println("Enter employee type ?");
        System.out.println("0. Experience");
        System.out.println("1. Fresher");
        System.out.println("2. Intern");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){

            case 0:
                Experience experience = new Experience();
                experience.changeEmployee();
                listEmployee[employee_count] = experience;
                employee_count++;
                break;


            case 1:
                Fresher fresher = new Fresher();
                fresher.changeEmployee();
                listEmployee[employee_count] = fresher;
                employee_count++;

                break;

            case 2:
                Intern intern = new Intern();
                intern.changeEmployee();
                listEmployee[employee_count] = intern;
                employee_count++;

                break;

            default:
                System.out.println("Choose wrong option !!");

                break;
        }
    }

    public boolean searchEmployee( String id){
        boolean check = false ;
        for (int i = 0; i < employee_count; i++) {
            if (id.equals(listEmployee[i].getId())){
                check = true;
                indexOfEmp = i;
                break;
            }
        }
        return check;
    }
    public void showAllEmployee(){
        for (int i = 0; i < employee_count; i++) {
            listEmployee[i].showInfo();
        }
    }

    public void deleteEmployee(){
        System.out.println("Enter ID of employee wanna delete");
        String id = sc.nextLine();
        if (searchEmployee(id)){
            for (int i = 0; i < employee_count; i++) {
                if (id.equals(listEmployee[i].getId())){
                    if (i == employee_count-1){
                        employee_count--;
                    }else {
                        for (int j = i; j < employee_count-1 ; j++) {
                            listEmployee[j] = listEmployee[j+1];
                        }
                        employee_count--;
                        break;
                    }
                }
            }
            System.out.println("Employee with ID = "+ id +" is removed!!");

        }else {
            System.out.println("Not found employee with id "+id);
        }
    }

    public void findByType(){
        System.out.println("Enter type of employee wanna find");
        System.out.println("0. Experience");
        System.out.println("1. Fresher");
        System.out.println("2. Intern");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){
            case 0:
                for (int i = 0; i < employee_count; i++) {
                    if (listEmployee[i] instanceof Experience){
                        listEmployee[i].showInfo();
                    }
                }
                break;
            case 1:
                for (int i = 0; i < employee_count; i++) {
                    if (listEmployee[i] instanceof Fresher){
                        listEmployee[i].showInfo();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < employee_count; i++) {
                    if (listEmployee[i] instanceof Intern){
                        listEmployee[i].showInfo();
                    }
                }
                break;
            default:
                System.out.println("Enter wrong employee type!!");
                break;
        }

    }
}

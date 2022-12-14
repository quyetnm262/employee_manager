package buoi5_baitap.bai12;

import buoi5_baitap.bai12.validate.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String id;
    private String fullName;
    private Date birthday;
    private String phone;
    private String email;
    private int employee_type;

    protected Certificate[] listCer;
    protected int lengthOfList;
    public Employee(){
        listCer = new Certificate[100];
    }


    public void changeEmployee(){


        System.out.println("Enter id:");
        this.id = sc.nextLine();

        //Check valiate of fullname
        FullNameCheck fullNameCheck = new FullNameCheck();
        try {
            System.out.println("Enter fullName:");
            this.fullName = sc.nextLine();
            fullNameCheck.checkFullName(this.fullName);

        }catch (NameException nx){
            System.out.println("Error: "+nx.getMessage());
        }
        //---------------------

        ////Check valiate of birthday
        DateCheck dateCheck = new DateCheck();

        try {
            System.out.println("Enter birthday:");
            this.birthday = sdf.parse(sc.next());
            dateCheck.checkDate(sdf.format(this.birthday));

        }catch (DateException | ParseException dx){
            System.out.println("Error: "+dx.getMessage());
        }
        //------------------

        //Check valiate of phone
        PhoneCheck phoneCheck = new PhoneCheck();
        try {
            System.out.println("Enter phone:");
            this.phone = sc.nextLine();
            phoneCheck.checkPhone(this.phone);
        }catch (PhoneException px){
            System.out.println("Error: "+px.getMessage());

        }
        //-------------------------

        //Check valiate of email
        EmailCheck emailCheck = new EmailCheck();
        try{
            System.out.println("Enter email");
            this.email = sc.nextLine();
            emailCheck.checkEmail(this.email);

        }catch (EmailException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        //----------------------

        System.out.println("Enter the number of certificate");
        this.lengthOfList = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < lengthOfList; i++) {
            Certificate certificate = new Certificate();
            certificate.addCertificate();
            listCer[i] = certificate;
        }
    }

    public String getId() {
        return id;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }
    public void showInfo(){
        System.out.println(this.toString());
        for (int i = 0; i < lengthOfList; i++) {
            System.out.println("Information of certificate "+(i+1));
            listCer[i].showCertificate();
        }

    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + sdf.format(this.birthday) +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employee_type=" + employee_type;
    }
}

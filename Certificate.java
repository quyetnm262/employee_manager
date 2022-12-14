package buoi5_baitap.bai12;

import buoi5_baitap.bai12.validate.DateCheck;
import buoi5_baitap.bai12.validate.DateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Certificate {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String certificatedID;
    private String certificatedName;
    private String certificatedRank;
    private Date certificatedDate;

    public void addCertificate(){

        System.out.println("Enter certificatedID");
        this.certificatedID = sc.nextLine();
        System.out.println("Enter certificatedName");
        this.certificatedName = sc.nextLine();
        System.out.println("Enter certificatedRank");
        this.certificatedRank = sc.nextLine();
        //Check validate of certificatedDate
        DateCheck dateCheck = new DateCheck();
        try {
            System.out.println("Enter certificatedDate");
            this.certificatedDate = sdf.parse(sc.next());
            dateCheck.checkDate(sdf.format(this.certificatedDate));
        }catch (DateException | ParseException dx){
            System.out.println("Error: "+dx.getMessage());
        }
    }
    public void showCertificate(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\tCertificate{" +
                "certificatedID='" + certificatedID + '\'' +
                ", certificatedName='" + certificatedName + '\'' +
                ", certificatedRank='" + certificatedRank + '\'' +
                ", certificatedDate=" + sdf.format(certificatedDate) +
                '}';
    }
}

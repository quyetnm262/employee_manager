package buoi5_baitap.bai12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fresher extends Employee{
    private Date graduate_date;
    private String graduate_rank;
    private String education;

    public Fresher(){
        super.setEmployee_type(1);
    }
    @Override
    public void showInfo() {
        System.out.print("Fresher: ");
        super.showInfo();
        showMe();
    }
    public void showMe(){
        System.out.println("\t, graduate_date = "+this.graduate_date+
                ", graduate_rank = "+ this.graduate_rank+
                ", education = "+this.education);
    }

    @Override
    public void changeEmployee() {
        super.changeEmployee();
        try{
            System.out.println("Enter graduate date");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            this.graduate_date = sdf.parse(sc.next());
            sc.nextLine();
            System.out.println("Enter graduate rank");
            this.graduate_rank = sc.nextLine();
            System.out.println("Enter education");
            this.education = sc.nextLine();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}

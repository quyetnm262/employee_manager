package buoi5_baitap.bai12;

public class Experience extends Employee{
    private int explnYear;
    private String proSkill;
    public Experience(){
        super.setEmployee_type(0);
    }

    @Override
    public void showInfo() {
        System.out.print("Experience: ");
        super.showInfo();
        showMe();
    }

    public void showMe(){
        System.out.println("\t, explnYear = "+this.explnYear+
                ", proSkill = "+this.proSkill);
    }

    @Override
    public void changeEmployee() {
        super.changeEmployee();

        try{
            System.out.println("Enter experience year");
            this.explnYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter pro skill");
            this.proSkill = sc.nextLine();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

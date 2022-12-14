package buoi5_baitap.bai12;

public class Intern extends Employee{
    private String major;
    private int semester;
    private String university_name;

    public Intern(){
        super.setEmployee_type(2);
    }
    @Override
    public void showInfo() {
        System.out.print("Intern: ");
        super.showInfo();
        showMe();
    }
    public void showMe(){
        System.out.println("\t, major = "+this.major+
                ", semester = "+this.semester+
                ", university_name = "+this.university_name);
    }

    @Override
    public void changeEmployee() {
        super.changeEmployee();
        try {
            System.out.println("Enter major");
            this.major = sc.nextLine();
            System.out.println("Enter semester");
            this.semester = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter university name ");
            this.university_name = sc.nextLine();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

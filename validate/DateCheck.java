package buoi5_baitap.bai12.validate;

public class DateCheck {
    public void checkDate(String date) throws DateException {

        if (date.length() != 8){
            throw new DateException("Date is not enough 8 symbols");
        }
        int year = Integer.parseInt(date.substring(0,3));
        int month =Integer.parseInt(date.substring(4,5));
        int day =Integer.parseInt(date.substring(6,7));
        if (year < 1800){
            throw new DateException("Year is not valid");
        }
        if (month < 1 || month > 12 ) {
            throw new DateException("Month is not valid");
        }
        if (day <1 || day >31){
            throw new DateException("Day is not valid");
        }
        if (month == 2 && day >29){
            throw new DateException("February have max 29 days");
        }
        if (month%2 == 0 && month != 2 && day >30){
            throw new DateException("Even month (except Feb) have max 30 days");
        }else {
            throw new DateException("Date is valid");
        }
    }
}

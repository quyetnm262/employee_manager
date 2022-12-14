package buoi5_baitap.bai12.validate;

public class PhoneCheck {
    public void checkPhone(String phone) throws PhoneException {

        int length = phone.length();
        if (length != 10){
            throw new PhoneException("Phone is not enough 10 numbers");
        }else {
            throw new PhoneException("Phone is valid");
        }
    }
}

package buoi5_baitap.bai12.validate;

import buoi5_baitap.bai12.validate.EmailException;

public class EmailCheck {
    public void checkEmail(String str) throws EmailException {
        int index = str.indexOf("@");

        if (index == -1){
            throw new EmailException("Email not contain '@'");
        }
        if (index == 0){
            throw new EmailException("Email not valid because @ at first");
        }
        index = str.indexOf("@",index+1);
        if (index != -1){
            throw new EmailException("Email not valid because more than one symbol '@' ");
        }else {
            throw new EmailException("Email is valid");
        }
    }
}

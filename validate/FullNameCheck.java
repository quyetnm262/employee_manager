package buoi5_baitap.bai12.validate;

public class FullNameCheck {
    public void checkFullName(String fullName) throws NameException {
        fullName = fullName.trim();
        if (!(fullName.contains(" "))){
            throw new NameException("Full name includes first and last name");
        }else {
            throw new NameException("Full name is valid");
        }
    }
}

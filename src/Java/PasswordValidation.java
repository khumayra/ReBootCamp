package Java;

public class PasswordValidation {
    public static void main(String[] args) {
        passwordValidationMethod("abcdeAgs3423@");
        checkPasswordValidationUsingRegEx("a?G6jdsaja");
    }

    public static void passwordValidationMethod(String pass) {
        boolean length=false;
        boolean isUpperCase =false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean isSpecial = false;
        if (pass.length() >= 8)  length=true;
            for (int i = 0; i < pass.length(); i++) {
                char curChar = pass.charAt(i);
                if(Character.isUpperCase(curChar)&&!isUpperCase) isUpperCase=true;
                if(Character.isLowerCase(curChar)&&!isLowerCase) isLowerCase=true;
                if(Character.isDigit(curChar)&&!isDigit) isDigit=true;
                if(!Character.isLetter(curChar) && !Character.isDigit(curChar)&&!isSpecial) isSpecial=true;

            }

        System.out.println("isSpecial = " + isSpecial);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLowerCase = " + isLowerCase);
        System.out.println("isUpperCase = " + isUpperCase);

        if(isDigit&&isLowerCase&&isSpecial&&isUpperCase) {
            System.out.println("The password is valid");
        } else{
            System.out.println("The password is NOT valid!");
        }

    }
    public static void checkPasswordValidationUsingRegEx(String password){

        boolean length = password.length() >= 8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@.,#$?].*");

        boolean valid = length && lower && upper && number && special;

        if(valid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Not a valid password");
        }
    }
}


import java.util.Scanner;

public class PasswordStrengthChecker {
    //Day 4
    //Check if there are at least 8 characters in the password
    public static boolean passwordLengthChecker(String password){
        return password.length() >= 8;
    }
    //Check if there are lower and uppercase letters
    public static boolean lowerCaseCheck(String password){
        boolean check = false;
        char c;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isLowerCase(c)){
                check = true;
                return check;
            }
        }
        return check;
    }

    public static boolean upperCaseCheck(String password){
        boolean check = false;
        char c;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isUpperCase(c)){
                check = true;
                return check;
            }
        }
        return check;
    }

    //Check if the password contains a digit
    public static boolean digitCheck(String password){
        boolean check = false;
        char c;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isDigit(c)){
                check = true;
                return check;
            }
        }
        return check;
    }

    //Check if the password contains a special character
    public static boolean specialCharCheck(String password){
        boolean check = false;
        char c;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if("!@#$%^&*".contains(String.valueOf(c))){
                check = true;
                return check;
            }
        }
        return check;
    }

    //Check if password meets all criteria
    public static void finalCheck(boolean lower, boolean upper, boolean digit, boolean special){
        boolean[] conditions = {lower, upper, digit, special};
        String[] issues = { //Error messages to the corresponding bools
            "Missing lowercase letter!",
            "Missing uppercase letter!",
            "Missing digit!",
            "Missing special character!"
    };
        boolean allPassed = true;

        for(int i = 0; i < conditions.length; i++){ //Check that all conditions are true
            if(!conditions[i]){
                System.out.println(issues[i]);
                allPassed = false;
            }
        }

        if(allPassed){
            System.out.print("Password is STRONG!");
        } else{
            System.out.println("Password is WEAK! Address issues above!");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        finalCheck(lowerCaseCheck(password), upperCaseCheck(password), digitCheck(password), specialCharCheck(password));

        input.close();
    }
}

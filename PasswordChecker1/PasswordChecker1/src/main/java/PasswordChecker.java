import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    public boolean passwordIsValid(String psswrd){
        char [] changeit = psswrd.toCharArray();
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher match = special.matcher(psswrd);

        try {
            if(psswrd.length() != 0){
                if(psswrd.length() >= 8){
                    for(int u=0; u<changeit.length; u++){
                        if(Character.isUpperCase(changeit[u])){
                            for(int l=0;l<changeit.length; l++){
                                if(Character.isLowerCase(changeit[l])){
                                    for(int d=0; d<changeit.length; d++){
                                        if(Character.isDigit(changeit[d])){
                                            if(match.find()) {
                                                System.out.println("your password is valid");
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }


                }else{System.out.println("your password is in valid");}
            }else{
                System.out.println("this field can't be empty!");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return true;
    }

    public boolean passwordIsOk(String psswrd){
        Pattern upper = Pattern.compile("[A-Z]");
        Pattern lower = Pattern.compile("[a-z]");
        Pattern number = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher upp = upper.matcher(psswrd);
        Matcher low = lower.matcher(psswrd);
        Matcher num = number.matcher(psswrd);
        Matcher spec = special.matcher(psswrd);

        if(psswrd.length() != 0){
            if(psswrd.length() >= 8){
                if(upp.find()){
                    System.out.println("2 conditions passed + upperCase");
                    return true;
                }else if(low.find()){
                    System.out.println("2 conditions passed + lowerCase");
                    return true;
                }else if(num.find()){
                    System.out.println("2 conditions passed + number");
                    return true;
                }else if(spec.find()){
                    System.out.println("2 conditions passed + special-character");
                }else {
                    System.out.println("your password doesn't meet requirments");
                    return false;
                }
            }else{
                System.out.println("your password is should be longer than 8");
            }
        }else{
            System.out.println("this field can't be empty");
            return false;
        }
        return true;
    }


    public static void main(String[] args){
        Scanner  scan = new Scanner(System.in);
        System.out.println("please enter your password");
        String input = scan.nextLine();
        PasswordChecker pass = new PasswordChecker();
        //pass.passwordIsValid(input);
        pass.passwordIsOk(input);
    }
}


import java.util.*;

public class PasswordChecker{

	public void PasswordChecker(){
		System.out.println("Welcome"); 
	}

	public static boolean passwordIsValid(String psswrd){
		String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
		String[] special_chars = specialChars.split(" ");
		char[] changeit = psswrd.toCharArray();
		if(psswrd.length() != 0){
			if(psswrd.length() >= 8){
				for(int u=0; u<changeit.length; u++){
					if(Character.isUpperCase(changeit[u])){
						System.out.println("heyy");
						for(int l=0;l<changeit.length; l++){
							if(Character.isLowerCase(changeit[l])){
								for(int d=0; d<changeit.length; d++){
									if(Character.isDigit(changeit[d])){
										for(int s=0; s<special_chars.length; s++){
											if(special_char[s]
										}
									}
								}
							}
						}
					}
				}
				
				
			}else{System.out.println("your password is in valid");}
	}else{
		System.out.println("hhhh");
	}
	return true;
      }

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your passworod");
		String pass = scan.nextLine();
		passwordIsValid(pass);

	}
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment_no9 {
    public static void main(String[] args) {
      String password="4788@azyba";
      if(password.length()>=8L){

          //Number check
          Pattern ptr=Pattern.compile("\\d");
          Matcher num=ptr.matcher(password);
          int numCount=0;
          while(num.find()) numCount++;

          //Symbol check
          Pattern p=Pattern.compile("[!@#&?]");
          Matcher sym=p.matcher(password);
          int sysCount=0;
          while (sym.find()) sysCount++;

         if(numCount>=2 && sysCount>=1){
             boolean valid=false;
            for(int i=0;i<password.length();i++){
                char c=password.charAt(i);
                if(!((c>=65 && c<=90) ||(c>=97 && c<=122) || (c=='!' || c=='@' || c=='#' || c=='&' ||c=='?'))){
                    valid=true;
                    break;
                }
            }
             if (valid){
                 System.out.println("It is a valid password");
                 return;
             }

         }
      }
        System.out.println("It is a invalid password");
    }
}

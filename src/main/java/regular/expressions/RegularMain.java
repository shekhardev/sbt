package regular.expressions;

import java.util.regex.*;
public class RegularMain {
    public static void main(String[] args) {

        String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
        String strangeString = " 1Z aaa **** *** {{{ {{ { ";

        regExChk("\\s[A-Za-z]{2,20}\\s",longString);
    }
    public static void regExChk(String theReg,String str2Check){

        Pattern chkRegex = Pattern.compile(theReg);
        Matcher regexMath = chkRegex.matcher(str2Check);

        while (regexMath.find()){
            if (regexMath.group().length() !=0){
                System.out.println(regexMath.group().trim());
            }
            System.out.println("Start Index " + regexMath.start());
            System.out.println("End Index" + regexMath.end());
        }
    }
}

package StringMutable;

public class StringMutable {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Sekhar ");
        sbf.append("Reddy");
        sbf.replace(0,6,"Shresta");
        System.out.println(sbf.hashCode());

        //\u000d System.out.println("ex");


        System.out.println(sbf);

        String str = "Hello";
        String str1 = "Hello";

        System.out.println(str);
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        String str2 = new String("Hello");
        System.out.println(str2.hashCode());

        String s=50+30+"Sachin"+(40+40);
        System.out.println(s);//80Sachin4040
    }
}

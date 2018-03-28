package recurisionexample;

public class Main {
    public static void main(String[] args) {
        System.out.println(catEyes(5));
    }
    public static int catEyes(int cats){
        if(cats ==0){
            return 0;
        }else {
            return 2 + catEyes(cats -1);
        }
    }
}

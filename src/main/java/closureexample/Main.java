package closureexample;

public class Main {
    public static void main(String[] args) {
        int x =30;
        int y= 40;

        doPerform(x, n -> System.out.println(n+y));

    }
    private static void doPerform(int i, ClosureExample c){
        c.operate(i);
    }
}

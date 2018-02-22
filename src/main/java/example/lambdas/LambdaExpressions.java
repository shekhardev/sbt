package example.lambdas;

public class LambdaExpressions {

    static  int doMathOperation(int a, int b, ImathOperation mathoperation){
        return mathoperation.run(a,b);
    }
    public static void main(String[] args) {
        ImathOperation addition = (int a, int b) -> a + b;
        ImathOperation subtraction = (int a, int b) -> a - b;
        ImathOperation multiplication = (int a, int b) -> a * b;

        System.out.println(doMathOperation(2, 1, addition));
        System.out.println(doMathOperation(2, 1, subtraction));
        System.out.println(doMathOperation(2, 1, multiplication));
    }
}

package kr.co.clozet.lambda;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-09
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class MyLambda {
    @FunctionalInterface interface MyFunction{
        int execute(String arg);
    }
    @FunctionalInterface interface MyConsumer{
        void execute(String arg);
    }
    @FunctionalInterface interface MySupplier{
        int execute();
    }
    @FunctionalInterface interface MyPredicate{
        boolean execute(String arg);
    }
    @FunctionalInterface interface MyInterface{
        String myMothod();
    }
    @FunctionalInterface interface MyUnaryOp{
        int operator(Integer arg);
    }
    @FunctionalInterface interface MathOperation{
        int execute(int a, int b, int c);
    }
}

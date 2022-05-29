package kr.co.clozet.lambda;
import org.hibernate.dialect.Ingres9Dialect;


import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.function.*;

/**
 * packageName:kr.co.clozet.common.lambda
 * fileName        : Lambda
 * author           : kimyunseop
 * date               : 2022-05-11
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class Lambda{

    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);

    }
    public static String date(){
       // Supplier<Object> f = LocalDate::now;
        Supplier<String> f = () -> string(LocalDate.now());
        return f.get();
    }
    public static String date1(){
        Supplier<Date> f = Date::new;
        return String.valueOf(f.get());
    }
    public static Object date2(){
        Supplier<Object> f = LocalDate::now;
        return String.valueOf(f.get());
    }
    public static String date3(){
        Supplier<String> f = () -> new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        return f.get();
    }
    public static String string(Object o){
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
        // String s = String.valueOf(Object);

    }

    //int [] arr = new int[8];
    // = int[]::new
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }
    public static int[] array(int arr){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(arr);
    }
    public static double dice(){
        Supplier<Double> s = Math::random;
        return (s.get() * 6) +1;
    }
    public static int random2(int min, int max){
        //BiFunction<Integer, Integer, Double> s = Math::random;
        Supplier<Double> s = Math::random;
        return (int)(s.get()*max)+min;
    }
    public static int random(int min, int max){
        BiFunction<Integer, Integer, Integer> f = (min1, max2) -> (int)(Math.random()*max2)+min1;
        return f.apply(min, max);
    }
    public static String choi(int i){
    Function<Integer, String> f = String::valueOf;
    return f.apply(i);
    }
    public static File makeFile(String file){
        Function<String, File> f = File::new;
        return f.apply(file);
    }
}

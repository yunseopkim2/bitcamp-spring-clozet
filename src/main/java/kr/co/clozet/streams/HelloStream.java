package kr.co.clozet.streams;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

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
//한국어로 안녕, 영어로 Hello

public class HelloStream {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Hello {
        private String greeting, inLanguage;


        @Override
        public String toString(){
            return String.format( "인사 : %s, %s", inLanguage, greeting);
        }
    }

    interface HelloService {
        Set<Hello> great(List<Hello> arr);
        }
        static class HelloServiceImpl implements HelloService{
            @Override
            public  Set<Hello>  great(List<Hello> arr) {

                return arr
                        .stream()
                        .filter(e -> e.getInLanguage().equals("영어"))
                        .collect(Collectors.toSet());

            }
        }
        @Test
        void helloTest() {
            List<Hello> arr = Arrays.asList(
                    Hello.builder().inLanguage("영어").greeting("Hello").build(),
                Hello.builder().inLanguage("한국어").greeting("안녕").build()
            );
            new HelloServiceImpl()
                    .great(arr)
                    .forEach(System.out::println);
}}


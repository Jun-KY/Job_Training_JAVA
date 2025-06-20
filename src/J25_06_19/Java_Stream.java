package J25_06_19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 데이터를 일련의 단계로 처리하는 흐름.
// With Lambda, make it short and easier
// 함수형 스타일 데이터 better than 'Iterator' or 'For'
public class Java_Stream {


    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);
        Stream<Integer> stream = numbers.stream();

//        Stream<Integer> s = Arrays.stream(abc);

        //General
/*
        a.method1();
        a.method2();
        a.method3();

        //Method chaining
        b.method1().method2().method3();
        실수유발 방지
 */
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) //필터 값에 남는 것만 쓴다
//                .mapToInt(Integer::intValue)
//                .mapToInt(x -> x)
                .mapToInt(x -> x.intValue())
                .sum(); //(2, 4)
        System.out.println(sum);

        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0); // 안전장치
        System.out.println(avg);
    }
}

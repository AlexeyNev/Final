package stream;

import java.util.stream.Stream;

/*
distinct() - Возвращает stream уникальных элементов (проверяет с помощью equals)
count() - считает количество элементов в стриме и возвращает Long
peak() - принимает в параметры Consumer и возвращает Stream
 */
public class Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3);
//        stream.distinct().forEach(System.out::println);
//        System.out.println(stream.count());
        stream.distinct().peek(System.out::println);
    }
}

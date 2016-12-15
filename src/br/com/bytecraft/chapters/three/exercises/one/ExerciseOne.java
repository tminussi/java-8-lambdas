package br.com.bytecraft.chapters.three.exercises.one;

import java.util.stream.Stream;

public class ExerciseOne {

    public static void main(String[] args) {
        Integer total = Stream.of(1, 10, 11, 9, 15, 30, 45, 34)
                .reduce(0, (current, next) -> current + next);

        System.out.println(total);
    }
}

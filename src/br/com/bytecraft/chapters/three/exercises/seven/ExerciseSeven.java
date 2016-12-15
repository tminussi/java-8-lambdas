package br.com.bytecraft.chapters.three.exercises.seven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class ExerciseSeven {

    public static void main(String[] args) {
        List<String> randomStrings =
                Arrays.asList("ThiSIsASuPErRaNDOmGEnERAtedSTrinG",
                                "ThiSIsASuPErRaNDOmGEnERAtedSTrinGWiThAFewMOReCHARACteRS",
                                "ThiSIsARanDOMStrinG",
                                "JUStAnothervalEu",
                                "ilovelambdaandstreamapi");

        Optional<String> longestStreamWithLowerCaseLetters = randomStrings.stream()
                .max(comparing(word -> word.chars()
                        .filter(Character::isLowerCase)
                        .count()));

        System.out.println(longestStreamWithLowerCaseLetters.get());
    }
}

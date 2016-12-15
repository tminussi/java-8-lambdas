package br.com.bytecraft.chapters.three.exercises.six;

public class ExerciseSix {

    public static void main(String[] args) {
        String random = "ThiSIsASuPErRaNDOmGEnERAtedSTrinG";

        long count = random.chars()
                .filter(Character::isLowerCase)
                .count();

        System.out.println(count);
    }
}

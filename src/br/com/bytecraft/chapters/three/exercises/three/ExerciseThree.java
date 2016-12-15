package br.com.bytecraft.chapters.three.exercises.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExerciseThree {

    private static Collection<Artist> artists;

    {
        artists = new ArrayList<>();
        artists.add(new Artist("Papa Roach", "United States",
                Arrays.asList(new Member("Jacob Shaddix", "Singer"),
                        new Member("Jerry Horton", "Guitarist"),
                        new Member("Tony Palermo", "Drummer"))));
        artists.add(new Artist("Jorge & Matheus", "Brazil",
                Arrays.asList(new Member("Jorge", "Singer"),
                        new Member("Matheus", "Guitarist"))));
        artists.add(new Artist("George Ezra", "England",
                Arrays.asList(new Member("George Ezra", "Singer/Songwriter"))));
    }

    public static void main(String[] args) {
        new ExerciseThree();
        long totalMembersFromAllBands = artists.stream()
                .flatMap(artist -> artist.getMembers().stream())
                .count();
        System.out.println(totalMembersFromAllBands);

        long totalMembersFromBandsStartingWithP = artists.stream()
                .filter(artist -> artist.getName().startsWith("P"))
                .flatMap(artist -> artist.getMembers().stream())
                .count();

        System.out.println(totalMembersFromBandsStartingWithP);
    }
}

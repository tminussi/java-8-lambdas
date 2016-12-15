package br.com.bytecraft.chapters.three.exercises.two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseTwo {

    private static Collection<Artist> artists;

    {
        artists = new ArrayList<>();
        artists.add(new Artist("Jacob Shaddix", "United States"));
        artists.add(new Artist("Jorge & Matheus", "Brazil"));
        artists.add(new Artist("Eddie Vedder", "United States"));
        artists.add(new Artist("George Ezra", "England"));
        artists.add(new Artist("Jimmy Somerville", "Scotland"));
    }

    public static void main(String[] args) {
        new ExerciseTwo();
        List<String> artistsAndOrigins = artists.stream()
                .map(Artist::toString)
                .collect(Collectors.toList());

        System.out.println(artistsAndOrigins);
    }
}

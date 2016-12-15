package br.com.bytecraft.chapters.three.exercises.two;

public class Artist {

    private String name;

    private String origin;

    public Artist(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}

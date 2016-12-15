package br.com.bytecraft.chapters.three.exercises.three;

import java.util.ArrayList;
import java.util.Collection;

public class Artist {

    private String name;

    private String origin;

    private Collection<Member> members = new ArrayList<>();

    public Artist(String name, String origin, Collection<Member> members) {
        this.name = name;
        this.origin = origin;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public Collection<Member> getMembers() {
        return members;
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

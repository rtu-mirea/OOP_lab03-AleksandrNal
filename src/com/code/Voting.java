package com.code;

import java.util.*;


public class Voting {
    private String title;
    private List<Candidate> candidats;

    Voting(String title){
        this.title = title;
        this.candidats = new ArrayList<Candidate>();
    }

    public String getTitle(){
        return title;
    }

    public void add_Candidate(String name){
        candidats.add(new Candidate(name));
    }

    public Candidate find_Candidate(String name){
        for (Candidate candidate : candidats){
            if (candidate.getName().compareTo(name) == 0)
                return candidate;
        }
        return null;
    }

    public void add_voice(String name){
        for (Candidate candidate : candidats){
            if (candidate.getName().compareTo(name) == 0)
                candidate.addVoices();
        }
    }

    public void sort (){
        candidats.sort(new Comparator<Candidate>() {
            @Override
            public int compare(final Candidate entry1, final Candidate entry2) {
                return Integer.compare(entry2.getVoices(), entry1.getVoices());
            }
        });
    }

    public List getList(){
        return candidats;
    }

    public Candidate getCandidat(int i) {
        return candidats.get(i);
    }
}

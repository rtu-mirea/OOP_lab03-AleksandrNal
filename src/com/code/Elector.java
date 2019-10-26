package com.code;

public class Elector {
    private boolean voted;

    Elector(){
        voted = false;
    }

    public void vote(){
        voted = true;
    }
    public boolean isVoted(){
        return voted;
    }
}

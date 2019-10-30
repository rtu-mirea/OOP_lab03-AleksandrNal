package com.code;


public class Elector extends User{
    private boolean voted;

    Elector(String name, String login, String password){
        super(name, login, password);
        voted = false;
    }

    public void vote(){
        voted = true;
    }

    public boolean isVoted(){
        return voted;
    }
}

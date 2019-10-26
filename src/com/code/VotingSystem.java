package com.code;

public class VotingSystem {
    private User[] users;
    private Voting currentVoting;
    private User currentUser;

    public User addUser(String name, String login, String password, String repeation){
        User user = new User(name, login, password);
        return user;
    }

    public static void main(String[] args) {

    }
}

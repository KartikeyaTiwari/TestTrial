package com.example.dell.testtrial;

public class Message {
    private String text;
    private Chatact.MemberData data;
   public boolean belongsToCurrentUser;

    public Message() {
        this.text = text;
        this.data = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public Chatact.MemberData getData() {
        return data;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
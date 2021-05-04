package com.example.chatting;

public class nearest {
    String loc;
    String id;
    public nearest(String l, String i)
    {
        loc=l;
        id=i;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String ll) {
        this.loc = ll;
    }
    public String getId() {
        return id;
    }
    public void setId(String ii)
    {
        this.id = ii;
    }
}

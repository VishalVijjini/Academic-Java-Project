/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */
public class OnlineUsers {
    private String friend_id;
    private String online;

    public OnlineUsers(String friend_id, String online) {
        this.friend_id = friend_id;
        this.online = online;
    }

    public String getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(String friend_id) {
        this.friend_id = friend_id;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }
    
    
}

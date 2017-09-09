/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */
public class view_list {
    private String who_viewed;
    private String whom_viewed;
    private int view_count;

    public view_list(String who_viewed, String whom_viewed, int view_count) {
        this.who_viewed = who_viewed;
        this.whom_viewed = whom_viewed;
        this.view_count = view_count;
    }

    public String getWho_viewed() {
        return who_viewed;
    }

    public void setWho_viewed(String who_viewed) {
        this.who_viewed = who_viewed;
    }

    public String getWhom_viewed() {
        return whom_viewed;
    }

    public void setWhom_viewed(String whom_viewed) {
        this.whom_viewed = whom_viewed;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }
    
    
}

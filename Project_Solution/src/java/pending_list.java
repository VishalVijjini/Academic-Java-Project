/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */
public class pending_list {
     private String Sender_id;
     private String Receiver_id;
     private String Status;
     private String Date;
     private String message;

    public pending_list(String Sender_id, String Receiver_id, String Status, String Date, String message) {
        this.Sender_id = Sender_id;
        this.Receiver_id = Receiver_id;
        this.Status = Status;
        this.Date = Date;
        this.message = message;
    }

     
    public String getSender_id() {
        return Sender_id;
    }

    public void setSender_id(String Sender_id) {
        this.Sender_id = Sender_id;
    }

    public String getReceiver_id() {
        return Receiver_id;
    }

    public void setReceiver_id(String Receiver_id) {
        this.Receiver_id = Receiver_id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
     
     
}

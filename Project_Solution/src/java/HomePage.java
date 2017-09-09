
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */

public class HomePage {
    
    private static String my_user_id;
    private String my_password;
    private String my_user_name;
    private String my_maritalstatus;
    private String my_height;
    private int my_age;
    private String my_ethnicity;
    private String my_intrest1;
    private String my_intrest2;
    private String my_intrest3;
    private String my_intrest4;
    private String my_location;
    //private Blob my_profile_pic;
    private String my_profile_pic;
    private String accept_request_id;
    private String reject_request_id;
    private ArrayList<pending_list> myPendingList;
    private ArrayList<friends_list> myFriendList;
    private ArrayList<messages_list> myMessagesList;
    private List<String> Sender_id;
    private String our_status;
    private String Send_Msg;
    //go to search
    private Search search_user;
    private String Online;
    private ArrayList<view_list> myViewList;

    public ArrayList<view_list> getMyViewList() {
        return myViewList;
    }

    public void setMyViewList(ArrayList<view_list> myViewList) {
        this.myViewList = myViewList;
    }
    
    public ArrayList<friends_list> getMyFriendList() {
        return myFriendList;
    }

    public void setMyFriendList(ArrayList<friends_list> myFriendList) {
        this.myFriendList = myFriendList;
    }
    
    public String getOnline() {
        return Online;
    }

    public void setOnline(String Online) {
        this.Online = Online;
    }

    public ArrayList<messages_list> getMyMessagesList() {
        return myMessagesList;
    }

    public void setMyMessagesList(ArrayList<messages_list> myMessagesList) {
        this.myMessagesList = myMessagesList;
    }
    
    
    public String getSend_Msg() {
        return Send_Msg;
    }

    public void setSend_Msg(String Send_Msg) {
        this.Send_Msg = Send_Msg;
    }
    
    public String getOur_status() {
        return our_status;
    }

    public void setOur_status(String our_status) {
        this.our_status = our_status;
    }
    
    public String getAccept_request_id() {
        return accept_request_id;
    }

    public void setAccept_request_id(String accept_request_id) {
        this.accept_request_id = accept_request_id;
    }

    public String getReject_request_id() {
        return reject_request_id;
    }

    public void setReject_request_id(String reject_request_id) {
        this.reject_request_id = reject_request_id;
    }
    
    public List<String> getSender_id() {
        return Sender_id;
    }

    public void setSender_id(List<String> Sender_id) {
        this.Sender_id = Sender_id;
    }
    
    public ArrayList<pending_list> getMyPendingList() {
        return myPendingList;
    }

    public void setMyPendingList(ArrayList<pending_list> myPendingList) {
        this.myPendingList = myPendingList;
    }

    public String getMy_profile_pic() {
        return my_profile_pic;
    }

    public void setMy_profile_pic(String my_profile_pic) {
        this.my_profile_pic = my_profile_pic;
    }

//    public byte[] getMy_profile_pic() {
//        return my_profile_pic;
//    }
//
//    public void setMy_profile_pic(byte[] my_profile_pic) {
//        this.my_profile_pic = my_profile_pic;
//    }
//   
  

    public String getMy_user_id() {
        return my_user_id;
    }

    public void setMy_user_id(String my_user_id) {
        this.my_user_id = my_user_id;
    }

    public String getMy_password() {
        return my_password;
    }

    public void setMy_password(String my_password) {
        this.my_password = my_password;
    }

    public String getMy_user_name() {
        return my_user_name;
    }

    public void setMy_user_name(String my_user_name) {
        this.my_user_name = my_user_name;
    }

    public String getMy_maritalstatus() {
        return my_maritalstatus;
    }

    public void setMy_maritalstatus(String my_maritalstatus) {
        this.my_maritalstatus = my_maritalstatus;
    }

    public String getMy_height() {
        return my_height;
    }

    public void setMy_height(String my_height) {
        this.my_height = my_height;
    }

    public int getMy_age() {
        return my_age;
    }

    public void setMy_age(int my_age) {
        this.my_age = my_age;
    }

    public String getMy_ethnicity() {
        return my_ethnicity;
    }

    public void setMy_ethnicity(String my_ethnicity) {
        this.my_ethnicity = my_ethnicity;
    }

    public String getMy_intrest1() {
        return my_intrest1;
    }

    public void setMy_intrest1(String my_intrest1) {
        this.my_intrest1 = my_intrest1;
    }

    public String getMy_intrest2() {
        return my_intrest2;
    }

    public void setMy_intrest2(String my_intrest2) {
        this.my_intrest2 = my_intrest2;
    }

    public String getMy_intrest3() {
        return my_intrest3;
    }

    public void setMy_intrest3(String my_intrest3) {
        this.my_intrest3 = my_intrest3;
    }

    public String getMy_intrest4() {
        return my_intrest4;
    }

    public void setMy_intrest4(String my_intrest4) {
        this.my_intrest4 = my_intrest4;
    }

    public String getMy_location() {
        return my_location;
    }

    public void setMy_location(String my_location) {
        this.my_location = my_location;
    }
    

    public HomePage(String my_user_id, String my_password, String my_user_name) {
        this.my_user_id = my_user_id;
        this.my_password = my_password;
        this.my_user_name = my_user_name;
        search_user = null;
    }
  //constructor and getter setter for search
    public HomePage(String my_user_id) {
        this.my_user_id = my_user_id;
    }

    public Search getSearch_user() {
        return search_user;
    }

    public void setSearch_user(Search search_user) {
        this.search_user = search_user;
    }
    private ArrayList<OnlineUsers> onlineUsers;

    public ArrayList<OnlineUsers> getOnlineUsers() {
        return onlineUsers;
    }

    public void setOnlineUsers(ArrayList<OnlineUsers> onlineUsers) {
        this.onlineUsers = onlineUsers;
    }
    
    public static String senduserid()
    {
        return my_user_id;
    }
    
    public String Search()
    {
        search_user = new Search(my_user_id);
        search_user.Search_User();
        return "Search";
    }
    public void UploadImage() //April 20
    {
        
      final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(URL, "gosukondar9929", "1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from test where User_Id = '" + my_user_id + "' ");
           // upload_img = new UploadImage(my_user_id);
            while (rs.next()) {
                int r = stat.executeUpdate("delete from test where User_Id='" +my_user_id +"'");
              //return friends List
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
          
        } finally {
            try {
                rs.close();
                stat.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public String Logout()
    {
        //Logout
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try
        {
         conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id = '"+my_user_id+"' ");
            if(rs.next())
            {
                Online = "Offline";
                int r = stat.executeUpdate("Update ds_userprofile set Online = '"+Online+"' where User_Id ='"+my_user_id+"' ");
            }
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            return "index.xhtml";
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String OnlineUsers()
    {
        onlineUsers = new ArrayList<>();
        
        boolean onlinefound = false;
        
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_user_id+"' ");
            
            while(rs.next())
            {
                
                   
                    onlineUsers.add(new OnlineUsers(rs.getString("User_Id"),
                                                    rs.getString("Online")));
                    
                
                onlinefound = true;
            }
            if(onlinefound == false)
            {
                return("No Online Users Found");
            }
            else
            {
                //return friends List
                return "ViewOnlineUsers.xhtml";
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Friends_list()
    {
        //Friend's List
        myFriendList = new ArrayList<>();
        
        boolean hadFriends = false;
        
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_friendslist where Sender_Id = '"+my_user_id+"' or Receiver_Id = '"+my_user_id+"' ");
            
            while(rs.next())
            {
                
                if(rs.getString("Sender_Id").equals(my_user_id))
                {
                    
                    myFriendList.add(new friends_list(rs.getString("Receiver_Id")));
                    
                }
                else if(rs.getString("Receiver_Id").equals(my_user_id))
                {
                   
                    myFriendList.add(new friends_list(rs.getString("Sender_Id")));
                    
                }
                hadFriends = true;
            }
            if(hadFriends == false)
            {
                return("No Friends Found");
            }
            else
            {
                //return friends List
                return "My_Friends_List.xhtml";
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Pending_Requests()
    {
        myPendingList = new ArrayList<>();
        Sender_id = new ArrayList<>();
        boolean hasRequests = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_frnreq where Receiver_Id = '"+my_user_id+"' ");
            while(rs.next())
            {
                myPendingList.add(new pending_list(rs.getString("Sender_Id"),
                                                   rs.getString("Receiver_Id"), 
                                                   rs.getString("Status"), 
                                                   rs.getString("Date_Time"), 
                                                   rs.getString("Message")));
                Sender_id.add(rs.getString("Sender_Id"));
                
                hasRequests = true;
            }
            if(hasRequests == true)
            {
                return "My_Pending_List";
            }
            else
            {
                return "No_Requests_Found";
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Request_Accepted()
    {
        
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            
            int r = stat.executeUpdate("insert into ds_friendslist values ('"+accept_request_id+"' , '"+my_user_id+"' )");
            int d = stat.executeUpdate("Delete from ds_frnreq where (Sender_Id = '"+accept_request_id+"' and Receiver_Id = '"+my_user_id+"') or"
                                    + " (Receiver_Id = '"+accept_request_id+"' and Sender_Id = '"+my_user_id+"')");
                          
                 return ("Request Accepted");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Request_Rejected()
    {
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            
            
            int d = stat.executeUpdate("Delete from ds_frnreq where (Sender_Id = '"+accept_request_id+"' and Receiver_Id = '"+my_user_id+"') or"
                                    + " (Receiver_Id = '"+accept_request_id+"' and Sender_Id = '"+my_user_id+"')");
                          
                 return("requestRejected");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Populate_Lists()
    {
        
        Sender_id = new ArrayList<>();
        boolean hadFriends = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
             rs = stat.executeQuery("Select * from ds_friendslist where Sender_Id = '"+my_user_id+"' or Receiver_Id = '"+my_user_id+"' ");
            
            while(rs.next())
            {
                if(rs.getString("Sender_Id").equals(my_user_id))
                {
                    
                    Sender_id.add(rs.getString("Receiver_Id"));
                }
                else if(rs.getString("Receiver_Id").equals(my_user_id))
                {
                    
                    Sender_id.add(rs.getString("Sender_Id"));
                }
                hadFriends = true;
            }
            if(hadFriends == true)
            {
                return "";
            }
            else
            {
                return "No_Requests_Found";
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Send_Message()
    {
     //write Message    
        
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        boolean hadFriends = false;
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_friendslist where (Sender_Id = '"+my_user_id+"' and Receiver_Id = '"+accept_request_id+"') or (Sender_Id = '"+accept_request_id+"' and Receiver_Id = '"+my_user_id+"' )");
            
            while(rs.next())
            {
                
                    String Date = DateAndTime.DateTime();
                    
                    int r = stat.executeUpdate("insert into ds_message values ('"+my_user_id+"','"+accept_request_id+"','"+Send_Msg+"','"+Date+"')");
                    
                hadFriends = true;
                break;
            }
            if(hadFriends == true)
            {
                return("Message Sent Successfully");
            }
            else
            {
                return("There is no such user found in your friends list.");
            }
            
                      
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Inbox()
    {
        //Inbox
        boolean msgFound = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        
        myMessagesList = new ArrayList<>();
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_message where Receiver_Id = '"+my_user_id+"' ");
            while(rs.next())
            {
                //add to array List
                myMessagesList.add(new messages_list(rs.getString("Sender_Id"),
                                                     rs.getString("Receiver_Id"),
                                                     rs.getString("Message"),
                                                     rs.getString("Date_Time")));
                msgFound=true;
            }
            if(msgFound == true)
            {
                return "Inbox";
            }
            else
            {
                return ("No Msgs found");
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Outbox()
    {
     //Outbox  
        boolean msgFound = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        myMessagesList = new ArrayList<>();
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_message where Sender_Id = '"+my_user_id+"' ");
            
            
                
            
            
            while(rs.next())
            {
                //add to array List
                myMessagesList.add(new messages_list(rs.getString("Sender_Id"),
                                                     rs.getString("Receiver_Id"),
                                                     rs.getString("Message"),
                                                     rs.getString("Date_Time")));
                
                
                
                msgFound = true;
                //To :  Receiver_Id, message, date
                
            }
            if(myMessagesList.size() > 0)
            {
                return "Outbox";
            }
            return("no msgs");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String My_Profile()
    {
        //My profile
       
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
      //  Statement stat1 = null;
        ResultSet rs = null;
       // ResultSet rs1 = null;
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id = '"+my_user_id+"' ");
            if(rs.next())
            {
                
                my_user_id = rs.getString("User_Id");
                my_user_name = rs.getString("User_Name");
                my_maritalstatus = rs.getString("MaritalStatus");
                my_height = rs.getString("Height");
                my_age = rs.getInt("Age");
                my_ethnicity = rs.getString("Ethnicity");
                my_intrest1 = rs.getString("Intrests1");
                my_intrest2 = rs.getString("Intrests2");
                my_intrest3 = rs.getString("Intrests3");
                my_intrest4 = rs.getString("Intrests4");
                my_location = rs.getString("Location");
                my_profile_pic = rs.getString("ProfilePic");
                
                
//               stat.close();
//               stat = conn.createStatement();
//                rs1 = stat.executeQuery("Select * from test where User_Id = '"+my_user_id+"' ");
//                
//                while(rs1.next())
//                {
//                    byte[] bytes = rs1.getBytes("photo");
//                    my_profile_pic = new String(bytes);
//                }
                return "Myprofile";
                
            }
            else
            {
                return "No profile";
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
              //  rs1.close();
               // stat1.close();
                rs.close();
//                if(rs1!=null)
//                    rs1.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
    public String User_Profile(String frnd_id)
    {
        //user profile
        accept_request_id = frnd_id;
        boolean new_user = true;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id = '"+accept_request_id+"' ");
            
            if(rs.next())
            {
                //Friends Details
                //my_user_id = rs.getString("User_Id");
                my_user_name = rs.getString("User_Name");
                my_maritalstatus = rs.getString("MaritalStatus");
                my_height = rs.getString("Height");
                my_age = rs.getInt("Age");
                my_ethnicity = rs.getString("Ethnicity");
                my_intrest1 = rs.getString("Intrests1");
                my_intrest2 = rs.getString("Intrests2");
                my_intrest3 = rs.getString("Intrests3");
                my_intrest4 = rs.getString("Intrests4");
                my_location = rs.getString("Location");
                my_profile_pic = rs.getString("ProfilePic");
               //my_profile_pic = rs.getBlob("ProfilePic");
                Who_Viewed_Me(); // view updated
                rs1 = stat.executeQuery("Select * from ds_friendslist where (Sender_Id = '"+my_user_id+"' and Receiver_Id = '"+accept_request_id+"') or (Receiver_Id = '"+my_user_id+"' and Sender_Id = '"+accept_request_id+"') ");
                while(rs1.next())
                {
                    new_user = false;
                    our_status = "Friends";
                    return "View_Friend_Profile";
                }
                rs2 = stat.executeQuery("Select * from ds_frnreq where (Sender_Id = '"+my_user_id+"' and Receiver_Id = '"+accept_request_id+"') or (Receiver_Id = '"+my_user_id+"' and Sender_Id = '"+accept_request_id+"') ");
                while(rs2.next())
                {
                    new_user = false;
                    our_status = "Pending";
                    return "View_Friend_Profile";
                }
                if(new_user == true)
                {
                    // return Send Request
                    our_status = "Unknown";
                    return "View_Unknown_Profile";
                }
                return "User Found";
            }
            else
            {
               return("No such user found"); 
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs2.close();
                rs1.close();
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String Send_Request()
    {
        //Send_Request
        
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs =  stat.executeQuery("Select * from ds_frnreq where (Sender_Id = '"+my_user_id+"' and Receiver_Id = '"+accept_request_id+"') or (Receiver_Id = '"+my_user_id+"' and Sender_Id = '"+accept_request_id+"') ");
                if(rs.next())
                {
                    return("Either you are already Friends or Status is in pending state");
                }
                else
                {
                    String Date = DateAndTime.DateTime();
                    String Status = "Pending";
                    
                    int r = stat.executeUpdate("Insert into ds_frnreq values ('"+my_user_id+"' , '"+accept_request_id+"' , '"+Status+"' , '"+Date+"' ,'"+Send_Msg+"')");
                    return("Friend Request Sent");
                }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void Who_Viewed_Me()
    {
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_views where Who_viewed = '"+my_user_id+"' and Whom_viewed = '"+accept_request_id+"' ");
            
            if(rs.next())
            {
                //present in view table. so update
                int view = rs.getInt("View_count");
                view = view + 1;
                
                int r = stat.executeUpdate("Update ds_views set View_count = '"+view+"' where Who_viewed = '"+my_user_id+"' and Whom_viewed = '"+accept_request_id+"' ");
            }
            else
            {
              //new user so insert
                int view = 1;
                int r = stat.executeUpdate("Insert into ds_views values ('"+my_user_id+"' , '"+accept_request_id+"' , '"+view+"' )  ");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
           // return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String My_views()
    {
        myViewList = new ArrayList<>();
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        boolean hasViews = false;
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_views where Whom_viewed = '"+my_user_id+"' ");
            
            while(rs.next())
            {
                hasViews = true;
                myViewList.add(new view_list(rs.getString("Who_viewed"), rs.getString("Whom_viewed"), rs.getInt("View_count")));
                
            }
            return"";
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return("internalError");
        }
        finally
        {
            try
            {
                rs.close();
                stat.close();
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public String updateProfile() {
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(URL, "gosukondar9929", "1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id = '" + my_user_id + "'");
            if (rs.next()) {
                //profile_pic = rs.getString("ProfilePic");
                int r = stat.executeUpdate("Update ds_userprofile set User_Name ='" + my_user_name+"' , Password='" + my_password + "' , MaritalStatus ='"+ my_maritalstatus +"' ,"
                        + " Height ='" + my_height+"' , Age='" + my_age + "' , Ethnicity ='" + my_ethnicity + "', Location ='" + my_location +"' where User_Id ='" + my_user_id + "' ");
              
                return("Update Successful");
                
            }
            else
            {
                return "";
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
            return ("internalError");
        } finally {
            try {
                rs.close();
                stat.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    


}

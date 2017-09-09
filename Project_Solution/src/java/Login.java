
import java.io.Serializable;
import java.sql.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */
@ManagedBean
@SessionScoped
public class Login implements Serializable{
    
    private String user_id;
    private String password;
    private String user_name;
    private HomePage loginpage;
    private String Online;

    public String getOnline() {
        return Online;
    }

    public void setOnline(String Online) {
        this.Online = Online;
    }
    
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HomePage getLoginpage() {
        return loginpage;
    }

    
    
   //Login Method
    public String login()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return("Internal Error");
        }
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id = '"+user_id+"' ");
            if(rs.next())
            {
                if(password.equals(rs.getString("Password")))
                {
                    //Password Good
                    Online = "Online";
                    user_name = rs.getString("User_Name");
                    loginpage = new HomePage(user_id,password,user_name);
                    int r = stat.executeUpdate("Update ds_userprofile set Online = '"+Online+"' where User_Id ='"+user_id+"' ");
                    return "HomePage";
                }
                else
                {
                    user_id = "";
                    password = "";
                    return "LoginNotOk";
                }
            }
            else
            {
                user_id = "";
                password = "";
                return "LoginNotOk";
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return ("Internal Error");
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
}

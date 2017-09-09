/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.ArrayList;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Vijjini
 */
@ManagedBean
@RequestScoped
public class SignUp {

    private ArrayList<String> intrest = new ArrayList<>(); 
    private String User_name;
    private String User_id;
    private String password;
    private String maritalstatus;
    private double height;
    private int age;
    private String ethnicity;
    private String intrest1;
    private String intrest2;
    private String intrest3;
    private String intrest4;
    private String location;
    private long userCount;

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }
    
    
    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String User_id) {
        this.User_id = User_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getIntrest() {
        return intrest;
    }

    public void setIntrest(ArrayList<String> intrest) {
        this.intrest = intrest;
    }
    

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
    
    public String User_Count() {
        int num = 0;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e)
        {
            return ("Internal Error! Please try again later. ");
        }
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try
        {
            final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from ds_userprofile ");
            
            while(rs.next())
            {
                num++;
            }
            userCount = 199900;
            userCount = userCount + num;
            return "";
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("Internal Error! Please try again later. ");
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
    
    public String CreateAccount() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e)
        {
            return ("Internal Error! Please try again later. ");
        }
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try
        {
            final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from ds_userprofile where User_Id = '"+User_id+"' ");
            
            if(rs.next())
            {
                return("User Id already Exists. Please try another Id.");
            }
            else
            {
                // Check Box
                if(intrest.size() == 1)
                {
                    intrest1 = intrest.get(0);
                }
                else if(intrest.size() == 2)
                {
                    intrest1 = intrest.get(0);
                    intrest2 = intrest.get(1);
                }
                else if(intrest.size() == 3)
                {
                    intrest1 = intrest.get(0);
                    intrest2 = intrest.get(1);
                    intrest3 = intrest.get(2);
                }
                else if(intrest.size() == 4)
                {
                    intrest1 = intrest.get(0);
                    intrest2 = intrest.get(1);
                    intrest3 = intrest.get(2);
                    intrest4 = intrest.get(3);
                }
                
                int profilepic = 0;
                int no_of_likes = 0;
                String online = "Offline"; 
                int r = stat.executeUpdate("Insert into ds_userprofile values ('"+User_id+"','"+User_name+"','"+password+"','"+maritalstatus+"',"
                        + "'"+height+"','"+age+"','"+ethnicity+"','"+intrest1+"','"+intrest2+"','"+intrest3+"','"+intrest4+"','"+location+"',"
                                + "'"+profilepic+"','"+no_of_likes+"','"+online+"') ");
                return ("Registration Successful!");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return("Internal Error! Please try again later. ");
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

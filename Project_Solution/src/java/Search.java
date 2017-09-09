
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijjini
 */
public class Search {
    private String my_useridsearch;
    private HomePage goToHome;

    public Search(String my_useridsearch) {
        this.my_useridsearch = my_useridsearch;
        goToHome = null;
    }

    public String getMy_useridsearch() {
        return my_useridsearch;
    }

    public void setMy_useridsearch(String my_useridsearch) {
        this.my_useridsearch = my_useridsearch;
    }
    public HomePage getGoToHome() {
        return goToHome;
    }

    public void setGoToHome(HomePage goToHome) {
        this.goToHome = goToHome;
    }
    private int min_age;
    private int max_age;
    private ArrayList<friends_list> ageSearchList;
    
    private String city_name;
    private ArrayList<friends_list> locationSearchList;
    
    private String intrest;
    private ArrayList<friends_list> intrestSearchList;
    
    private String ethnicity;
    private ArrayList<friends_list> ethnicitySearchList;
    
    private String maritalStatus;
    private ArrayList<friends_list> maritalStatusSearchList;
    
    private String height;
    private ArrayList<friends_list> heightSearchList;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public ArrayList<friends_list> getMaritalStatusSearchList() {
        return maritalStatusSearchList;
    }

    public void setMaritalStatusSearchList(ArrayList<friends_list> maritalStatusSearchList) {
        this.maritalStatusSearchList = maritalStatusSearchList;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public ArrayList<friends_list> getHeightSearchList() {
        return heightSearchList;
    }

    public void setHeightSearchList(ArrayList<friends_list> heightSearchList) {
        this.heightSearchList = heightSearchList;
    }

    
    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public ArrayList<friends_list> getLocationSearchList() {
        return locationSearchList;
    }

    public void setLocationSearchList(ArrayList<friends_list> locationSearchList) {
        this.locationSearchList = locationSearchList;
    }

    public String getIntrest() {
        return intrest;
    }

    public void setIntrest(String intrest) {
        this.intrest = intrest;
    }

    public ArrayList<friends_list> getIntrestSearchList() {
        return intrestSearchList;
    }

    public void setIntrestSearchList(ArrayList<friends_list> intrestSearchList) {
        this.intrestSearchList = intrestSearchList;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public ArrayList<friends_list> getEthnicitySearchList() {
        return ethnicitySearchList;
    }

    public void setEthnicitySearchList(ArrayList<friends_list> ethnicitySearchList) {
        this.ethnicitySearchList = ethnicitySearchList;
    }
    
    
    public ArrayList<friends_list> getAgeSearchList() {
        return ageSearchList;
    }

    public void setAgeSearchList(ArrayList<friends_list> ageSearchList) {
        this.ageSearchList = ageSearchList;
    }
    
    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public int getMax_age() {
        return max_age;
    }

    public void setMax_age(int max_age) {
        this.max_age = max_age;
    }
    
    
    public String Search_User()
    {
        return "Search.xhtml";
    }
    public void User_name()
    {
        //Dont know how to write
    }
    public String Height()
    {
        
        heightSearchList = new ArrayList<>();
        boolean foundAny = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_useridsearch+"' and Height = '"+height+"' ");
            
            while(rs.next())
            {
                heightSearchList.add(new friends_list(rs.getString("User_Id")));
                foundAny = true;
            }
            if(foundAny == false)
            {
                return("No User found");
            }
            else
            {
                return "SearchByHeight";
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
    public String MaritalStatus()
    {
        maritalStatusSearchList = new ArrayList<>();
        boolean foundAny = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_useridsearch+"' and MaritalStatus = '"+maritalStatus+"' ");
            
            while(rs.next())
            {
                maritalStatusSearchList.add(new friends_list(rs.getString("User_Id")));
                foundAny = true;
            }
            if(foundAny = false)
            {
                return("No User found");
            }
            else
            {
                return "SearchByMaritalStatus";
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
    public String Ethnicity()
    {
        ethnicitySearchList = new ArrayList<>();
        boolean foundAny = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_useridsearch+"' and Ethnicity = '"+ethnicity+"' ");
            
            while(rs.next())
            {
                ethnicitySearchList.add(new friends_list(rs.getString("User_Id")));
                foundAny = true;
            }
            if(foundAny = false)
            {
                return("No User found");
            }
            else
            {
                return "SearchByEthnicity";
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
    public String Age()
    {
        ageSearchList = new ArrayList<>();
        boolean foundAny = false;
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_useridsearch+"' and Age between '"+min_age+"' and '"+max_age+"' ");
            
            while(rs.next())
            {
                ageSearchList.add(new friends_list(rs.getString("User_Id")));
                foundAny = true;
            }
            if(foundAny = false)
            {
                return("No User found");
            }
            else
            {
                return "SearchByAge";
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
    public String Intrest()
    {
        intrestSearchList = new ArrayList<>();
        boolean foundAny = false;
        intrest = intrest.toUpperCase();
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_useridsearch+"' and ( upper(Intrests1) = '"+intrest+"' "
                    + " or upper(Intrests2) = '"+intrest+"' or upper(Intrests3) = '"+intrest+"' or upper(Intrests4) = '"+intrest+"' ) ");
            
            while(rs.next())
            {
                intrestSearchList.add(new friends_list(rs.getString("User_Id")));
                foundAny = true;
            }
            if(foundAny = false)
            {
                return("No User found");
            }
            else
            {
                return "SearchByIntrest";
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
    public String Location()
    {
        locationSearchList = new ArrayList<>();
        boolean foundAny = false;
        city_name = city_name.toUpperCase();
        final String URL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";
        
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            conn = DriverManager.getConnection(URL,"gosukondar9929","1505067");
            stat = conn.createStatement();
            rs = stat.executeQuery("Select * from ds_userprofile where User_Id != '"+my_useridsearch+"' and upper(Location) = '"+city_name+"'  ");
            
            while(rs.next())
            {
                locationSearchList.add(new friends_list(rs.getString("User_Id")));
                foundAny = true;
            }
            if(foundAny = false)
            {
                return("No User found");
            }
            else
            {
                return "SearchByLocation";
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
}

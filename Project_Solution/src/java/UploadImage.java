
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ramya
 */
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
@ManagedBean
@SessionScoped

public class UploadImage extends HttpServlet {

   private HomePage myHomePage;
   private static String user = HomePage.senduserid();

    public UploadImage() {
        myHomePage = null;
    }
   
   
//    public HomePage getMyHomePage() {
//        return myHomePage;
//    }
//
//    public void setMyHomePage(HomePage myHomePage) {
//        this.myHomePage = myHomePage;
//    }
  // database connection settings
    private String dbURL = "jdbc:mysql://mis-sql.uhcl.edu/gosukondar9929";

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // gets values of text fields

        InputStream inputStream = null; // input stream of the upload file

        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("ProfilePic");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }

        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client

        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            conn = DriverManager.getConnection(dbURL, "gosukondar9929", "1505067");

          String sql = "INSERT INTO test(User_Id,photo) values (?,?)";
          // String sql = "INSERT INTO test(photo) values (?)";
              
          PreparedStatement statement = conn.prepareStatement(sql);
           // String id = user_id;
               statement.setString(1, user);
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
             
                
                //statement.setString(1, "ramya");
                statement.setBlob(2, inputStream);
            }
            
           // myHomePage.Inbox();
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        //   myHomePage = new HomePage(user);
//            // sets the message in request scope
           // myHomePage.Inbox();
                request.setAttribute("Message", message);
//            // forwards to the message page
           getServletContext().getRequestDispatcher("/UploadConfirmation.xhtml").forward(request, response);
        }
    }
  
}
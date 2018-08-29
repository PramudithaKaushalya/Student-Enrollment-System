/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pramuditha Kaushalya
 */
public class DBconnection {
    
    //C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/nsbm";
    final static String USER = "root";
    final static String PASS = "";
    private static Connection mconn;
    
    public static Connection connection(){
        
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            mconn = conn;
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void addUStudent(UStudent us) {
        try {
            String query = "insert into undergraduate(name, nic, address, home, mobile, email, intake, aLyear, indexNum, zcore, iRank, drank, stream, fsubject1, fsubject2, fsubject3, ssubject1, ssubject2, ssubject3) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = mconn.prepareStatement(query);
            pst.setString(1, us.getName());
            pst.setString(2, us.getNic());
            pst.setString(3, us.getAddress());
            pst.setInt(4, us.getHome());
            pst.setInt(5, us.getMobile());
            pst.setString(6, us.getEmail());
            pst.setString(7, us.getIntake());
            pst.setInt(8, us.getALyear());
            pst.setInt(9, us.getIndexNum());
            pst.setDouble(10, us.getZcore());
            pst.setInt(11, us.getIRank());
            pst.setInt(12, us.getDrank());
            pst.setString(13, us.getStream());
            pst.setString(14, us.getFSubject1());
            pst.setString(15, us.getFSubject2());
            pst.setString(16, us.getFSubject3());
            pst.setString(14, us.getSSubject1());
            pst.setString(15, us.getSSubject2());
            pst.setString(16, us.getSSubject3());
            
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    static void addPStudent(PStudent p) {
    try {
            String query = "insert into postgraduate(name, nic, address, home, mobile, email, intake, digdip, institute, year, subject1, subject2, subject3, subject4, subject5, subject6) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = mconn.prepareStatement(query);
            pst.setString(1, p.getName());
            pst.setString(2, p.getNic());
            pst.setString(3, p.getAddress());
            pst.setInt(4, p.getHome());
            pst.setInt(5, p.getMobile());
            pst.setString(6, p.getEmail());
            pst.setString(7, p.getIntake());
            pst.setString(8, p.getDigDip());
            pst.setString(13, p.getInstitute());
            pst.setInt(8, p.getYear());
            pst.setString(14, p.getSubject1());
            pst.setString(15, p.getSubject2());
            pst.setString(16, p.getSubject3());
            pst.setString(14, p.getSubject4());
            pst.setString(15, p.getSubject5());
            pst.setString(16, p.getSubject6());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

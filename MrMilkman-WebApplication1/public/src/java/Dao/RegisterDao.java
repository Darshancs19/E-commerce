/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Register;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import MyConnection.Connect;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class RegisterDao {
    
    public boolean checkLogin(String user,String pass) 
   {
              Connection con=null;
              PreparedStatement ps=null;
              ResultSet rs=null;
              try
              {     
              con=Connect.dataConnection();
              String sql;
              sql="select * from register where username=? and password=?";
                 ps=con.prepareStatement(sql);
                 ps.setString(1, user);
                 ps.setString(2, pass);
              rs=ps.executeQuery();
              if(rs.next())
                  return true;
              
              }
              catch(Exception e)
              {
              }    
         return false;
   } 
    
     public Register searchByUser(String user, String pass)
    {
        PrintWriter out = null;
             Connection con=null;
             PreparedStatement ps=null;
             con=Connect.dataConnection();
             ResultSet rs=null;
             Register S=new Register();
             String sql;
             try 
             {
                 sql="select * from register where username=(?,?)";
                 ps=con.prepareStatement(sql);
                 ps.setString(1, user);
                 ps.setString(2, pass);
                 rs=ps.executeQuery();
                 if(rs.next())
                 {
                        System.out.println("Login Successfull---------------------------");
                         S.setUsername(rs.getString(1));
                        S.setEmail(rs.getString(2));
                        S.setPassword(rs.getString(3));
                 }
                 else
                     out.println(rs.next());
                 
             } 
             catch (SQLException e) 
             {
                 System.out.println(e);
             }
             return(S);
    }
    
    public boolean insertUser( Register S1)
     {
             Connection con=null;
             PreparedStatement ps=null;
             con=Connect.dataConnection();
             String sql;
             sql="insert into register values(?,?,?)";
             try
             {
                  ps=con.prepareStatement(sql);
                  ps.setString(1, S1.getUsername());
                  ps.setString(2, S1.getEmail());
                  ps.setString(3, S1.getPassword());
                  int n;
                  n=ps.executeUpdate();
                 if(n>0)
                     return(true);
               
             }
             catch(Exception e)
             {
                 System.out.println(e); 
              }
         return(false);      
     }
    
}

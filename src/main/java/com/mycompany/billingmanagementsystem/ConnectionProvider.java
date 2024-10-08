/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.billingmanagementsystem;
import Project.*;
import java.sql.*;
/**
 *
 * @author qamre
 */
public class ConnectionProvider {
    public static Connection getCon(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/8080/bms","root","admin");
        return con;
    }
    catch(Exception e){
        return null;
    }
    }
}

package com.example.supplychain;
import java.sql.*;
public class DatabaseConnection {
    private static final String databaseUrl = "jdbc:mysql://localhost:3306/supplychain";
    private static final String userName = "root";
    private static final String password = "8676001068Ss";

    public Statement getStatement(){
        Statement statement = null;
        Connection conn;
        try{
            conn = DriverManager.getConnection(databaseUrl, userName, password);
            statement = conn.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
        return statement;
    }
    public ResultSet getQueryTable(String query){
        Statement statement = getStatement();
        try {
            return statement.executeQuery(query);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//        DatabaseConnection databaseConnection = new DatabaseConnection();
//        ResultSet rs = databaseConnection.getQueryTable("select * from customer");
//        try {
//            while (rs.next()){
//                System.out.println(rs.getString("email")+ " "+rs.getString("first_name"));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}

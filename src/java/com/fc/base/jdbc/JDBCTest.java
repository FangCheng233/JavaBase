package com.fc.base.jdbc;

import com.mysql.cj.jdbc.MysqlPooledConnection;

import java.sql.*;
import java.util.Enumeration;

/**
 * @ClassName JDBCTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/28 9:56 上午
 * @Version 1.0
 */
public class JDBCTest {
    public static void main(String[] args) {
        Connection connection = null;

        PreparedStatement  preparedStatement = null;

        ResultSet resultSet = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://111.229.237.232:5186/test_database?characterEncoding=utf-8","test","MyPass@123");
            String sql = "select * from suoyinlianxi where 1=1";

            preparedStatement = connection.prepareStatement(sql);



            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("id") + "    " + resultSet.getString("key") + "    " +resultSet.getString("value") + "    " );
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}

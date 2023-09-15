/*
# -*-coding:utf-8 -*-
@File    :   Database.java
@Time    :   2023/09/12 10:12:00
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/
package sys;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import user.Employee;

public class Database {
    private Connection connection; // 数据库连接

    // 构造方法，在初始化时连接数据库
    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 连接数据库的代码
            String url = "jdbc:mysql://localhost:3306/accesscontrol";
            String username = "root";
            String password = "sourcedream";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    // 添加新雇员
    public void addEmployee(String username, String password) {
        String insertQuery = "INSERT INTO user (empname, emppwd) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 删除雇员信息
    public boolean deleteEmployee(int employeeId) {
        String deleteQuery = "DELETE FROM user WHERE empid = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, employeeId);
            int rowsDeleted = preparedStatement.executeUpdate();
            preparedStatement.close();
            return rowsDeleted > 0; // 如果删除的行数大于0，则表示删除成功
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 修改密码
    public boolean changePassword(String empid, String newPassword) {
        String updateQuery = "UPDATE user SET emppwd = ? WHERE empid = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, empid);
            int rowsUpdated = preparedStatement.executeUpdate();
            preparedStatement.close();
            return rowsUpdated > 0; // 如果更新的行数大于0，则表示修改成功
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 查询雇员的详细信息
    // 查询雇员的详细信息并输出到控制台
    public void getAllEmployees() {
        String selectQuery = "SELECT empid, empname, emppwd FROM user";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("empid");
                String username = resultSet.getString("empname");
                String password = resultSet.getString("emppwd");
                System.out.println("Employee ID: " + employeeId);
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("------------------------------");
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 关闭数据库连接
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Map<String, String> getPassword(){
        Map<String, String> passwordMap = new HashMap<>(); 
        String query = "SELECT empid, emppwd FROM user";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String empid = resultSet.getString("empid");
                String emppwd = resultSet.getString("emppwd");
                passwordMap.put(empid, emppwd);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passwordMap;

    }
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/accesscontrol";
            String username = "your_username";
            String password = "your_password";
            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

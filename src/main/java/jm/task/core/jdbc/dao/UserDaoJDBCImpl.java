package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    //private final Connection connection = Util.connectDB();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        /*String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "id int PRIMARY KEY AUTO_INCREMENT,"+
                "name varchar(20) NOT NULL,"+
                "lastname varchar(20) NOT NULL,"+
                "age int(3) NOT NULL"+
                ");";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }*/
    }

    public void dropUsersTable() {
        /*String sql = "DROP TABLE IF EXISTS users";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }*/
    }


    public void saveUser(String name, String lastName, byte age) {
        /*String sql = "INSERT INTO users (name, lastname, age) VALUES (?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, lastName);
            statement.setByte(3, age);
            statement.executeUpdate();
            connection.commit();
            System.out.println("User с именем – " + name + " добавлен в базу данных");
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }*/
    }

    public void removeUserById(long id) {
        /*String sql = "SELECT * FROM users";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            long idRem = 0;
            while (resultSet.next()) {
                long idRemove = resultSet.getLong(1);
                if (idRemove == id) idRem = idRemove;
            }
            statement.executeUpdate("DELETE FROM users WHERE id = " + idRem);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }*/
    }

    public List<User> getAllUsers() {
        /*String sql = "SELECT * FROM users";
        List <User> result = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            int count = 0;
            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                byte age = resultSet.getByte(4);
                User user = new User(name, lastName, age);
                user.setId(id);
                result.add(count, user);
                count++;
            }
            for (User u : result) {
                System.out.println(u.toString());
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return result;*/
        return null;
    }

    public void cleanUsersTable() {
        /*String sql = "TRUNCATE users";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }*/
    }
}

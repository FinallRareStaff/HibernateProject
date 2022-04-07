package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        // Создание таблицы User(ов)
        userService.createUsersTable();
        // Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
        userService.saveUser("Mike", "Gordon", (byte) 56);
        userService.saveUser("Trey", "Parker", (byte) 52);
        userService.saveUser("Matt", "Stone", (byte) 50);
        userService.saveUser("Whoopi", "Goldberg", (byte) 66);
        // Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
        userService.getAllUsers();
        // Удаление User из таблицы ( по id )
        userService.removeUserById(3);
        // Очистка таблицы User(ов)
        //userService.cleanUsersTable();
    }
}

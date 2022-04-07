package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    // Метод для проверки наличия фабрики
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        return sessionFactory == null ? createSessionFactory() : sessionFactory;
    }
    // Метод для создание фабрики по производству сессии
    private static SessionFactory createSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml") // Для чтения конфига
                .addAnnotatedClass(User.class) // Класс со специальными аннотациями
                .buildSessionFactory(); // Метод для билда фабрики
        System.out.println("Сессия создана");
        return factory;
    }
}

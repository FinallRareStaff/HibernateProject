package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
        String sql = "CREATE TABLE IF NOT EXISTS User (" +
                "ID int PRIMARY KEY AUTO_INCREMENT,"+
                "NAME varchar(20) NOT NULL,"+
                "LAST_NAME varchar(20) NOT NULL,"+
                "AGE int(3) NOT NULL"+
                ");";
        try (Session session = Util.getSessionFactory().openSession()) {
            session.beginTransaction(); // Открытие транзакции
            session.createSQLQuery(sql).addEntity(User.class).executeUpdate(); // Создание запроса sql
            session.getTransaction().commit(); // Подтвердить изменения в БД
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}

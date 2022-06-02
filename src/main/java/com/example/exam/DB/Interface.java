package com.example.exam.DB;

public class Interface {


    public static User getUser(String login, String password) {
        return (User) Hiberrnate
                .getSessionFactory()
                .openSession()
                .createQuery("FROM User A WHERE A.name = '" + login +"' AND A.password = '" + password + "'")
                .uniqueResult();
    }
}
// name = login
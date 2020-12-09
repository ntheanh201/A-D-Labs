
package controller;

import java.sql.Connection;
import java.util.List;

import db.DBConnection;


public interface BaseDAO<T> {
    Connection con = DBConnection.connect();
    List<T> getAll();

    T get(int id);

    int post(T t);

    void put(T t);

    void delete(T t);

}

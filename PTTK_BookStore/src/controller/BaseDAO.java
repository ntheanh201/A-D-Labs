
package controller;

import java.sql.Connection;
import java.util.List;

import db.DBConnection;


public interface BaseDAO<T> {
    Connection con = DBConnection.openConnect();
    List<T> getAll();

    T get(int id);

    int save(T t);

    void update(T t);

    void delete(T t);

}

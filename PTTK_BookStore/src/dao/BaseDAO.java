
package dao;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

import db.ConnectDB;


public interface BaseDAO<T> {
    Connection con = ConnectDB.openConnect();
    List<T> getAll();

    T get(int id);

    int save(T t);

    void update(T t);

    void delete(T t);

}

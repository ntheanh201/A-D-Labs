
package dao;

import model.Person;


public interface PersonDAO extends BaseDAO<Person>{
   Person getPersonByAccountID(int id);
}

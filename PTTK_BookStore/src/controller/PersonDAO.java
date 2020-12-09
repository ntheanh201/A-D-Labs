
package controller;

import model.Person;

public interface PersonDAO extends BaseDAO<Person> {
	Person getPersonByAccountID(int id);
}

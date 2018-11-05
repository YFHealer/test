package demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import demo.po.Person;

@Repository(value="personDao")
public class PersonDao {

	public List<Person> listAll() {
		Person p1 = new Person("123", "li");
		Person p2 = new Person("126", "wang");
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		return personList;
	}

}

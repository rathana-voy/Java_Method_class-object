package objectcreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import method.Person;

public class ObjectCreationDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		
		
		/*
		//create object use newInstance() method of Class class
		
		Person person= (Person) Class.forName("method.Person").newInstance();
		person.print();
		//other way
		Person person2 =Person.class.newInstance();
		person2.print();
		
		*/
		
		
		//create object use newInstance() method of Constructor class
		Constructor<Person> personConstructor= Person.class.getConstructor();
		Person person=personConstructor.newInstance();
		person.print();
		
		
		//clone object I have ready object person 
		Person person2 =(Person) person.clone();
		person2.print();
		
		
	}
	
}

package edu.mum.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.data.Database;
import edu.mum.domain.User;
import edu.mum.repository.DataFacade;

 // Implements Singleton Pattern

@Repository
public class TestDataImpl implements DataFacade {

	private static final Database data = new Database();
 
	// Private constructor. Prevents instantiation from other classes.
	private TestDataImpl() {
		
	}

	// eager init'ed singleton...
	public final static TestDataImpl INSTANCE = new TestDataImpl();

	public String findPassword (String name ) {
 		String expectedPassword = data.getPassword(name);
		return expectedPassword;
	}
	public List<String> getAdvice(String roast) { 
		return data.getAdvice(roast);
	}
	
}




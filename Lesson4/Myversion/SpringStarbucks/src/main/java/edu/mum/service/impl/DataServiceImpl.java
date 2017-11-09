package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.User;
import edu.mum.repository.impl.TestDataImpl;
import edu.mum.service.DataService;

@Service
public class DataServiceImpl implements DataService{
	
	@Autowired
	private TestDataImpl testdataimp;

	public String findPassword(String name) {
		
		return testdataimp.findPassword(name);
	}

	public List<String> getAdvice(String roast) {
		return testdataimp.getAdvice(roast);
	}

	
}

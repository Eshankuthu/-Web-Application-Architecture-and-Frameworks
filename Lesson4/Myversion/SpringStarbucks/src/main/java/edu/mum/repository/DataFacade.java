package edu.mum.repository;

import java.util.List;

import edu.mum.domain.User;

public interface DataFacade {
	public String findPassword(String name );
	public List<String> getAdvice(String roast);

}

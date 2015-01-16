package fr.ensimag.dao;

import fr.ensimag.entity.Account;

import javax.ejb.Local;

@Local
public interface AccountDAOLocal {

	void create(Account account) throws Exception;

	void edit(Account account) throws Exception;

	void remove(Account account) throws Exception;

	Account find(Object id) throws Exception;

	List<Account> findAll() throws Exception;

	int count() throws Exception;

}

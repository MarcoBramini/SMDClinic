package smdclinic.service;

import java.sql.SQLException;
import java.util.List;

import smdclinic.model.Administrator;

public interface AdministratorService {
		
		public Administrator createAdministrator(String username, String name, String surname, String password);
		
		public Administrator findByUsername(String username) throws SQLException;
		
		public List<Administrator> findAll();
		
		public void removeAdministrator(Administrator administrator);
	

}

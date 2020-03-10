package model;

import javax.faces.bean.ManagedBean;

import dao.IUserDAO;
import dao.UserDAO;

@ManagedBean (name="gl")
public class GestionLogin {
public Login login = new Login();
public IUserDAO dao = new UserDAO();



public Login getLogin() {
	return login;
}
public void setLog(Login login) {
	this.login = login;
}

public String ajoutUser() {
	 dao.saveUser(login);
	return "connexion";
}
public String Verifier() {
	if (dao.verifUser(login)==1) {
		return "index";
	}
	else {
		return "connexion";
	}
	
}



}
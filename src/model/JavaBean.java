package model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="objet")
public class JavaBean {
	
private String message="Bonjour JSF";

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public JavaBean() {
	super();
	// TODO Auto-generated constructor stub
}


}

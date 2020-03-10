package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
	public class Login {

@Id
@GeneratedValue
private int id;
@Column(nullable = false, unique=true)
private String username;
@Column(nullable = false)
private String password;
		    
		    

		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}


		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Login(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		
		 
		 
		 
}

package dao;



import model.Login;

public interface IUserDAO {

public int saveUser (Login u);
public int verifUser (Login login);
}

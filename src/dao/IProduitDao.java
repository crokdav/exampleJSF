package dao;

import java.util.List;

import model.Marque;
import model.Produit;

public interface IProduitDao {
public int saveProduct (Produit p);
public List<Produit> getProduits();
public List<Produit> getProducts(Marque marque);
}

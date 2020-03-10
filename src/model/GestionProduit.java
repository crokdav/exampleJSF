package model;



import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IProduitDao;
import dao.ProduitDao;


@ManagedBean(name="gp")
public class GestionProduit {

	public Produit produit = new Produit();
	public IProduitDao dao = new ProduitDao();
	public Marque marque= new Marque();
	
	
	
	
	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	

	
	public String ajoutProduit() {
		produit.setMarque(marque);
		if (dao.saveProduct(produit)==1) {
		return "sucess";
	}
	else {
		return "failed";
	}
	
}
	public List<Produit> afficheProduits() {
		return dao.getProduits();
	
		}
//	public List<Produit> afficheProducts() {
//		return dao.getProducts(marque);
//	
//		}
	
	
	
}
package model;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IMarqueDao;

import dao.MarqueDao;


@ManagedBean(name = "gm")
public class GestionMarque {
	
	

		public Marque marque = new Marque();
		public IMarqueDao dao = new MarqueDao();

		public Marque getMarque() {
			return marque;
		}

		public void setMarque(Marque marque) {
			this.marque = marque;
		}

		public String ajoutMarque() {
			if (dao.saveMarque(marque) == 1) {
				return "sucess";
			} else {
				return "failed";
			}

		}
		public List<Marque> getMarquess() {
			return dao.getMarques();
		
			}
	}


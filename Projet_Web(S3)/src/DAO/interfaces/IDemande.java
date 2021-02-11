package DAO.interfaces;

import java.util.List;

import Models.Demande;

public interface IDemande {
	public Demande insertDemande(Demande demande);
	List<Demande> getAllDemandsOfAssociation(int ass_id);
	List<Demande> getAllDemands();
	boolean editDemandeF(Demande demande);
	boolean editDemandeB(Demande demande);
}

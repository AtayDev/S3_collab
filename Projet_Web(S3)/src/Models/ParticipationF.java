package Models;

public class ParticipationF {
	private int id_partF;
	private int id_part_donateur;
	private int id_part_demande;
	private double montant_part;
	

	public ParticipationF(int donateur_id, int reference, double montant) {
		id_part_donateur=donateur_id;
		id_part_demande=reference;
		montant_part=montant;
	}
	public int getId_partF() {
		return id_partF;
	}
	public void setId_partF(int id_partF) {
		this.id_partF = id_partF;
	}
	public int getId_part_donateur() {
		return id_part_donateur;
	}
	public void setId_part_donateur(int id_part_donateur) {
		this.id_part_donateur = id_part_donateur;
	}
	public int getId_part_demande() {
		return id_part_demande;
	}
	public void setId_part_demande(int id_part_demande) {
		this.id_part_demande = id_part_demande;
	}
	public double getMontant_part() {
		return montant_part;
	}
	public void setMontant_part(double montant_part) {
		this.montant_part = montant_part;
	}
	public ParticipationF() {
		super();
	
	}
	
}

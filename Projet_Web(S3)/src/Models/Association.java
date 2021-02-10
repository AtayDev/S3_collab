package Models;

public class Association {
		private int idAss;
		private String nomAss;
		private String emailAss;
		private String passwordAss;
		private String telephoneAss;
		private String adresseAss;	
		private String descriptionAss;
		private String villeAss;
		private String ribAss;
		
		public Association(String nomAss, String emailAss, String passwordAss, String telephoneAss,
				String adresseAss,String descriptionAss, String villeAss, String ribAss) {
			
			
			this.nomAss = nomAss;
			this.emailAss = emailAss;
			this.passwordAss = passwordAss;
			this.telephoneAss = telephoneAss;
			this.adresseAss = adresseAss;

			this.descriptionAss = descriptionAss;
			this.villeAss = villeAss;
			this.ribAss = ribAss;
		}
		public Association() {
			// TODO Auto-generated constructor stub
		}
		
		
		public int getIdAss() {
			return idAss;
		}
		public void setIdAss(int idAss) {
			this.idAss = idAss;
		}
		public String getNomAss() {
			return nomAss;
		}
		public void setNomAss(String nomAss) {
			this.nomAss = nomAss;
		}
		public String getEmailAss() {
			return emailAss;
		}
		public void setEmailAss(String emailAss) {
			this.emailAss = emailAss;
		}
		public String getPasswordAss() {
			return passwordAss;
		}
		public void setPasswordAss(String passwordAss) {
			this.passwordAss = passwordAss;
		}
		public String getAdresseAss() {
			return adresseAss;
		}
		public void setAdresseAss(String adresseAss) {
			this.adresseAss = adresseAss;
		}
		public String getDescriptionAss() {
			return descriptionAss;
		}
		public void setDescriptionAss(String descriptionAss) {
			this.descriptionAss = descriptionAss;
		}
		public String getVilleAss() {
			return villeAss;
		}
		public void setImageAss(String imageAss) {
			this.villeAss = imageAss;
		}
		public String getRibAss() {
			return ribAss;
		}
		public void setRibAss(String ribAss) {
			this.ribAss = ribAss;
		}
		public String getTelephoneAss() {
			return telephoneAss;
		}
		public void setTelephoneAss(String telephoneAss) {
			this.telephoneAss = telephoneAss;
		}
		@Override
		public String toString() {
			return "Association [idAss=" + idAss + ", nomAss=" + nomAss + ", emailAss=" + emailAss + ", passwordAss="
					+ passwordAss + ", telephoneAss=" + telephoneAss + ", adresseAss=" + adresseAss
					+ ", descriptionAss=" + descriptionAss + ", imageAss=" + villeAss + ", ribAss=" + ribAss + "]";
		}
		
		
		
	}


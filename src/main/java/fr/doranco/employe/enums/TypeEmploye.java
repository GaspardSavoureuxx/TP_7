package fr.doranco.employe.enums;

public enum TypeEmploye {
	
		VENTE ("vente"),
		REPRESENTATION ("representation"),
		PRODUCTION ("production"),
		MAUTENTION ("manutention");

		private String value;

		private TypeEmploye(String value) {

			this.value = value;

		}


		public String getValue() {
			return value;
		}

}

package com.example.voyage;

public class Sejour extends OptionVoyage{
	
		private int nbNuit;
		private double prixNuit;
		
	
		public Sejour(String unNom, double unPrix, int unNbNuit, double unPrixNuit){
			super(unNom,unPrix);
			nbNuit = unNbNuit;
			prixNuit = unPrixNuit;
		}

	
		public Sejour(String unNom, double unPrix, boolean estTarifReduit, int unNbNuit, double unPrixNuit){
			super(unNom,unPrix, estTarifReduit);
			nbNuit = unNbNuit;
			prixNuit = unPrixNuit;
		}

		public int getNbNuit() {
		return nbNuit;
		}

		public double getPrixNuit() {
			return prixNuit;
		}
		
		@Override
		public double prix(){
			return nbNuit * prixNuit + super.prix();
		}
}
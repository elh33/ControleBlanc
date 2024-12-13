package ma.ensa.ControleBlanc.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import ma.ensa.ControleBlanc.models.Membre;

public class CsvLoader {

	public Set<Membre> chargerListeMembre(String nomFichier) {
	    Set<Membre> membres = new HashSet<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
	        String ligne;
	        while ((ligne = br.readLine()) != null) {
	            String[] details = ligne.split(",");
	            if (details.length == 5) {
	                String identifiant = java.util.UUID.randomUUID().toString();
	                Membre membre = new Membre(identifiant, details[0], details[1], details[2], details[3]);
	                membres.add(membre);
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return membres;
	}
}


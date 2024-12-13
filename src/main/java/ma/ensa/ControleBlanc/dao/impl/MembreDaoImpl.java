package ma.ensa.ControleBlanc.dao.impl;

import java.util.HashSet;
import java.util.Set;

import ma.ensa.ControleBlanc.dao.MembreDao;
import ma.ensa.ControleBlanc.models.Incident;
import ma.ensa.ControleBlanc.models.Membre;

public class MembreDaoImpl implements MembreDao {
    private Set<Membre> membres = new HashSet<>();
    private Set<Incident> incidents = new HashSet<>();

    @Override
    public void insere(Membre m) {
        membres.add(m);
        System.out.println("Membre inséré : " + m);
    }

    @Override
    public Set<Incident> chargerListIncidents() {
        return incidents;
    }
}

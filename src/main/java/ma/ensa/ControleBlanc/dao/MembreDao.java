package ma.ensa.ControleBlanc.dao;

import java.util.Set;

import ma.ensa.ControleBlanc.models.Incident;
import ma.ensa.ControleBlanc.models.Membre;

public interface MembreDao {
    void insere(Membre m);
    Set<Incident> chargerListIncidents();
}


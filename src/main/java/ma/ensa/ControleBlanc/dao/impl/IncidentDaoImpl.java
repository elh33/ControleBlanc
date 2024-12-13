package ma.ensa.ControleBlanc.dao.impl;

import java.util.HashSet;
import java.util.Set;

import ma.ensa.ControleBlanc.dao.IncidentDao;
import ma.ensa.ControleBlanc.models.Incident;

public class IncidentDaoImpl implements IncidentDao {
    private Set<Incident> incidents = new HashSet<>();

    @Override
    public void insere(Incident i) {
        incidents.add(i);
        System.out.println("Incident inséré : " + i);
    }

    @Override
    public void insere(Set<Incident> incidents) {
        this.incidents.addAll(incidents);
        System.out.println("Incidents insérés : " + incidents);
    }
}

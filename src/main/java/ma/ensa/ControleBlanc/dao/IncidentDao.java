package ma.ensa.ControleBlanc.dao;

import java.util.Set;

import ma.ensa.ControleBlanc.models.Incident;

public interface IncidentDao {
    void insere(Incident i);
    void insere(Set<Incident> incidents);
}

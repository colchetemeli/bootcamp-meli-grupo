package br.com.api.consultorio.dao;

import br.com.api.consultorio.entity.Dentist;

import javax.persistence.EntityManager;
import java.util.List;

public class DentistDao {

    EntityManager entityManager;

    public DentistDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void persist(Dentist dentist){
        this.entityManager.persist(dentist);
    }

    public List<Dentist> getDentistsHasMoreTwoTurns(){


        return dentistas;
    }
}

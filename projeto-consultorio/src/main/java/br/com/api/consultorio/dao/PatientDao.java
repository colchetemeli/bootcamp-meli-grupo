package br.com.api.consultorio.dao;

import br.com.api.consultorio.entity.Patient;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class PatientDao {

    EntityManager entityManager;

    public PatientDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Patient> getPatientsByDate(LocalDate date){

        return patients
    }

}

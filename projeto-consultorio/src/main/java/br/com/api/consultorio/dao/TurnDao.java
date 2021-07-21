package br.com.api.consultorio.dao;

import br.com.api.consultorio.entity.Turn;
import br.com.api.consultorio.entity.TurnStatus;

import javax.persistence.EntityManager;
import java.util.List;

public class TurnDao {

    EntityManager entityManager;

    public TurnDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Turn> getByStatus(TurnStatus turnStatus){

        return turns;
    }

}

package br.com.api.consultorio.dao;

import br.com.api.consultorio.entity.Dentist;
import br.com.api.consultorio.entity.Diary;

import javax.persistence.EntityManager;
import java.util.List;

public class DiaryDao {

    EntityManager entityManager;

    public DiaryDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    List<Diary> getDiariesByDentist(Dentist dentist){
        //todo: fazer query
        return dentist.getDiaries();
    }

}

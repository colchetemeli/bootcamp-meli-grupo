package br.com.api.consultorio;

import br.com.api.consultorio.dao.DentistDao;
import br.com.api.consultorio.entity.Dentist;
import br.com.api.consultorio.entity.Diary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class ConsultorioApplication {

    public static void main(String[] args) {

        List<Diary> diaries = new ArrayList<Diary>();

        Dentist dentist = new Dentist("Josue", "Da Silva", "Rua 13", "653435435",
                LocalDate.of(1990, Month.APRIL, 20),
                "+552135464754", "josue@gmail.com", "112");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        DentistDao dentistDao = new DentistDao(entityManager);

        entityManager.getTransaction().begin();
        dentistDao.persist(dentist);
        entityManager.getTransaction().commit();

        //SpringApplication.run(ConsultorioApplication.class, args);
    }

}

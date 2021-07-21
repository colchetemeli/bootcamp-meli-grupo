package br.com.api.consultorio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer day;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private TurnStatus turnStatus;

    @ManyToOne
    private Diary diary;
}

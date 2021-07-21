package br.com.api.consultorio.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime start_time;

    private LocalDateTime end_time;

    @OneToMany(mappedBy = "diary", cascade = CascadeType.ALL)
    private List<Turn> turns;

    @ManyToOne
    private Dentist dentist;
}

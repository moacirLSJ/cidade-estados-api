package com.github.moacirlsj.citiesapi.entity;

import javax.persistence.*;

@Entity(name = "State")
@Table(name = "estado")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

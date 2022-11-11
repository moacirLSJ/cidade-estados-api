package com.github.moacirlsj.citiesapi.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private String uf;
    private Integer ibge;
    private Integer pais;
    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "jsonb")
    private List<Integer> ddd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.github.moacirlsj.citiesapi.entity;


import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "cidade")
//@TypeDefs({
//        @TypeDef(name = "point", typeClass = PointType.class)
//})
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String uf;

    @Column
    private Integer ibge;

    @Column(name = "lat_lon")
//    @Type(type = "point")
    private Point lat_lon;
    @Column
    private Double latitude;
    @Column
    private Double longitude;
    @Column
    private short cod_tom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        City city = (City) o;
        return id != null && Objects.equals(id, city.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

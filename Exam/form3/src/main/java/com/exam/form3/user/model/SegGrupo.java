package com.exam.form3.user.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "seg_grupo")

public class SegGrupo {
    @Id
    @Column(name = "cod_grupo", nullable = false)
    private Integer codGrupo;

    @Column(name = "nombre", nullable = false, length = 51)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false) 
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public SegGrupo(Integer codGrupo) {
        this.codGrupo = codGrupo;
    }
}

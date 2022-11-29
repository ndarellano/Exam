package com.exam.form3.user.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "seg_grupo_usuario")
public class SegGrupoUsuario {

    @EmbeddedId
    private SegGupoUsuarioPK pk;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "fecha_asignacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "cod_grupo", referencedColumnName = "cod_grupo", insertable = false, updatable = false),
        @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", insertable = false, updatable = false)
    })
    private SegUsuario segUsuario;
    private SegGrupo segGrupo;
    
    public SegGrupoUsuario(SegGupoUsuarioPK pk) {
        this.pk = pk;
    }

}

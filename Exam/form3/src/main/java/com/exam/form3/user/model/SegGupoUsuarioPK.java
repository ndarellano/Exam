package com.exam.form3.user.model;
import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

@Data
@Embeddable
public class SegGupoUsuarioPK implements Serializable {
    @Column(name = "cod_grupo", nullable = false)
    private Integer codGrupo;
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;   
}

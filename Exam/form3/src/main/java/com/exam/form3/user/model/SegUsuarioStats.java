package com.exam.form3.user.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "seg_usuario_stats")
public class SegUsuarioStats {
    
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;

    @Column(name = "total_sesions", nullable = false)
    private BigDecimal totalSesions;

    @Column(name = "intentos_fallidos", nullable = false)  
    private BigDecimal intentosFallidos;

    @Column(name = "total_intentos_fallidos", nullable = false)
    private BigDecimal totalIntentosFallidos;

    @Column(name = "ultimo_intento_fallido", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ultimoIntentoFallido;

    @ManyToOne
    @JoinColumn(name = "code_usuario", referencedColumnName = "code_usuario", insertable = false, updatable = false)
    private SegUsuario code_usuario;

    public SegUsuarioStats(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

}

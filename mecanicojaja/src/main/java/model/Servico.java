package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

@Entity
public class Servico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(precision = 10, scale = 2)
    private BigDecimal custo;
    
    @Column(name="horario")
    private Date horario;
    
    @Column(name="ultima_alteracao")
    private Date ultima_alteracao;
    
    @Column(name = "isCompleto", columnDefinition = "BOOLEAN")
    private Boolean isCompleto;
    
    @Column(name = "descricao")
    private String descricao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Servicos_realizados sr;
    
}

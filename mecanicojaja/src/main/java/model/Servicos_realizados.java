package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

@Entity
public class Servicos_realizados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="horario")
    private Date horario;
    
    @Column(name="descricao")
    private String descricao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Funcionario funcionario;
    
    //adicionar FK do cliente
}

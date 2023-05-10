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
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(precision = 10, scale = 2)
    private BigDecimal preco_compra;
    
    @Column(name="unidade_medida")
    private String unidade_medida;
    
    @Column(name="data_pedido")
    private Date data_pedido;
    
    @Column(name="marca")
    private String marca;
    
    @Column(name="cor")
    private String cor;
    
    @Column(name="quantidade produto")
    private int quantidade_produto;
    
    @Column(name="descricao")
    private String descricao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private produtos_usados pu;
    
    public void adicionarProduto(Produto p){
        
    }
    
    public void editarProduto(Produto p ){
        
    }
    
    public void excluirProduto(Produto p){
        
    }
}

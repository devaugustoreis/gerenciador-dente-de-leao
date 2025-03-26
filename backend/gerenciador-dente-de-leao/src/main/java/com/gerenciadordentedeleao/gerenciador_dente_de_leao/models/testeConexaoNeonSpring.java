package com.gerenciadordentedeleao.gerenciador_dente_de_leao.models;
import jakarta.persistence.*;

@Entity
@Table(name = "testeSpring")
public class testeConexaoNeonSpring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}

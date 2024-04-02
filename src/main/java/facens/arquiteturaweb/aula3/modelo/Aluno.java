package facens.arquiteturaweb.aula3.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    private Long id;
    private String nome;
    private String curso;
    private String nascimento;
    private String sexualidade;
    private String sexo;

    public Aluno(Long id, String nome, String curso, String nascimento, String sexualidade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.nascimento = nascimento;
        this.sexualidade = sexualidade;
        this.sexo = sexo;
    }

    public Aluno() {
    }

    // Getters e Setters (exemplo)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexualidade() {
        return sexualidade;
    }

    public void setSexualidade(String sexualidade) {
        this.sexualidade = sexualidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

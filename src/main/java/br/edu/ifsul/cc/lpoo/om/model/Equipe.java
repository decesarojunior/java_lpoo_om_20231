
package br.edu.ifsul.cc.lpoo.om.model;

import java.util.List;

/**
 *
 * @author telmo
 */
public class Equipe {
    
    private Integer id;
    private String nome;
    private String especialidades;
    private List<Funcionario> funcionarios;
    
    public Equipe(){
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especialidades
     */
    public String getEspecialidades() {
        return especialidades;
    }

    /**
     * @param especialidades the especialidades to set
     */
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    /**
     * @return the funcionarios
     */
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**
     * @param funcionarios the funcionarios to set
     */
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}

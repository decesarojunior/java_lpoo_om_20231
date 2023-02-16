
package br.edu.ifsul.cc.lpoo.om.model;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class Curso {
    
    private Integer id;
    private String descricao;
    private Calendar dt_conclusao;
    private Integer cargahoraria;
    
    public Curso(){
        
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dt_conclusao
     */
    public Calendar getDt_conclusao() {
        return dt_conclusao;
    }

    /**
     * @param dt_conclusao the dt_conclusao to set
     */
    public void setDt_conclusao(Calendar dt_conclusao) {
        this.dt_conclusao = dt_conclusao;
    }

    /**
     * @return the cargahoraria
     */
    public Integer getCargahoraria() {
        return cargahoraria;
    }

    /**
     * @param cargahoraria the cargahoraria to set
     */
    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    
    
}

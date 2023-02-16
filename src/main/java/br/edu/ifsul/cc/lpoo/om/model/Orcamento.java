
package br.edu.ifsul.cc.lpoo.om.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Orcamento {
    
    private Integer id;
    private String observacoes;
    private Calendar data;
    private Cliente cliente;
    private Veiculo veiculo;
    private List<Peca> peca;
    private List<MaoObra> maoObra;
    
    public Orcamento(){
        
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
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the peca
     */
    public List<Peca> getPeca() {
        return peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(List<Peca> peca) {
        this.peca = peca;
    }

    /**
     * @return the maoObra
     */
    public List<MaoObra> getMaoObra() {
        return maoObra;
    }

    /**
     * @param maoObra the maoObra to set
     */
    public void setMaoObra(List<MaoObra> maoObra) {
        this.maoObra = maoObra;
    }
    
    
    
}

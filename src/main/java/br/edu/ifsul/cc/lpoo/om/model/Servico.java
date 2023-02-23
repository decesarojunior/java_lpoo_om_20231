
package br.edu.ifsul.cc.lpoo.om.model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Prof. Telmo Jr
 */

@Entity//indica que a classe será gerenciada
//pelo jpa/hibernate.
@Table(name = "tb_servico")//defini o formato do 
//armazenamento (em tabela).
public class Servico {
    
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    private Equipe equipe;
    
    
    private Orcamento orcamento;
    private StatusServico status;
    
    
    //agregacao por composicao.
    @OneToMany(mappedBy = "servico")//mappedBy deve apontar para a referencia de jogador dentro de Compra.
    private List<Pagamento> pagamentos;
     
    
    public Servico(){
        
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
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the data_inicio
     */
    public Calendar getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public Calendar getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the equipe
     */
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * @param equipe the equipe to set
     */
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    /**
     * @return the orcamento
     */
    public Orcamento getOrcamento() {
        return orcamento;
    }

    /**
     * @param orcamento the orcamento to set
     */
    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    /**
     * @return the status
     */
    public StatusServico getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusServico status) {
        this.status = status;
    }

    /**
     * @return the pagamentos
     */
    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    /**
     * @param pagamentos the pagamentos to set
     */
    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    
    
}

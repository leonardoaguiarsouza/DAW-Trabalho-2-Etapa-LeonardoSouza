/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "mensalidades")
public class Mensalidades implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_mensalidades", sequenceName = "seq_mensalidades_id",
            allocationSize = 1)
    @GeneratedValue(generator = "seq_mensalidades", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull(message = "O valor deve ser informado")
    @Column(name = "valor", nullable = false, columnDefinition = ("decimal(10,2)"))
    private Double valor;
    @Temporal(TemporalType.DATE)
    @NotNull(message = "O vencimento deve ser informado")
    @Column(name = "vencimento", nullable = false)
    private Calendar vencimento;
    @Column(name = "valorPagamento", columnDefinition = ("decimal(10,2)"))  
    private Double valorPagamento;
    @Temporal(TemporalType.DATE)    
    @Column(name = "data_pagamento")
    private Calendar dataPagamento;

    public Mensalidades() {
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
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the vencimento
     */
    public Calendar getVencimento() {
        return vencimento;
    }

    /**
     * @param vencimento the vencimento to set
     */
    public void setVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }

    /**
     * @return the valorPagamento
     */
    public Double getValorPagamento() {
        return valorPagamento;
    }

    /**
     * @param valorPagamento the valorPagamento to set
     */
    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    /**
     * @return the dataPagamento
     */
    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensalidades other = (Mensalidades) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

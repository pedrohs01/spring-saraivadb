package br.com.projeto.domain;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Precos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpreco;
	
	@Column(nullable=false)
	private String precoatual;
	
	@Column(nullable=false)
	private String precodesconto;
	
	@Column
	@CreationTimestamp
	private Date dataalteracao;

	public Precos() {
	}

	public Precos(Integer idpreco, String precoatual, String precodesconto, Date dataalteracao) {
		this.idpreco = idpreco;
		this.precoatual = precoatual;
		this.precodesconto = precodesconto;
		this.dataalteracao = dataalteracao;
	}

	public Integer getIdpreco() {
		return idpreco;
	}

	public void setIdpreco(Integer idpreco) {
		this.idpreco = idpreco;
	}

	public String getPrecoatual() {
		return precoatual;
	}

	public void setPrecoatual(String precoatual) {
		this.precoatual = precoatual;
	}

	public String getPrecodesconto() {
		return precodesconto;
	}

	public void setPrecodesconto(String precodesconto) {
		this.precodesconto = precodesconto;
	}

	public Date getDataalteracao() {
		return dataalteracao;
	}

	public void setDataalteracao(Date dataalteracao) {
		this.dataalteracao = dataalteracao;
	}
	
	
}

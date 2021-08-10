package br.com.enio.zoologico.model;

import java.time.LocalDate;

public class PessoaModel {
	private String nome;
	private LocalDate nasc;
	private Long id;
	private static Long gerador = Long.valueOf(0);
	
	public String getNome() {
		return nome;
	}
	public LocalDate getNasc() {
		return nasc;
	}
	public PessoaModel(String nome,LocalDate nasc) {
		this.id=++gerador;
		this.nome=nome;
		this.nasc=nasc;

	}
	public Long getId() {
		return id;
	}
}

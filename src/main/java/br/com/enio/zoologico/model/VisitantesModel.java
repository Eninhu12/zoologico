package br.com.enio.zoologico.model;

import java.time.LocalDate;

public class VisitantesModel extends PessoaModel {
	private EnumTipoIngressoModel tipo;
	public EnumTipoIngressoModel getTipo() {
		return tipo;
	}
	public VisitantesModel(String nome,LocalDate nasc,EnumTipoIngressoModel tipo) {
		super(nome,nasc);
		this.tipo=tipo;
	}
}


package br.com.hephestus.locadora.entidades;

import java.util.List;

/**
 * Created by igor on 05/02/16.
 */
public class Modelo {

    private Short idModelo;
    private String descricao;

    private List<Veiculo> veiculos;

    public Short getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Short idModelo) {
        this.idModelo = idModelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}

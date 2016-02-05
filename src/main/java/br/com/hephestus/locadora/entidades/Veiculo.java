package br.com.hephestus.locadora.entidades;

/**
 * Created by igor on 05/02/16.
 */
public class Veiculo {

    private Integer idVeiculo;
    private String placa;
    private Double valor;

    private Modelo modelo;

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}

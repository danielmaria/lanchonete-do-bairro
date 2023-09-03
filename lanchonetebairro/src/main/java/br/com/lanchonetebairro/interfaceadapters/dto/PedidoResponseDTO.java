package br.com.lanchonetebairro.interfaceadapters.dto;

import br.com.lanchonetebairro.enterpriserules.enums.StatusDoPedido;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoResponseDTO {

    private Long id;
    private List<ProdutoResponseDTO> produtos;
    private ClienteResponseDTO cliente;
    private PagamentoResponseDTO pagamento;
    private StatusDoPedido status;
    private LocalDateTime dataCriacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProdutoResponseDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoResponseDTO> produtos) {
        this.produtos = produtos;
    }

    public ClienteResponseDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteResponseDTO cliente) {
        this.cliente = cliente;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public PagamentoResponseDTO getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoResponseDTO pagamento) {
        this.pagamento = pagamento;
    }
}

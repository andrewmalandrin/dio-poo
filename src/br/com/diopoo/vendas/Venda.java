package br.com.diopoo.vendas;

public class Venda {
    String pagamento;
    int idUsuario, idProduto, parcelas;

    public Venda() {
    }

    public Venda(String pagamento, int idUsuario, int idProduto, int parcelas) {
        this.pagamento = pagamento;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.parcelas = parcelas;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}

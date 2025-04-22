public class Fornecedor extends PessoaJuridica {
    private String produtos;

    public Fornecedor(String cnpj, String razao, String endereco, String nome, String telefone, String produtos) {
        super(cnpj, razao, endereco, nome, telefone);
        this.produtos = produtos;
    }   
}

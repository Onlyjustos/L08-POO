public class Loja {
    public static Funcionario funcionarios[];
    public static Cliente clientes[];
    
    public static void main(String args[]){
        funcionarios = new Funcionario[0];
        


    }
    public void cadastraClientes(String interesses,String profissao,double renda,String cpf, char sexo, String estadoCivil, String endereco, String nome,String telefone){
        clientes[0] = new Cliente(interesses,profissao,renda,cpf,sexo,estadoCivil,endereco,nome,telefone);

    }

}

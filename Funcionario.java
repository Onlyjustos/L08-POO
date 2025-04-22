public class Funcionario extends PessoaFisica{
    int matricula;
    double salario;
    String cargo;

    public Funcionario(String cargo, int matricula, double salario,String cpf,char sexo,String estadoCivil,String endereco, String nome,String telefone) {
        super(cpf,sexo,estadoCivil,endereco,nome,telefone);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        
    }

}

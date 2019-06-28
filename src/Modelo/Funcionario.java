package Modelo;

public class Funcionario {
    //Com private não deixar o programador acessar todos as informção automaticamente, ele terar que aplicar o método get e set para pode aplicar essa informações

    private String nome;
    private double salario;
    private int codCargo;
    private int tempserviço;

    //da retorno para acessar o valor
    public String getNome() {
        return this.nome;
    }

    //não da retorno da informação, só alterar o valor da variavel.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodCargo() {
        return this.codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public int gettempserviço() {
        return this.tempserviço;
    }

    public void settempserviço(int tempserviço) {
        this.tempserviço = tempserviço;

    }
}

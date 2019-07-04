package Modelo;

public class Funcionario {
    //Com private não deixar o programador acessar todos as informção automaticamente, ele terar que aplicar o método get e set para pode aplicar essa informações

    private String nome;
    private String Sobrenome;
    private double salario;
    private int codCargo;
    private int tempserviço;
    private String Cargo;

    //da retorno para acessar o valor
    public String getNome() {
        return this.nome;
    }

    //não da retorno da informação, só alterar o valor da variavel.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.nome;
    }

    public void setSobrenome(String nome) {
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

    public String getCargo() {
        Cargo = "";

        if (codCargo == 101) {
            Cargo = "Gerente";
        } else if (codCargo == 102) {
            Cargo = "Engenheiro";
        } else if (codCargo == 103) {
            Cargo = "Técnico";
        } else {
            Cargo = "Não está cadastrado";
        }

        return this.Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
}

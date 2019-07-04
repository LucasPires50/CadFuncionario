package cadfuncionario;

import Modelo.Funcionario;
import cargo.AumentoSalarial;

public class CadFuncionarioPrincipal {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        //Para acessar os atributos do funcioário inderetamente pelo metodo set, pois é private.
        f.setNome("Lucas");
        f.setSobrenome("");
        f.setSalario(2000);
        f.setCodCargo(101);
        f.settempserviço(2);
        f.setCargo("");
        //essa classe vai receber tudo que tem na classe funcionário com o (f).
        AumentoSalarial a = new AumentoSalarial(f);

        double novoSalario = a.calcularAumento();

        System.out.println("Nome do Funcionário: " + f.getNome());
        System.out.println("Salário: " + "R$" + f.getSalario());
        System.out.println("Código do Cargo: " + f.getCodCargo());
        System.out.println("Tempo de serviço: " + f.gettempserviço() + " anos");
        System.out.println("Novo Salário: " + "R$" + novoSalario);

    }

}

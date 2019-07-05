package cargo;

import Modelo.Funcionario;

public class AumentoSalarial {

    private Funcionario func;

    public AumentoSalarial(Funcionario func) {
        this.func = func;
    }
/**
 *Este método define o calculo do novo salário de acordo
 * com o código do cargo
 * 
 * @return novo salário
 */
    public double calcularAumento() {
        double novoSalario = 0;
        int codCargo = this.func.getCodCargo();

        if (codCargo == 101) {
            novoSalario = this.calcGerente();
        } else if (codCargo == 102) {
            novoSalario = this.calcEngenheiro();
        } else if (codCargo == 103) {
            novoSalario = this.calcTecnico();
        } else {
            novoSalario = this.calcGeral();
        }
        return novoSalario;
    }
/**
 *Este método defini o calculo do aumento saláril
 * para o cargo gerente
 * 
 * @return novo salário do gerente
 */
    private double calcGerente() {

        int tempo = this.func.gettempserviço();
        double percentual = 0;

        if (tempo >= 1 & tempo < 2) {
            percentual = 10;
        } else if (tempo <= 3) {
            percentual = 20;
        } else {
            percentual = 25;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;
    }
/**
 *Este método defini o calculo do aumento saláril
 * para o cargo Engenheiro
 * 
 * @return novo salário do Engenheiro
 */
    private double calcEngenheiro() {

        int tempo = this.func.gettempserviço();
        double percentual = 0;

        if (tempo >= 1 & tempo < 2) {
            percentual = 15;
        } else if (tempo <= 3) {
            percentual = 30;
        } else {
            percentual = 35;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;

    }
 /**
 *Este método defini o calculo do aumento saláril
 * para o cargo Tecnico
 * 
 * @return novo salário do Tecnico
 */   
    private double calcTecnico() {

        int tempo = this.func.gettempserviço();
        double percentual = 0;

        if (tempo >= 1 & tempo < 2) {
            percentual = 5;
        } else if (tempo <= 3) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;

    }
/**
 *Este método defini o calculo do aumento saláril
 * para o cargo não cadastrado
 * 
 * @return novo salário do cargo não cadastrado
 */

    private double calcGeral() {
        int tempo = this.func.gettempserviço();
        double percentual = 0;

        if (tempo > 3) {
            percentual = 35;
        }
        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;
    }

}

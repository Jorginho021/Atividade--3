// Funcionario.java
public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}

// Gerente.java
class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario("Marcos", 4000.0);
        Gerente ger = new Gerente("Juliana", 8000.0);

        System.out.println("Bônus de " + func.nome + ": R$ " + func.calcularBonus());
        System.out.println("Bônus de " + ger.nome + ": R$ " + ger.calcularBonus());
    }
}

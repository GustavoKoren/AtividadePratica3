package Trabalhadores;

public class Gerente extends Funcionario {
    private String equipeSobGerencia;
    private float bonus;

    public Gerente() {
    }

    public Gerente(String nome, String matricula, float salario, String equipeSobGerencia, float bonus) {
        super(nome, matricula, salario);
        this.equipeSobGerencia = equipeSobGerencia;
        this.bonus = bonus;
    }

    public String getEquipeSobGerencia() {
        return equipeSobGerencia;
    }

    public void setEquipeSobGerencia(String equipeSobGerencia) {
        this.equipeSobGerencia = equipeSobGerencia;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        System.out.println("\n--GERENTE--");
        return super.toString() + "\nA equipe que esta sob Gerencia: " + equipeSobGerencia + "\nO Bonus Anual: " + bonus
                + ".";
    }

    @Override
    public String trabalhar() {

        return "\nO Gerente " + getNome() + " esta trabalhando em um projeto para a empresa. ";
    }

    @Override
    public String relatarProgresso() {
        return "\nO Gerente " + getNome() + " este gerenciando a equipe " + equipeSobGerencia
                + " da melhor forma possivel."
                + "\n----------";
    }

    @Override
    public float calcularSalario() {
        return getSalario() + getBonus();
    }/* FORMA 1 */
}

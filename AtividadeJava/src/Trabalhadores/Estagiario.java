package Trabalhadores;

public class Estagiario extends Funcionario {
    private Float horasDeTrabalho;
    private String supervisor;

    public Estagiario() {
    }

    public Estagiario(String nome, String matricula, float salario, float horasDeTrabalho, String supervisor) {
        super(nome, matricula, salario);
        this.horasDeTrabalho = horasDeTrabalho;
        this.supervisor = supervisor;
    }

    public Float getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public void setHorasDeTrabalho(Float horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        System.out.println("\n--ESTAGIARIO--");
        return super.toString() + "\nHoras de Trabalho: " + horasDeTrabalho + "\nSupervisor: " + supervisor;
    }

    @Override
    public String trabalhar() {
        return "\nO estagiario " + getNome() + " esta fazendo sua função no trabalho!";
    }

    @Override
    public String relatarProgresso() {
        return "\nO estagiario " + getNome() + " esta trabalhando, sob a supervisao do " + supervisor
                + ".\n----------";
    }

    @Override
    public float calcularSalario() {
        return getSalario() * horasDeTrabalho;
    }// O salario do estagiaraio vai ser o valor que o usuario colocar * as horas
     // trabalhadas.
}

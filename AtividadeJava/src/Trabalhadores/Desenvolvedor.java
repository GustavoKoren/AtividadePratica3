package Trabalhadores;

public class Desenvolvedor extends Funcionario {
    private String linguagens;
    private int projetos;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String matricula, float salario, String linguagens) {// , int projetos) {
        super(nome, matricula, salario);
        this.linguagens = linguagens;
        // this.projetos = projetos;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    public int getProjetos() {
        return projetos;
    }

    public void setProjetos(int projetos) {
        this.projetos = projetos;
    }

    @Override
    public String toString() {
        System.out.println("\n--DESENVOLVEDOR--");
        return super.toString() + "\nLinguagens de Programação: " + linguagens + ".";
    }

    @Override
    public String trabalhar() {
        return "\nO Desenvolvedor " + getNome() + " esta estudando " + linguagens + ".";
    }

    @Override
    public String relatarProgresso() {
        return "\nO Desenvolvedor " + getNome() + " esta desenvolvendo em " + linguagens
                + "...\n----------";
    }

    @Override
    public float calcularSalario() {
        // projetos = 2;
        return getSalario(); // + projetos;//cada projeto em desenvolvimento e 200 a mais no salario do
                             // dev...
    }
}
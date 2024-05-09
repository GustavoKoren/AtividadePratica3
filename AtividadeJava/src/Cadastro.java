import java.util.ArrayList;
import java.util.List;

import Trabalhadores.Funcionario;

public class Cadastro {
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();
    public static Object getListaFuncionarios;

    // Método que adiciona funcuonario a lista
    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    // Método para buscar funcionario na lista usando sua matricula
    public static Funcionario buscar(String matricula) {

        // Passando por todas os funcionarios da lista
        for (Funcionario funcionarioTemporario : listaFuncionarios) {

            // Testando se o funcionario existe coparando sua matricula
            if (funcionarioTemporario.getMatricula() == matricula) {
                // Funcionario encontrada=o, então retornamos ele
                return funcionarioTemporario;
            }
        }
        // Se o funciionario não for encontrada retornaremos nulo
        return null;
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

}

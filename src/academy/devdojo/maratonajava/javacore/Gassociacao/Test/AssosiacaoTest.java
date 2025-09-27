package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Dominio.Seminario;


public class AssosiacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua mirafroles");
        Aluno aluno = new Aluno(23, "wellington");
        Professor professor = new Professor("Paulo ", "matematica"   );
        Aluno[] alunosparaseminario = {aluno};
        Seminario seminario = new Seminario("Naruto", alunosparaseminario, local);
        Seminario[] seminariosdisponiveis = {seminario};

        professor.setSeminarios(seminariosdisponiveis);

        professor.imprime();



    }
}

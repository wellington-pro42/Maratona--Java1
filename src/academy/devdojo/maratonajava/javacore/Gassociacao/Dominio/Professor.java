package academy.devdojo.maratonajava.javacore.Gassociacao.Dominio;


public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public void imprime() {
        System.out.println("============");
        System.out.println("professor " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("Seminarios cadastrados");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("alunos====");
            for (Aluno aluno: seminario.getAlunos()){
                System.out.println("aluno: " + aluno.getNome() + "idade" + aluno.getIdade());

            }


        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }


}



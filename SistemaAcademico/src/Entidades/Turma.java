package Entidades;

public class Turma {
    int id_turma;
    int q_min_alunos;
    int alunos;
    String data_inicio;
    String data_fim;
    String professor;
  

    public Turma(int id_turma, int q_min_alunos, int alunos, String data_inicio, String data_fim, String professor){
    this.id_turma = id_turma;
    this.q_min_alunos = q_min_alunos;
    this.alunos = alunos;
    this.data_inicio = data_inicio;
    this.data_fim = data_fim;
    this.professor =  professor;
    }
}

package Entidades;

public class Aluno {
    private int cpf;
    private int matricula;
    private String email;
    private String data_nasc;


    public Aluno(int cpf, int matricula, String email, String data_nasc){
        this.cpf = cpf;
        this.matricula = matricula;
        this.email = email;
        this.data_nasc = data_nasc;
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getData_nasc() {
        return data_nasc;
    }


    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    //como add enderço?
    
    
}

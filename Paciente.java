package diagrama;

import java.time.LocalDate;



/**
 *
 * @author Aluno
 */
public class Paciente{
private String cpf;
private String nome;
private LocalDate data_nascimento;
private String plano_saude;

    public Paciente(String cpf, String nome, LocalDate data_nascimento, String plano_saude) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.plano_saude = plano_saude;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cpf=" + cpf +
                " nome" + nome +
                " data_nascimento" + data_nascimento +
                " plano_saude" + plano_saude + '}';
    }


 





    
}

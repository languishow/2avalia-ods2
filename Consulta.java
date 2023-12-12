package diagrama;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Consulta extends Paciente {
  private LocalDate data;
  private String local_atendimento;

    public Consulta(String cpf, String nome, LocalDate data_nascimento, String plano_saude) {
        super(cpf, nome, data_nascimento, plano_saude);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal_atendimento() {
        return local_atendimento;
    }

    public void setLocal_atendimento(String local_atendimento) {
        this.local_atendimento = local_atendimento;
    }

    @Override
    public String toString() {
        return "Consulta{" + "data" + data +
                " local_atendimento" + local_atendimento + '}';
    }
    
    
    

  
 


  
  
}

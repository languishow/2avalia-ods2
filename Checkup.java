package diagrama;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Checkup extends Consulta {
  private String ValorAdicional;
  private String PlanSenai;

    public Checkup(String ValorAdicional, String PlanSenai, String cpf, String nome, LocalDate data_nascimento, String plano_saude) {
        super(cpf, nome, data_nascimento, plano_saude);
        this.ValorAdicional = ValorAdicional;
        this.PlanSenai = PlanSenai;
    }

    public String getValorAdicional() {
        return ValorAdicional;
    }

    public void setValorAdicional(String ValorAdicional) {
        this.ValorAdicional = ValorAdicional;
    }

    public String getPlanSenai() {
        return PlanSenai;
    }

    public void setPlanSenai(String PlanSenai) {
        this.PlanSenai = PlanSenai;
    }

    @Override
    public String toString() {
        return "Checkup{" + "ValorAdicional" + ValorAdicional +
                "PlanSenai" + PlanSenai + '}';
    }

   
}

package diagrama;



/**
 *
 * @author Aluno
 */
public class Clinica {
 private String nome;
 private String endereco;
 private String cnpj;
 private Float ValorConsulta;
 private final Float ValorTotal;
 private final String realizarAtendimento;

    public Clinica(String nome, String endereco, String cnpj, Float ValorConsulta, Float ValorTotal, String realizarAtendimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.ValorConsulta = ValorConsulta;
        this.ValorTotal = ValorTotal;
        this.realizarAtendimento = realizarAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Float getValorConsulta() {
        return ValorConsulta;
    }

    public void setValorConsulta(Float ValorConsulta) {
        this.ValorConsulta = ValorConsulta;
    }
    
  
  public Float getValorTotal() {
        return ValorTotal;
    }
 
  public String realizarAtendimento() {
      return realizarAtendimento;
  }

    @Override
    public String toString() {
        return "Clinica{" + "nome" + nome + 
                " endereco" + endereco + 
                " cnpj" + cnpj +
                " ValorConsulta" + ValorConsulta + 
                " ValorTotal" + ValorTotal + 
                " realizarAtendimento" + realizarAtendimento + '}';
    }
  
  

 
   
 
}

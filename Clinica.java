package com.mycompany.mavenproject1;



/**
 *
 * @author Aluno
 */
public class Clinica {
 private String nome;
 private String endereco;
 private String cnpj;
 private String ValorConsulta;
 private String ValorTotal;
 private String realizarAtendimento;

    public Clinica(String nome, String endereco, String cnpj, String ValorConsulta) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.ValorConsulta = ValorConsulta;
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

    public String getValorConsulta() {
        return ValorConsulta;
    }

    public void setValorConsulta(String ValorConsulta) {
        this.ValorConsulta = ValorConsulta;
    }
    
  public String getValorTotal() {
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

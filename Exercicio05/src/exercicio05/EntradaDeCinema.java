package exercicio05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class EntradaDeCinema {
    
    private String nome;
    private String nomeDoFilme;
    private LocalDate dataDeNascimento;
    private LocalDate dataDoFilme;
    private LocalTime horarioDoFilme;
    private int sala;
    private double valor;
    
    EntradaDeCinema(){}
    
    EntradaDeCinema(String nomeDoFilme, String nome, LocalDate dataDeNascimento, LocalDate dataDoFilme, 
                    LocalTime horarioDoFilme, int sala, double valor){
        
        this.nomeDoFilme = nomeDoFilme;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDoFilme = dataDoFilme;
        this.horarioDoFilme = horarioDoFilme;
        this.sala = sala;
        this.valor = valor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getNomeDoFilme(){
        return nomeDoFilme;
    }
    
    public LocalDate getDataDeNascimento(){
        return dataDeNascimento;
    }
    
    public LocalDate getDataDoFilme(){
        return dataDoFilme;
    }
    
    public LocalTime getHorarioDoFilme(){
        return horarioDoFilme;
    }
    
    public int getSala(){
        return sala;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNomeDoFilme(String nomeDoFilme){
        this.nomeDoFilme = nomeDoFilme;
    }
    
    public void setDataDeNascimento(LocalDate dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public void setDataDoFilme(LocalDate dataDoFilme){
        this.dataDoFilme = dataDoFilme;
    }
    
    public void setHorarioDoFilme(LocalTime horarioDoFilme){
        this.horarioDoFilme = horarioDoFilme;
    }
    
    public void setSala(int sala){
        this.sala = sala;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void calculaDesconto() {
        int idade = Period.between(dataDeNascimento, dataDoFilme).getYears();
        
        if (idade < 12) {
            valor *= 0.5;
        }else if (idade >= 12 && idade <= 15) {
            valor *= 0.6;
        } else if (idade >= 16 && idade <= 20) {
            valor *= 0.7; 
        } else if (idade > 20) {
            valor *= 0.8; 
        }
    }
    
    public void calculaDescontoHorario() {
        if (horarioDoFilme.isBefore(LocalTime.of(16, 0))) {
            valor *= 0.9; 
        }
    }
    
    @Override
    public String toString(){
        return "\n\t- - - Dados do Ingresso - - -\n" +
                "\n\tNome: " + getNome() +
                "\n\tData de Nascimento: " + getDataDeNascimento() +
                "\n\tNome do Filme: " + getNomeDoFilme() +
                "\n\tData do Filme: " + getDataDoFilme() +
                "\n\tHorario do Filme: " + getHorarioDoFilme() +
                "\n\tSala: " + getSala() +
                "\n\tValor: R$ " + getValor() +
                "\n";
    }
}

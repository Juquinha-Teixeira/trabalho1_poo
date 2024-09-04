package exercicio05;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        
        EntradaDeCinema dados = new EntradaDeCinema();
        
        dados.setNome("Joao Pedro");
        dados.setNomeDoFilme("Jurassic Park");
        dados.setDataDeNascimento(LocalDate.of(2010, 5, 15)); 
        dados.setDataDoFilme(LocalDate.now());
        dados.setHorarioDoFilme(LocalTime.of(14, 30)); 
        dados.setSala(3);
        dados.setValor(15.00);
        
        dados.calculaDesconto();
        dados.calculaDescontoHorario(); 
        
        System.out.println(dados);
    }
}

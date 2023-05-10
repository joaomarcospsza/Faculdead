package ClassesInformacoes;

import java.time.LocalDateTime;

import ClasseReservas.Reserva;

public class Pessoa {
    protected String nome;
    protected String email;
    protected String telefone;
    protected String senha;
    protected boolean ativo = true;
    protected LocalDateTime dataAtuzalizacao;
    protected LocalDateTime dataCriacao;
    private Reserva reserva; 

    public Pessoa(String nome,String email, String telefone, String senha, 
        boolean ativo, LocalDateTime dataAtuzalizacao, LocalDateTime dataCriacao, Reserva reserva){
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.senha = senha;
            this.ativo = ativo;
            this.dataAtuzalizacao = dataAtuzalizacao;
            this.dataCriacao = dataCriacao;
            this.reserva = reserva;
    }   

    //Metodo PARA IMPRIMIR
    public void imprimirDados(){}

    
}

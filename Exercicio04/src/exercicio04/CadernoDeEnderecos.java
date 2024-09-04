package exercicio04;

public class CadernoDeEnderecos {
    
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;
    private String endereco;
    
    CadernoDeEnderecos(){}
    
    CadernoDeEnderecos(String nome, String telefone, String email,
                        String dataAniversario, String endereco)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getDataAniversario(){
        return dataAniversario;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone.replaceAll("(\\d{2})(\\d{1})(\\d{4})(\\d{4})", "($1) $2 $3-$4");
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setDataAniversario(String dataAniversario){
        this.dataAniversario = dataAniversario;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return "\n\tNome: " + getNome() +
                "\n\tTelefone: " + getTelefone() +
                "\n\tEmail: " + getEmail() +
                "\n\tData de Aniversário: " + getDataAniversario() +
                "\n\tEndereco: " + getEndereco() +
                "\n";
    }
}

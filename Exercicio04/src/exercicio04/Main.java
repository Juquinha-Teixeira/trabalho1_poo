package exercicio04;

public class Main {
   
    public static void main(String[] args) {
       
        CadernoDeEnderecos caderno1 = new CadernoDeEnderecos();
        
        caderno1.setNome("Joao Pedro");
        caderno1.setTelefone("64999844777");
        caderno1.setEmail("juca.pedroca.20@hotmail.com");
        caderno1.setDataAniversario("25-06");
        caderno1.setEndereco("Rua Anhanguera, 949 - Centro");
        
        System.out.println(caderno1);
    }
    
}

package exercicio01;

public class CalculadoraCompleta extends Calculadora {
  
    public CalculadoraCompleta() {}
     
    public CalculadoraCompleta(float numero1, float numero2) {
        super(numero1, numero2);  
    }
    
    public double getPotenciacao1(){
        return Math.pow(getNumero1(), 2);
    }
    
    public double getPotenciacao2(){
        return Math.pow(getNumero2(), 2);
    }
    
     public double getRadiciacao1(){
        return Math.sqrt(getNumero1());
    }
    
    public double getRadiciacao2(){
        return Math.sqrt(getNumero2());
    }
    
    @Override
    public String toString() {
    return String.format("\n\t- - - Calculadora - - -\n" +
                         "\n\tNumero 1 -- %.2f\n\tNumero 2 -- %.2f\n" +
                         "\n\tAdicao -- %.2f" +
                         "\n\tSubtracao -- %.2f" +
                         "\n\tMultiplicacao -- %.2f" +
                         "\n\tDivisao -- %.2f" +
                         "\n\tNumero 1 ao quadrado -- %.2f\n\tNumero 2 ao quadrado -- %.2f" +
                         "\n\tNumero 1 raiz -- %.2f\n\tNumero 2 raiz -- %.2f\n",
                         getNumero1(), getNumero2(), 
                         getAdicao(), getSubtracao(), getMultiplicacao(), getDivisao(),
                         getPotenciacao1(), getPotenciacao2(), getRadiciacao1(), getRadiciacao2());
    }

}

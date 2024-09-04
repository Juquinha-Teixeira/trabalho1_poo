package exercicio01;

public class Calculadora {
    
    private float numero1;
    private float numero2;
    
    Calculadora(){}
    
    Calculadora(float numero1, float numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public float getNumero1(){
        return numero1;
    }
    
    public float getNumero2(){
        return numero2;
    }
    
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    public double getAdicao(){
        return (this.numero1+this.numero2);
    }
    
    public double getSubtracao(){
        return (this.numero1-this.numero2);
    }
    
    public double getMultiplicacao(){
        return (this.numero1*this.numero2);
    }
    
    public double getDivisao(){
        return (this.numero1/this.numero2);
    }
}

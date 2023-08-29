public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;
    
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    
    public int getCracha() {
        return cracha;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }
    
    public char getTipoVinculo() {
        return tipoVinculo;
    }
    
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    public float getValorHora() {
        return valorHora;
    }
    
    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }
    
    public float getQtdeHora() {
        return qtdeHora;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float getValorDesconto() {
        return valorDesconto;
    }
    
    public float calcularValorSalario() {
        float valorSalario;
        if (tipoVinculo == 'H') {
            valorSalario = valorHora * qtdeHora - valorDesconto;
        } else {
            valorSalario = salario - valorDesconto;
        }
        return valorSalario;
    }
    
    public String imprimir() {
        float valorSalario = calcularValorSalario();
        return "Crachá: " + cracha + "\nNome: " + nome + "\nTipo Vínculo: " + tipoVinculo +
                "\nSalário: " + (tipoVinculo == 'H' ? (valorHora * qtdeHora) : salario) +
                "\nDesconto: " + valorDesconto + "\nValor a receber: " + valorSalario;
    }
}

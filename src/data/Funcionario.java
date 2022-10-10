
package data;

//classe que é usada para criar cada funcionário a ser encapsulado num objeto
public class Funcionario {
    
    //Atributos da classe
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    
    /*
    //Crio Construtor da classe
    public Funcionario(String matricula, String nome, String cargo, Double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    */
    
    //Crio Construtor vazio da Classe
    public Funcionario() {
    }
    
    //Métodos Getter e Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
          
    
}

public class Pessoas {
    //declarar os atributos 
    private String CPF;
    private String Nome;
    private String Endereco;
    private String Email;
    private double Salario;
    private int QtdFilhos;

    // private int Percentual;
 
    //declarar o metodo construtor
    public Pessoas (String _CPF,
    String _Nome,
    String _Endereco,
    String _Email,
    double _Salario,
    int _QtdFilhos
    )
    {
        this.CPF = _CPF;
        this.Nome = _Nome;
        this.Endereco = _Endereco;
        this.Email = _Email;
        this.Salario = _Salario;
        this.QtdFilhos = _QtdFilhos;

    }
    //demais metodos 
    public void ImprimirNome(){
        double totalSalario = this.Salario + this.ReajustarSalario(12) + this.SalFamilia(QtdFilhos);
        System.out.println
        ("\n RECIBO: \n" +
         "\n CPF: "+ this.CPF+
        "\n nome: "+this.Nome+
         "\n endereço: "+this.Endereco+
         "\n email: "+this.Email+
         "\n salario: "+this.Salario+
         "\n qtdFilhos: "+ this.QtdFilhos+
         "\n valor reajustado: " + ReajustarSalario(12)+
         "\n salario familía: " + SalFamilia(5)+
         "\n total salario: " + totalSalario
        );
 
     }

    public double ReajustarSalario(double percentual){

        double ReajSal = this.Salario = this.Salario * (1 + (percentual/100));
        return ReajSal;
    } 

    public double SalFamilia(double percentual){
        double ValorReajuste = 0;
        if (this.QtdFilhos > 0){
            ValorReajuste = (this.Salario = this.Salario * (percentual/100)) * this.QtdFilhos;
        }
    
        return ValorReajuste;
    }


 }

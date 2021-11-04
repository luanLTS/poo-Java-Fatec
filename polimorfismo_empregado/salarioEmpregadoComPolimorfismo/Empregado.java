package salarioEmpregadoComPolimorfismo;
// classes abstratas não podem ser instanciadas
// classes abstratas podem definir metodos abstratos
public abstract class Empregado {
    public abstract double calculaSalario(); // metodo que ira ser sobreescrito pelas classes que herdarão ela
}

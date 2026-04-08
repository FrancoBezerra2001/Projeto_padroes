// A Interface Estratégia
interface EstrategiaEnvio {
    double calcularFrete(double peso);
}

// Estratégia Concreta 1
class EnvioExpresso implements EstrategiaEnvio {
    public double calcularFrete(double peso) { return peso * 15.5; }
}

// Estratégia Concreta 2
class EnvioEconomico implements EstrategiaEnvio {
    public double calcularFrete(double peso) { return peso * 5.2; }
}

// O Contexto que utiliza a estratégia
class CalculadoraEntrega {
    private EstrategiaEnvio estrategia;

    public void setEstrategia(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }

    public double realizarCalculo(double peso) {
        return estrategia.calcularFrete(peso);
    }
}
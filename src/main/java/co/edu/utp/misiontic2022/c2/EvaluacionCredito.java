package co.edu.utp.misiontic2022.c2;

public  class EvaluacionCredito {
    private Double interesSimple = 0.0D;
    private Double interesCompuesto = 0.0D;
    private final Double INTERESSIMPLE = 2.5/100;
    private final Double INTERESCOMPUESTO = 2.2/100;

    private Double valor;
    private Integer tiempo;

    public Double getValor() {
        return valor;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    // Calcula intereses a pagar en un crédito de interés simple.

    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interesSimple = this.valor * interes * this.tiempo;
        return interesSimple;
    }

    // Calcula intereses a pagar en un credito de interes compuesto.
    
    private Double calcularInteresCompuesto(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interesCompuesto = this.valor * (Math.pow((1 + interes), this.tiempo) - 1);
        return interesCompuesto;
    }

    // Compara las distintas opciones de crédito para tomar la mejor decisión.
    
    public String compararOpcion(Double valor, Integer tiempo) {
        String opcion;
        this.valor = valor;
        this.tiempo = tiempo;
        this.calcularInteresSimple(this.valor, this.tiempo, INTERESSIMPLE);
        this.calcularInteresCompuesto(this.valor, this.tiempo, INTERESCOMPUESTO);
        Double diferencia = interesSimple - interesCompuesto;
        if (diferencia > 0) {
            opcion = "credito estandar";
        } else {
            opcion = "credito especial";
        }
        return opcion;
    }
}

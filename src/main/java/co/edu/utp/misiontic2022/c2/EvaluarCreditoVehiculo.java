package co.edu.utp.misiontic2022.c2;

// EvaluarCreditoVehiculo

public class EvaluarCreditoVehiculo {
    private Double interesSimple = 0.0D;
    private Double interesCompuesto = 0.0D;
    private Double interes;

    private Double valor;
    private Integer tiempo;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    // Calcula intereses a pagar en un crédito de interés simple.

    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interes = interes;
        interesSimple = valor * interes * tiempo;
        return interesSimple;
    }

    // Calcula intereses a pagar en un credito de interes compuesto.
    
    private Double calcularInteresCompuesto(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interes = interes;
        interesCompuesto = valor * (Math.pow((1 + interes), tiempo) - 1);
        return interesCompuesto;
    }

    // Compara las distintas opciones de crédito para tomar la mejor decisión.
    
    public String compararOpcion(Double valor, Integer tiempo) {
        String opcion;
        this.valor = valor;
        this.tiempo = tiempo;
        this.interes = 2.5D/100;
        this.calcularInteresSimple(valor, tiempo, interes);
        this.interes = 2.2D/100;
        this.calcularInteresCompuesto(valor, tiempo, interes);
        Double diferencia = interesSimple - interesCompuesto;
        if (diferencia > 0) {
            opcion = "credito estandar";
        } else {
            opcion = "credito especial";
        }
        return opcion;
    }

    // Calse main para probar programa
    public static void main(String[] args) {
        Double valor = 35000000.0D;
        Integer tiempo = 12;
        EvaluarCreditoVehiculo evaluar = new EvaluarCreditoVehiculo();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);
    }
}

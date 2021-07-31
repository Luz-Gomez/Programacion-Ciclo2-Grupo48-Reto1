package co.edu.utp.misiontic2022.c2;

public class Evaluacion {
    /**private Double valor;
    private Integer tiempo;
    private Double interes;
    */
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

    /**
    public EvaluarCreditoVehiculo() {
        this.valor = 0.0;
        this.tiempo = 0;
        this.interes = 0.0;
    }

    public EvaluarCreditoVehiculo(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interes = interes;
    }
     * @param valor 
   

    public EvaluarCreditoVehiculo() {
        this.valor = valor;
        this.tiempo = tiempo;
    }

    /**
     * Calcula la cantidad de intereses a pagar en un crédito aplicando interés
     * simple.
     * 
     * @param valor   Cantidad de dinero necesario para adquirir el vehiculo
     * @param tiempo  Número de meses a los que espera terminar de pagar el
     *                préstamo.
     * @param interes Porcentaje de interes a aplicar.
     * @return El valor de interés que debe pagar por el prestamo.
     */
    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interes = interes;
        interesSimple = valor * interes * tiempo;
        System.out.println("valor " + valor + " tiempo " + tiempo + " interes " + interes + " interesSimple " + interesSimple );
        return interesSimple;
    }

    /**
     * Calcula la cantidad de intereses a pagar en un credito aplicando interes
     * compuesto.
     * 
     * @param valor   Cantidad de dinero necesario para adquirir el vehiculo
     * @param tiempo  Número de meses a los que espera terminar de pagar el
     *                préstamo.
     * @param interes Porcentaje de interes a aplicar.
     * @return El valor de interes que debe pagar por el prestamo.
     */
    private Double calcularInteresCompuesto(Double valor, Integer tiempo, Double interes) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.interes = interes;
        interesCompuesto = valor * (Math.pow((1 + interes), tiempo) - 1);
        System.out.println("valor " + valor + " tiempo " + tiempo + " interes " + interes + " interesCompuesto " + interesCompuesto );
        return interesCompuesto;
    }

    /**
     * * Compara las distintas opciones de crédito para tomar la mejor decisión.
     * @param valor Cantidad de dinero necesario para adquirir el vehiculo
     * @param tiempo Número de meses a los que espera terminar de pagar el préstamo.
     * @return Una cadena de caracteres que explique cuál es la opción que de debe tomar.
     * Los posibles valores son:
     *      <ul>
     *          <li><pre>credito especial</pre></li>
     *          <li><pre>credito estandar</pre></li>
     *      </ul>
     * En el caso quesea igual tomar cualquiera de los 2, debe elegir
     *      <pre>credito especial</pre>
     */
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

        return opcion + "Interes simple = " + interesSimple + " Interes Compuesto = " + interesCompuesto;
    }

    public static void main(String[] args) {
        Double valor = 53250000.0D;
        Integer tiempo = 36;
        Evaluacion evaluar = new Evaluacion();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);
    }

}

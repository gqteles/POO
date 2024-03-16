public class Ipi {

  private double taxa = 0.0;

  public double calcularIpi(double valor, String itemObjeto) {

    if (itemObjeto == "Produto") {
      taxa = valor * 0.25;
    }

    System.out.printf("Valor do produto original: %.2f", valor);
    System.out.println();
    System.out.printf("Valor da taxa IPI: %.2f", taxa);
    System.out.println();
    System.out.printf("Valor total: %.2f", (valor + taxa));
    System.out.println();

    return (valor + taxa);

  }

}
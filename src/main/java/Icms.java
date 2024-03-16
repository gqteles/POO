public class Icms {

  private double taxa = 0.0;

  public double calcularIcms(double valor) {

    taxa = valor * 0.17;

    System.out.printf("Valor do produto original: %.2f", valor);
    System.out.println();
    System.out.printf("Valor da taxa ICMS: %.2f", taxa);
    System.out.println();
    System.out.printf("Valor total: %.2f", (valor + taxa));
    System.out.println();

    return (valor + taxa);

  }
}
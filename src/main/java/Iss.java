public class Iss {

  private double taxa = 0.0;

  public double calcularIss(double valor, String itemObjeto) {

    if (itemObjeto == "Servico") {
      taxa = valor * 0.046;
    }

    System.out.printf("Valor do produto original: %.2f", valor);
    System.out.println();
    System.out.printf("Valor da taxa ISS: %.2f", taxa);
    System.out.println();
    System.out.printf("Valor total: %.2f", (valor + taxa));
    System.out.println();

    return (valor + taxa);

  }

}
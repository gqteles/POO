public class Main {

  public static void main(String[] args) {

    double valor1 = 100.0;
    String itemObjeto1 = "Servico";

    CalculaImpostos calculo1 = new CalculaImpostos();
    calculo1.calcularTodosImpostos(valor1, itemObjeto1);

    System.out.println("");

    double valor2 = 200.0;
    String itemObjeto2 = "Produto";

    CalculaImpostos calculo2 = new CalculaImpostos();
    calculo2.calcularTodosImpostos(valor2, itemObjeto2);

    System.out.println("");

    double valor3 = 150.0;
    String itemObjeto3 = "Servico";

    CalculaImpostos calculo3 = new CalculaImpostos();
    calculo3.calcularTodosImpostos(valor3, itemObjeto3);

    System.out.println("");

    double valor4 = 75.0;
    String itemObjeto4 = "Produto";

    CalculaImpostos calculo4 = new CalculaImpostos();
    calculo4.calcularTodosImpostos(valor4, itemObjeto4);

    System.out.println("");
    
  }

}
public class CalculaImpostos {

  public void calcularTodosImpostos(double valor, String itemObjeto) {

    Iss taxaIss = new Iss();
    valor = taxaIss.calcularIss(valor, itemObjeto);

    Ipi taxaIpi = new Ipi();
    valor = taxaIpi.calcularIpi(valor, itemObjeto);

    Icms taxaIcms = new Icms();
    valor = taxaIcms.calcularIcms(valor);

  }

}
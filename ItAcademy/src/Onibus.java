public class Onibus {
  private double precoReservas;
  private int qtdAssentos, menuRotas;

  public void menuPrincipal(){
    System.out.println("Sejam bem-vindo(a) ao sistem de reservas VIAÇÃO UNIÃO SANTA CRUZ!");
    System.out.println("");
    System.out.println("-----------> MENU <-----------");
    System.out.println("> Informe no menu abaixo, a operação desejada");
    System.out.println("");
    System.out.println("1. Reservar passagem");
    System.out.println("2. Excluir reserva");
    System.out.println("3. Sair");
    System.out.print("> ");
  }

  public void menuRotas(){
    System.out.println("----------------> Tabela de Rotas <-----------------");
    System.out.println("> Informe no menu abaixo, a rota desejada");
    System.out.println("");
    System.out.println("1. Porto Alegre - Florianópolis, 6h (R$ 19,45)");
    System.out.println("2. Porto Alegre - Florianópolis, 16h (R$ 23,50)");
    System.out.println("3. Porto Alegre - Criciúma, 6h (R$ 12,90)");
    System.out.println("4. Porto Alegre - Criciúma, 16h (R$ 15,90)");
    System.out.println("5. Criciúma - Florianópolis, 10h (R$ 7,30)");
    System.out.println("6. Criciúma - Florianópolis, 20h (R$ 10,30)"); 
    System.out.println("7. Retornar ao Menu principal"); 
    System.out.print("> ");
  }

  public void setSomaTotal(int menuRotas, int qtdAssentos){
    this.menuRotas = menuRotas;
    this.qtdAssentos = qtdAssentos;

    switch(this.menuRotas){ //Preço da passagem de cada rota: considerando 30% já reservado + reserva do usuário
      case 1:
        this.precoReservas = (19.45 * (7 + this.qtdAssentos)) + 7*12.90;
        break;
      case 2:
        this.precoReservas = (23.50 * (7 + this.qtdAssentos)) + 7*15.90;
        break;
      case 3:
      this.precoReservas = (12.90 * (7 + this.qtdAssentos)) + 7*19.45;
        break;
      case 4:
        this.precoReservas = (15.90 * (7 + this.qtdAssentos)) + 7*23.50;
        break;
      case 5:
        this.precoReservas = 7.30 * this.qtdAssentos;
        break;
      case 6:
        this.precoReservas = 10.30 * this.qtdAssentos;
        break;
    }
  }
  public double getSomaTotal(){
    return this.precoReservas;
  }

  public void estatisticas(){
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.printf("Dados estatísticos: Total de assentos: 46   |   Assentos reservados: " 
      + (14+this.qtdAssentos) + "     |   Total em reservas: R$ %.2f" , getSomaTotal());
    System.out.println();
    System.out.println("--------------------------------------------------------------------------------------------");  
  }
}

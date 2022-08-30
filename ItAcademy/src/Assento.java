import java.util.Scanner;

public class Assento {
  private Scanner scanner;

  private int menuRotas, assentoEscolhido, qtdAssentos;
  private String estadoPrint = "Disponível";
  private int[][] assentosMatriz = new int[][]{ //Matriz dos assentos do ônibus
    {1,2,4,3} , {5,6,8,7} , {9,10,12,11} , {13,14,16,15} , 
    {17,18,20,19} , {21,22,24,23}, {25,26,28,27} , {29,30,32,31} ,
    {33,34,36,35} , {37,38,40,39} , {41,42,44,43} , {45,46}
  };

  //Mapa
  public void getMapaAssentos(int menuRotas){
    this.menuRotas = menuRotas;
    
    if(this.menuRotas < 5){ //Verifica a rota, pois: Criciúma-Florianópolis não há nenhuma reserva ao iniciar

      for (int i = 0; i < assentosMatriz.length; i++) { //linhas da matriz
        if(i >= 8){  //Definindo quais assentos estão ocupados manualmente
          this.estadoPrint = "Ocupado";
        }else{
          this.estadoPrint = "Disponível";
        }
  
        for (int j = 0; j < assentosMatriz[i].length; j++) { //colunas da matriz
          System.out.print("\t\t " + assentosMatriz[i][j] + ": " + this.estadoPrint); //Apresentação do mapa
        }
        System.out.println();
      }
    }else{
      for (int i = 0; i < assentosMatriz.length; i++) { 
        for (int j = 0; j < assentosMatriz[i].length; j++) {
          System.out.print("\t\t " + assentosMatriz[i][j] + ": " + this.estadoPrint);
        }
        System.out.println();
      }
    }
  }
  public void setMapaAssentos(){}

  public void getAssentosReserva(){}
  public void setAssentoReserva(int assentoEscolhido, int menuRotas){ //Verificação para a reserva
    this.menuRotas = menuRotas;
    this.assentoEscolhido = assentoEscolhido;

    if(this.menuRotas < 5){
      if(this.assentoEscolhido < 0 || this.assentoEscolhido > 46){
        System.out.println("ERRO! Escolha um assento válido");
      }else if(this.assentoEscolhido >= this.assentosMatriz[8][0]){
        System.out.println("Assento já ocupado! Escolha novamente");
      }else{
        System.out.println("Assento reservado!");
      }
    }else{ //Para rota Criciúma-Florianópolis
      if(this.assentoEscolhido < 0 || this.assentoEscolhido > 46){
        System.out.println("ERRO! Escolha um assento válido");
      }else{
        System.out.println("Assento reservado!");
      }
    }
  }

  public void getAssentosExclusao(){}
  public void setAssentoExclusao(int assentoEscolhido, int menuRotas){ //Verificação para a exclusão
    this.menuRotas = menuRotas;
    this.assentoEscolhido = assentoEscolhido;
    
    if(this.menuRotas < 5){
      if(this.assentoEscolhido < 0 || this.assentoEscolhido > 46){
        System.out.println("ERRO! Escolha um assento válido");
      }else if(this.assentoEscolhido < this.assentosMatriz[8][0]){
        System.out.println("Assento já disponível! Escolha novamente");
      }else{
        System.out.println("Reserva excluída!");
      }
    }else{
      if(this.assentoEscolhido < 0 || this.assentoEscolhido > 46){
        System.out.println("ERRO! Escolha um assento válido");
      }else{
        System.out.println("Reserva excluída!");
      }
    }
  }

  public void verificacaoAssentosQtd(int menuRotas, int qtdAssentos){
    scanner = new Scanner(System.in);
    this.menuRotas = menuRotas;
    this.qtdAssentos = qtdAssentos;

    if(this.qtdAssentos < 0 && this.qtdAssentos > 46){
      System.out.println("ERRO! Informe uma quantidade válida");
    }else if(this.qtdAssentos > 1){
      System.out.println("Informe um por vez, os assentos que deseja reservar");
      for(int i = 0; i < this.qtdAssentos; i++){
        System.out.println("Qual assento deseja? ");
        System.out.print("> ");
        this.assentoEscolhido = scanner.nextInt();
        setAssentoReserva(this.assentoEscolhido, this.menuRotas);
      }
    }else{
      System.out.println("Qual assento deseja? ");
      System.out.print("> ");
      this.assentoEscolhido = scanner.nextInt();
      setAssentoReserva(this.assentoEscolhido, this.menuRotas);
    }
  }
}

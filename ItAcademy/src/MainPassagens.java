import java.util.Scanner;

public class MainPassagens{
  private static Scanner scanner; //Inicializando variáveis no construtor da classe
  private static Assento assento;
  private static Onibus onibus;
  private static boolean programa = true, programaRotas = true;
  private static int assentoEscolhido, qtdAssentos;

  public static void main(String[] args){
    scanner = new Scanner(System.in); //Instanciamento dos objetos
    assento = new Assento();
    onibus = new Onibus();
    
    do{ 
      onibus.menuPrincipal();
      int menu = scanner.nextInt();

      switch(menu){//Verificação de qual operação vai ser executada
        case 1:
          do{
            onibus.menuRotas();
            int menuRotas = scanner.nextInt();

            switch(menuRotas){//Verificação de qual rota selecionada
              case 1:
                //Apresentação do mapa
                System.out.println("---------> RESERVA ");
                assento.getMapaAssentos(menuRotas);
                System.out.println("-----------------------------------------------------------------------------------");

                //Reserva do assento
                System.out.println("Quantos assentos deseja reservar? ");
                System.out.print("> ");
                qtdAssentos = scanner.nextInt();

                //Verifica quantos assentos serão reservados
                assento.verificacaoAssentosQtd(menuRotas, qtdAssentos);

                //Imprime dados da rota
                onibus.setSomaTotal(menuRotas, qtdAssentos);
                assento.getMapaAssentos(menuRotas);
                onibus.estatisticas();
                break;
              case 2:
                System.out.println("---------> RESERVA ");
                assento.getMapaAssentos(menuRotas);
                System.out.println("-----------------------------------------------------------------------------------");

                System.out.println("Quantos assentos deseja reservar? ");
                System.out.print("> ");
                qtdAssentos = scanner.nextInt();

                assento.verificacaoAssentosQtd(menuRotas, qtdAssentos);

                onibus.setSomaTotal(menuRotas, qtdAssentos);
                assento.getMapaAssentos(menuRotas);
                onibus.estatisticas();
                break;
              case 3:
                System.out.println("---------> RESERVA ");
                assento.getMapaAssentos(menuRotas);
                System.out.println("-----------------------------------------------------------------------------------");

                System.out.println("Quantos assentos deseja reservar? ");
                System.out.print("> ");
                qtdAssentos = scanner.nextInt();

                assento.verificacaoAssentosQtd(menuRotas, qtdAssentos);

                onibus.setSomaTotal(menuRotas, qtdAssentos);
                assento.getMapaAssentos(menuRotas);
                onibus.estatisticas();
                break;
              case 4:
                System.out.println("---------> RESERVA ");
                assento.getMapaAssentos(menuRotas);
                System.out.println("-----------------------------------------------------------------------------------");

                System.out.println("Quantos assentos deseja reservar? ");
                System.out.print("> ");
                qtdAssentos = scanner.nextInt();

                assento.verificacaoAssentosQtd(menuRotas, qtdAssentos);

                onibus.setSomaTotal(menuRotas, qtdAssentos);
                assento.getMapaAssentos(menuRotas);
                onibus.estatisticas();
                break;
              case 5:
                System.out.println("---------> RESERVA ");
                assento.getMapaAssentos(menuRotas);
                System.out.println("-----------------------------------------------------------------------------------");

                System.out.println("Quantos assentos deseja reservar? ");
                System.out.print("> ");
                qtdAssentos = scanner.nextInt();

                assento.verificacaoAssentosQtd(menuRotas, qtdAssentos);

                onibus.setSomaTotal(menuRotas, qtdAssentos);
                assento.getMapaAssentos(menuRotas);
                onibus.estatisticas();
                break;
              case 6:
                System.out.println("---------> RESERVA ");
                assento.getMapaAssentos(menuRotas);
                System.out.println("-----------------------------------------------------------------------------------");

                System.out.println("Quantos assentos deseja reservar? ");
                System.out.print("> ");
                qtdAssentos = scanner.nextInt();

                assento.verificacaoAssentosQtd(menuRotas, qtdAssentos);

                onibus.setSomaTotal(menuRotas, qtdAssentos);
                assento.getMapaAssentos(menuRotas);
                onibus.estatisticas();
                break;
              case 7:
                programaRotas = false;
                break;
              default:
                System.out.println("ERRO! Informe uma rota válida");
                break;
            }
          }while(programaRotas);
          break;
        case 2:
          System.out.println("----------> EXCLUSÃO");
          assento.getMapaAssentos(menu);
          System.out.println("------------------------------------------------------------------------------------------");
          System.out.println("Qual reserva deseja excluir? ");
          System.out.print("> ");
          assentoEscolhido = scanner.nextInt();
          assento.setAssentoExclusao(assentoEscolhido, menu);
          break;
        case 3:
          programa = false;
          break;
        default: 
          System.out.println("ERRO! Informe uma operação válida");
          break;
      }
    }while(programa);
  }
}


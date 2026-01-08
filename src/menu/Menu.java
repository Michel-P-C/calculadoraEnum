package menu;

import enumCalc.OperationEnum;

import java.util.Scanner;

public class Menu {

    public void menuPrincipal(){
        Scanner scan = new Scanner(System.in);
        var opcao = -1;

        //opção 5 pula fora do laço.
        while (opcao != 5){
            System.out.println("Escolha sua operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            //Pega a entrada das opções e guarda na variavel opçõa.
            opcao = scan.nextInt();

            //opções invalidas
            if (opcao > 5 || opcao < 1){
                System.out.println("Digite as opção entre 1 e 5 ");
                continue;
            }

            //sair do loop
            if (opcao == 5){
                System.out.println("Saíndo do sistema... ");
                break;
            }

            // o -1 e porque o index é 0.
            var selectedOption = OperationEnum.values()[opcao -1];

            //pega os números do usuário
            System.out.println("Digite seu primeiro número: ");
            var value1 = scan.nextInt();
            System.out.println("Digite seu segundo número: ");
            var value2 = scan.nextInt();

            var result = selectedOption.getCalcular().apply(value1, value2);

            //formata o resultado cada %s é um variavel ou um símbol que é colocado de pois da "," são 4 %s
            //então 4 formatações.
            System.out.printf("%s %s %s = %s \n ", value1, selectedOption.getSymbol(), value2, result + " resposta");

            //Imprimir as opções selecionada.
            System.out.println(selectedOption);
        }
    }


}

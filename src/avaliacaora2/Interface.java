package avaliacaora2;

import java.util.Scanner;

public class Interface {
    Scanner teclado = new Scanner(System.in);
    int opcao;
    
    public void executarInterface(ArvoreBinariaMorse arvore){
        do{
            System.out.println("\nSelecione uma das opera��es abaixo:\n\n1. Traduzir c�digo morse\n2. Exibir �rvore (in-ordem)\n3. Inserir um novo caractere\n0. Sair");
            opcao = teclado.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o c�digo morse que voc� deseja que seja traduzido (com separa��o de espa�o entre as letras)");
                    // Limpa buffer do teclado
                    teclado.nextLine();
                    
                    // Realizando a leitura da entrada do usu�rio.
                    String codigo_morse = teclado.nextLine();
                    
                    // Aqui ocorre a captura de exce��o caso o usu�rio insira algum caractere diferente de "-" ou ".".
                    try{
                        System.out.println(arvore.buscar(codigo_morse));

                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }          
                    break;
                case 2:
                    arvore.exibir();
                    break;
                    
                case 3:
                    System.out.print("Digite o c�digo morse: ");
                    // Limpa buffer do teclado
                    teclado.nextLine();
                    
                    // Realizando a leitura da entrada do usu�rio.
                    String codigo_char = teclado.nextLine();
                    
                    System.out.print("\nAgora digite o caractrere que corresponde ao c�digo: ");
                    // Limpa buffer do teclado
                    // teclado.nextLine();
                    
                    char caractere = teclado.next().charAt(0);
                    
                    arvore.inserir(codigo_char, caractere);
                    
                    break;
                default:
                    System.out.println("Digite uma das op��es v�lidas!");
            }
            
        }while(opcao != 0);
    }
}

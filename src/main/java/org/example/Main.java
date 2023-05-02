package org.example;

import org.example.lista.ListaEncadeada;
import org.example.lista.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada <Integer> listaEncadeada= new ListaEncadeada<>();
        Menu menu= new Menu();
        Scanner leia= new Scanner(System.in);
        int op;
        int valor;
        boolean condicao= false;

        while (!condicao){

            String listarMenu= menu.apresentar();

            System.out.println(listarMenu);

            op= leia.nextInt();

            switch (op){
                case 1->{

                    System.out.println("Lista atual: ");
                    listaEncadeada.listarElementos();
                    System.out.println("\nTamanho da lista: "+ listaEncadeada.getTamanho());

                    System.out.println("Digite o valor desejado: ");
                    valor=leia.nextInt();
                    listaEncadeada.adicionar(valor);


                }
                case 2->{

                    System.out.println("Lista atual: ");
                    listaEncadeada.listarElementos();
                    System.out.println("\nTamanho da lista: "+ listaEncadeada.getTamanho());

                    System.out.println("Digite o valor desejado: ");
                    valor=leia.nextInt();
                    listaEncadeada.adicionarInicio(valor);


                }

                case 3->{
                    System.out.println("Lista atual: ");
                    listaEncadeada.listarElementos();
                    System.out.println("\nTamanho da lista: "+ listaEncadeada.getTamanho());

                    System.out.println("Digite o valor desejado: ");
                    valor=leia.nextInt();
                    System.out.println("Digite a posição desejada: ");
                    int posicao=leia.nextInt();
                    listaEncadeada.adicionarComPosicao(valor, posicao);
                }
                case  4->{
                    System.out.println("Lista atual: ");
                    listaEncadeada.listarElementos();
                    System.out.println("\nTamanho da lista: "+ listaEncadeada.getTamanho());

                    System.out.println("Digite o valor desejado: ");
                    valor=leia.nextInt();
                    Integer resultado=listaEncadeada.getPosElemento(valor);
                    System.out.println("posição: "+resultado);
                }
                case 5->{
                    listaEncadeada.listarElementos();
                }case 6 ->{
                    System.out.println("Digite o valor desejado: ");
                    valor=leia.nextInt();
                    listaEncadeada.adicionar(valor-1);
                    boolean resultado= listaEncadeada.contem(valor);
                    System.out.println("Contem: "+resultado);
                }
                case 7 ->{
                    System.out.println("Digite a posição desejada: ");
                    int posicao=leia.nextInt();

                    listaEncadeada.remover(posicao);

                }
                case 8->{
                    listaEncadeada.limpar();
                }
                case 0 ->{
                    listaEncadeada.listarElementos();
                    condicao=true;
                }


                default -> {

                }
            }
        }



    }
}
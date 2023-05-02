package org.example.lista;

import java.util.Comparator;

abstract class Lista <T> implements Comparator<T> {

  public abstract void adicionar(T elemento); //1

  public abstract void adicionarInicio(T elemento) ;//2

  public abstract void adicionarComPosicao(T elemento, int posicao);//3


  public abstract T get(int posicao)  throws Exception;


  public abstract Integer getPosElemento(T elemento);//4


  public abstract void remover(int posicao) throws Exception;//5


  public abstract void limpar();//6

  public abstract int getTamanho();

  public abstract boolean contem(T elemento);//7

  public abstract void  listarElementos();//8



 @Override
 public int compare(T o1, T o2) {


  return 0;
 }
}

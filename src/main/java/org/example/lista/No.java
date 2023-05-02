package org.example.lista;

public class No <T> {

    private T elemento;
    private No <T> proximo;

    public No(T novoValor){
        this.elemento = novoValor;
    }

    public T getElemento() {
        return elemento;
    }


    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}

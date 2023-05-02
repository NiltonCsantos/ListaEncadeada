package org.example.lista;

public class ListaEncadeada<T extends Comparable<T>> extends Lista<T>  {

    private  No <T> primeiro;
    private No <T> ultimo;
    private int tamanho;

    public  ListaEncadeada (){
        this.tamanho=0;
    }
    public No<T> getPrimeiro() {
        return primeiro;
    }
    public No<T> getUltimo() {
        return ultimo;
    }
    @Override
    public void adicionar(T elemento){

            No<T> novoElemento= new No<>(elemento);

            if(this.primeiro==null && this.ultimo==null){

                this.primeiro=novoElemento;
                this.ultimo=novoElemento;
            }
            else{

                this.ultimo.setProximo(novoElemento);
                this.ultimo=novoElemento;
            }

            this.tamanho++;
    }
    @Override
    public void adicionarInicio(T elemento){

        No <T> novoElemento= new No<>(elemento);

        novoElemento.setProximo(this.primeiro);

        this.primeiro=novoElemento;

        this.tamanho++;

    }
    @Override
    public void adicionarComPosicao(T elemento, int posicao) {

        No <T> novoElemento= new No<>(elemento);
        No<T> atual=this.primeiro;
        No<T> anterior=null;

        if (posicao==1){
            anterior=atual;
            atual=atual.getProximo();

           anterior.setProximo(novoElemento);
           novoElemento.setProximo(atual);
        }else {

            for (int i = 0; i <posicao ; i++) {
                atual=atual.getProximo();

                if (i==posicao-2){
                    anterior=atual;
                }
            }

            anterior.setProximo(novoElemento);
            novoElemento.setProximo(atual);

        }

        tamanho++;
    }
    @Override
    public T get(int posicao) {
        return null;
    }

    @Override
    public void listarElementos() {

       No<T> atual= this.primeiro;

        for (int i = 0; i<= this.tamanho; i++) {

            if (atual!=null){

                if (atual.getProximo()!=null){
                    System.out.print(atual.getElemento()+"\t");
                    atual= atual.getProximo();
                }else if(i==this.tamanho){
                    System.out.println(atual.getElemento());
                }

            }else{
                System.out.println(atual);
            }
        }
    }
    @Override
    public Integer getPosElemento(T elemento){

        No<T> atual= this.primeiro;

        Integer count=null;

        for (int i = 0; i <this.tamanho ; i++) {

            if (elemento.equals(atual.getElemento())){

                  count=i;
                  return count;

            }

            atual=atual.getProximo();

        }

        return count;
    }
    @Override
    public void remover(int posicao){

        No<T> atual=this.primeiro;
        No<T> anterior= null;

        if(posicao==0 && this.tamanho==1){
            this.primeiro=null;
            this.ultimo=null;

            this.tamanho--;

        } else if (posicao==0 && tamanho>1) {

            this.primeiro=atual.getProximo();
            tamanho--;
            
        }else if (posicao>0 && tamanho>1){

            for (int i = 0; i <posicao ; i++) {
                atual=atual.getProximo();

                if (i== posicao-2){
                    anterior=atual;
                }
            }

            anterior.setProximo(atual.getProximo());
            tamanho--;

        }
    }
    @Override
    public void limpar() {

        this.primeiro=null;
        this.ultimo=null;
        this.tamanho=0;

    }
    @Override
    public int getTamanho() {
        return tamanho;
    }
    @Override
    public boolean contem(T elemento) {

        No<T> atual = this.primeiro;

        for (int i = 0; i < this.tamanho; i++) {

            if (elemento.equals(atual.getElemento())) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;

    }

}

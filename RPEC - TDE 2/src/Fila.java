public class Fila {
    private int primeiro;
    private int MAX;
    private int ultimo;
    private int dado[];
    private int tamanho;


    public Fila(int n){

        this.MAX = n;
        this.primeiro = -1;
        this.ultimo = -1;
        this.dado = new int[n];
        this.tamanho = 0;

    }

    public void inserir(int inserido){
        if (!verificacheio()){
            if (this.tamanho != this.MAX && this.ultimo != this.MAX){
                if (this.primeiro == -1){
                    this.primeiro = this.primeiro + 1;
                }
                if (this.ultimo == this.MAX-1){
                    this.ultimo = -1;
                }
                this.ultimo = this.ultimo +1;
                this.dado[this.ultimo] = inserido;
                this.tamanho = this.tamanho + 1;
                System.out.println("Valor Inserido");
            }else {
                if (primeiro != 0 && tamanho != this.MAX){
                    this.tamanho = this.tamanho + 1;
                    this.ultimo = 0;
                    this.dado[this.primeiro] = inserido;
                    System.out.println("Valor Inserido");
                }
            }
        }else {
            System.out.println("Fila Cheia");
        }
    }

    public boolean verificacheio(){
        if(this.tamanho != this.MAX){
            return false;
        }else{
            return true;
        }
    }

    public boolean verificavazio(){
        if (this.tamanho == 0){
            return true;
        }else {
            return false;
        }
    }

    public void imprimir(){
        int p = this.primeiro;
        int u = this.ultimo + 1;
        if(u == this.MAX){
            u = 0;
        }
        if (p != u){
            for (int i = p; i != u; i++){
                System.out.println(this.dado[i]);
                if (i == this.tamanho){
                    i = -1;
                }
            }
        }else {
            for (int o = p; o != this.MAX; o++){
                System.out.println(this.dado[o]);
                if (this.tamanho - 1 == o){
                    for (int b = 0; b != u; b++) {
                        System.out.println(this.dado[b]);
                    }
                }
            }
        }
    }

    public int infirst(){
        return this.primeiro;
    }

    public int first(){
        return data()[infirst()];
    }

    public int inlast(){
        return this.ultimo;
    }

    public int last(){
        return data()[inlast()];
    }

    public int size(){
        return this.tamanho;
    }
    public int sizeMAX(){
        return this.MAX;
    }

    public void pop(){
        if (!verificavazio()){
            System.out.println(this.dado[this.primeiro]);
            this.dado[this.primeiro] = 0;
            if (this.primeiro == MAX -1){
                this.primeiro = 0;
            }else {
                this.primeiro = this.primeiro + 1;
            }
            this.tamanho = this.tamanho - 1;
            System.out.println("Item removido");
        }else {
            System.out.println("Fila vazia");
        }
    }

    public int[] data(){
        return this.dado;
    }

}

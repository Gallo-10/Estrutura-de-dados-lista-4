public class Pilha {

    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();

           Atleta atleta1=new Atleta("Gabriel",1.77f,70.7f,"Capoeira","Swift");
           Atleta atleta2=new Atleta("Gafa",1.80f,54.8f,"Ciclismo","Guarana");
           

           lista.insere(new No(atleta1));
           lista.insere(new No(atleta2));
           
           lista.imprime();
           
           lista.remove();
           
           System.out.println("");
           System.out.println("Pilha apos remocao:");
           
           lista.imprime();
    }
    }

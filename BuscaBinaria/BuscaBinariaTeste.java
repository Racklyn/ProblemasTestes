

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuscaBinariaTeste {
    
    @Test
    public void numeroExistenteInicio(){
        BuscaBinaria busca = new BuscaBinaria();
        int [] array = {3,9,10,31,56,99,102};
        int chave = 3;

        assertEquals(0, busca.busca(array,chave));
    }

    @Test
    public void numeroExistenteFinal(){
        BuscaBinaria busca = new BuscaBinaria();
        int [] array = {20,21,30,40,50,60};
        int chave = 60;

        assertEquals(5, busca.busca(array,chave));
    }

    @Test
    public void numeroExistenteMeio(){
        BuscaBinaria busca = new BuscaBinaria();
        int [] array = {2,4,16,32,64,128,256,512,1024};
        int chave = 64;

        assertEquals(4, busca.busca(array,chave));
    }

    @Test
    public void numeroInexistente(){
        BuscaBinaria busca = new BuscaBinaria();
        int [] array = {12,13,14,15};
        int chave = 17;

        assertEquals(-1, busca.busca(array,chave));
    }

    @Test
    public void arrayComNegativos(){
        BuscaBinaria busca = new BuscaBinaria();
        int [] array = {-14,-13,-8,-7,-5,-2,-1};
        int chave = -8;

        assertEquals(2, busca.busca(array,chave));
    }

    @Test
    public void arrayVazia(){
        BuscaBinaria busca = new BuscaBinaria();
        int [] array = {};
        int chave = 53;

        assertEquals(-1, busca.busca(array,chave));
    }
}

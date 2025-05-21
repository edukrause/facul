import java.util.Arrays;
import java.util.Random;

public class PesquisaBinaria {
    public static int[] gerar(int leng, int size) {
        int[] lista = new int[leng];

        Random rnd = new Random();

        for (int i = 0; i < leng; i++) {
            lista[i] = rnd.nextInt(size);
        }
        return lista;
    }

    public static int[] ordenar(int[] pLista) {
        Arrays.sort(pLista);
        return pLista;
    }

    public static boolean pesquisar(int[] pLista, int pValor) {
        boolean vEncontrou = false;
        int qntOperacoes = 0;
        int nPosMeio, nPosIni, nPosFim;

        nPosMeio = pLista.length / 2;

        if (pLista[nPosMeio] < pValor){
            nPosIni = 0;
            nPosFim = nPosMeio - 1;
        } else if (pLista[nPosMeio] > pValor) {
            nPosIni = nPosMeio + 1;
            nPosFim = pLista.length - 1;
        }else {
            return true;
        }

        while (nPosIni < nPosFim) {
            nPosMeio = (nPosFim + nPosIni) / 2;
            if (pLista[nPosMeio] > pValor) {
                nPosFim = nPosMeio - 1;
            } else if (pLista[nPosMeio] > pValor) {
                nPosIni = nPosMeio + 1;
            } else {
                return true;
            }
        }

        System.out.println("operacoes: " + qntOperacoes);
        return vEncontrou;
    }

}

public class TabuadaMultiplicacao implements Tabuada{
    public void mostrarTabuada(int numero){
        for(int i = 1;i <= 10; i++){
            int tabuada = i * numero;
            System.out.println(tabuada);
        }

    }
}

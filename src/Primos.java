public class Primos {
    int cantidad;
    int[] primos;

    public Primos(int cantidad){
        this.cantidad = cantidad;
    }
    public void IdePrimos(){
        primos = new int [cantidad];
        int i = 1;
        int limite = 0;
        while(cantidad != limite){
            int cont = 0;
                for (int j=1; j<=i; j++){
                    if (i % j == 0){
                        cont ++;
                    }
                }
                if (cont == 2){
                    primos [limite] = i;
                    limite++;
                }
            i++;
        }
    }
    public void mostrarArreglo(){
        System.out.println("Numeros primos");
        for (int n : primos){
            System.out.print(n + ", ");
        }
    }
}

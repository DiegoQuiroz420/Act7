public class Fibonacci{
    int cantidad = 0;
    int[] arregloCantidad;

    public Fibonacci(int cantidad){
        this.cantidad = cantidad;
    }
    public void llenar(){
        arregloCantidad = new int[cantidad];
        int cont = 0;
        arregloCantidad[0] = 0;
        arregloCantidad[1] = 1;

        for (int i = 2;i<cantidad; i++){
            arregloCantidad[i] = arregloCantidad[i-2] + arregloCantidad[i-1];
        }
        System.out.println(cont);
    }
    public void mostrarArreglo(){
        System.out.println("Sucesión Fibonacci");

        for (int n : arregloCantidad){
            System.out.print(n + ", ");
        }
    }
}
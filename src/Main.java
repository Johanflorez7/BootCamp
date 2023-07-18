public class Main {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 15;

        int resultado = sumarTresNumeros(numero1, numero2, numero3);
        System.out.println("La suma de los tres números es: " + resultado);
        Coche miCoche = new Coche();
        miCoche.IncrementarPuerta();
        System.out.println("El numero de puertas del coche es "+miCoche.puertas);

    }

    public static int sumarTresNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        return suma;
    }
}

class Coche{
    public int puertas =5;

    public void IncrementarPuerta(){
        this.puertas++;
    }
}
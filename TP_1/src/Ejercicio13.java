//numero capicúa
public class Ejercicio13 {
    static public void main (String []args){
        System.out.println("Ingrese cantidad de cifras: ");
        Scanner consola = new Scanner(System.in);
        int cifras = consola.nextInt();

        int [] vector1 = new int[cifras]; //declaro el vector con el tamaño de cifras

        System.out.println("Ingrese las numeros de a uno: ");
        for (int i=0; i<cifras; i++){
            System.out.print("numero: ");
            vector1[i] = consola.nextInt();
        }

        for (int i=0; i<cifras;i++){
            System.out.print(vector1[i] +"");
        }
        System.out.println();

        int [] vector2 = new int [cifras];
        for(int i=0; i<cifras; i++){
            vector2[i] = vector1[cifras-1-i];
        }

        if(Arrays.equals(vector1,vector2)){ //comparo los 2 vectores
            System.out.println("El numero ingresado es capicúa");
        }else {
            System.out.println("El numero ingresado NO es capicúa");
        }

        consola.close();
    }
}

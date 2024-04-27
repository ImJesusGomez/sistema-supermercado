import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // Importamos la clase scanner para ingresar datos del usuario
        Scanner s = new Scanner(System.in);

        // 1. Declarar Variables
        String[] productos = new String[100];
        double[] precios = new double[100];
        int[] cantidadPorProducto = new int[100];
        double total = 0;
        double descuento = 0.10;
        int cantidadProductoAComprar;

        //Le damos la bienvenida la usuario
        System.out.println("------ Bienvenido al SuperMercado Online JG ------");

        //Preguntamos cuantos producto desea comprar
        System.out.println("¿Cuántos productos desea comprar?");
        cantidadProductoAComprar = s.nextInt();


        // Usamos un ciclo for para agregar los datos a cada arreglo
        for (int i = 0; i < cantidadProductoAComprar; i++){
            System.out.println("PRODUCTO " + (i + 1));
            System.out.println("Nombre del producto: ");
            productos[i] = teclado.readLine();
            System.out.println("Precio del producto: ");
            precios[i] = s.nextDouble();
            System.out.println("Cantidad: ");
            cantidadPorProducto[i] = s.nextInt();
            total = total + (precios[i] * cantidadPorProducto[i]);
        }

        // Aplicamos el descuento al total si es mayor a $100
        if(total > 100){
            total = total - (total * 0.10);
        } else {
            total = total;
        }

        // Le mostramos el ticket al usuario de sus compras
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                  TICKET                                 ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("NOMBRE DE PRODUCTO              PRECIO          CANTIDAD            TOTAL");
        for(int i = 0; i < cantidadProductoAComprar; i++){
            System.out.println(productos[i] + "                      $" + precios[i] + "             " + cantidadPorProducto[i] + "                 $" + (precios[i] * cantidadPorProducto[i]));
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("TOTAL: $" + total);






    }
}
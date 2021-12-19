import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        /*Una cola de clientes que va a comprar helado está esperando que la heladería abra sus
        puertas. Cada cliente va a comprar solamente un helado que vale $5.
        La heladería tiene una política de aceptar solamente billetes de las siguientes
        denominaciones: $5, $10 y $20.

        El saldo de la caja de la heladería al iniciar las ventas es de $0.
        Con base en la información descrita anteriormente, se debe elaborar un programa que evalúe
        si es posible devolver el cambio a cada uno de los clientes en la cola cuando aplique. Al ser una
        cola, se debe atender a los clientes siguiendo el esquema FIFO.

        Parámetros de Entrada:
        a. Pagos: Listado de enteros que representa el valor del billete con el que realizará el
        pago cada cliente.

        Salida:
        Indicador S o N para determinar si es posible devolver cambio a todos los clientes.
        Ejemplos:
         [5,5,5,10,20] -&gt; Retorna S
         [5,5,10] -&gt; Retorna S
         [10,10] -&gt; Retorna N*/

        Scanner ingreso = new Scanner (System.in);
        //while(b==1){
            System.out.println();
            System.out.println("Por favor ingrese número de pagos de los clientes:");
            int n = ingreso.nextInt();

            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int d = 0;
            int b = 0;
            //String re= "";
            int pagos[] = new int[n];
            int cambios[] = new int[n];

            System.out.println();
            System.out.println("Por favor ingrese valores de los pagos en caja:");
            ingreso.nextLine();
            String data = ingreso.nextLine();
            String[] datos = data.split(",");

            for(int i=0;i < n;i++){
                pagos[i] = Integer.parseInt(datos[i]);
            }

            for(int i=0;i < n;i++){
                if (pagos[i] != 5 && pagos[i] != 10 && pagos[i] != 20){
                    b = 1;
                    System.out.println();
                    System.out.println("Solo se aceptan billetes de 5, 10 y 20");
                    /*
                    System.out.println("¿Desea repetir proceso? (si/no)");
                    re = ingreso.nextLine();
                    if (re == "si"){
                        break;
                    }*/

                }
                if (pagos[i] == 5 ){
                    cambios[i]=0;
                    n1 +=1;
                }
                if (pagos[i] == 10 ){
                    cambios[i]=5;
                    n2 += 1;
                }
                if (pagos[i] == 20 ){
                    cambios[i]=15;
                    n3 +=1;
                }
//                System.out.print(pagos[i]+",");
            }

            if (b ==0 ){
                for(int i=0;i < n;i++){
                    if (cambios[i]==15){
                        if (n1!=0 && n2 !=0){
                            n1= n1 -1;
                            n2= n2-1;
                            d=1;}
                    }else if(cambios[i]==5){
                        if (n1!=0){n1=n1-1;
                            d=1;}
                    }
                    //System.out.print("a"+n1+" "+n2+" "+n3);
                }
                if (d==1){System.out.println();
                    System.out.println("Retorna S");}
                else{System.out.println();
                     System.out.println("Retorna N");}
            }else {System.out.println("***fin del programa***");}

        ingreso.close();
    }
}

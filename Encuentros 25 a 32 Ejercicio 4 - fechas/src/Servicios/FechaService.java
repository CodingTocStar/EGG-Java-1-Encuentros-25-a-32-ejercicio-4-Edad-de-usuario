/*





 */
package Servicios;

//imports
import java.util.Date;
import java.util.Scanner;
//--------------------------------

public class FechaService {

    Scanner lector = new Scanner(System.in);

    /*a) Método fechaNacimiento 
    que pregunte al usuario día, mes y año de su nacimiento. 
    Luego los pase por parámetro a un nuevo objeto Date.
    El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     */
    public Date fechaNacimiento() {

        System.out.println("Cual es su fecha de nacimiento?");

        System.out.print("Ingrese dia: ");
        int dia = lector.nextInt();

        System.out.println("Ingrese mes:");
        int mes = lector.nextInt();

        System.out.println("Ingrese año");
        int anio = lector.nextInt();

        return new Date(anio, mes, dia);
    }

//    b) Método fechaActual 
//    que cree un objeto fecha con el día actual. 
//    Para esto usaremos el constructor vacío de la clase Date.
//    Ejemplo: Date fechaActual = new Date();
//    El método debe retornar el objeto Date.
    public Date fechaActual() {
        return new Date();
    }

//    c) Método diferencia que reciba las dos fechas por parámetro y retorna
//    la diferencia de años entre una y otra (edad del usuario).
    public int edadUsuario(Date fechaNacimiento, Date fechaActual) {

        /*System.out.println("La fecha actual es:" + fechaActual.getYear()); //cuenta desde 1900
        System.out.println("Su fecha de nacimiento es " + fechaNacimiento.getYear());*/
        
        if ((fechaActual.getMonth() < fechaNacimiento.getMonth())
                || ((fechaActual.getMonth() == fechaNacimiento.getMonth()) && (fechaActual.getDay() < fechaNacimiento.getDay()))) {

            return fechaActual.getYear() - fechaNacimiento.getYear() + 1899; //le pongo 1899 para restar el año directamente

        } else {
            return fechaActual.getYear() - fechaNacimiento.getYear() + 1900;
        }
    }

}

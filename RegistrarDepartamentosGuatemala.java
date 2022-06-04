
package registrardepartamentosguatemala;

import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class RegistrarDepartamentosGuatemala {

    public static void main(String[] args) {
               Scanner sc= new Scanner(System.in);
         DepartamentoArray registroDepartamentos= new DepartamentoArray();//Los registros de los vectores.
         DepartamentosListas registroListasDepartamentos = new DepartamentosListas();
 
         
        int opcion =0;
          
         do{
             
              System.out.println("***Bienvenido al programa de registro de departamentos***");
              System.out.println("Seleccione la opcion de registro que desee utilizar: ");
              System.out.println("1. Registro de datos con arrays"); 
              System.out.println("2. Registro de datos con listas"); 
              System.out.println("0. Salir");

              System.out.println("Ingrese la opcion que desea usar: ");
                  opcion =sc.nextInt();
                  
              switch(opcion){
                 
                 case 1:
                     
                     int opcionA = 0;
                     
                     do{
                                              
                       System.out.println("***Bienvenido usuario seleccione la opcion a realizar: ***");
                       System.out.println("1. Mostrar los departamentos registrados.");
                       System.out.println("2. Buscar departamento por nombre y posicion."); 
                       System.out.println("3. Buscar departamento por la inicial del nombre."); 
                       System.out.println("4. Mostrar los departamentos por posiciones pares");
                       System.out.println("5. Agregar registros");
                       System.out.println("0. Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionA =sc.nextInt();
                     
 
              switch(opcionA){

                case 1:
                    //REGISTRO DE ARRAYS, MOSTRAR LOS DEPARTAMENTOS GUARDADOS.
                     registroDepartamentos.mostrarDatos();
                     
	          break;
                  
                case 2:
                   //REGISTRO DE ARRAYS

	          break;

                   case 3:
                   //REGISTRO DE ARRAYS
                     
	          break;
                   case 4:
                   //REGISTRO DE ARRAYS
                     
	          break;
                  
                   case 5:
                    String nombreA="";
                     String cabeceraA="";
                     int numeroB=0;
                     int numeroOrden=0;
                     
                    //PIDO LOS REGISTROS DE LOS DEPARTAMENTOS A LOS USUARIOS.
                   registroDepartamentos.datosDepartamento(numeroOrden,nombreA, numeroB, cabeceraA);
      
                   break;
  
                case 0:
                     
	          break;
                }
              
             }while(opcionA!=0);
   
             break;
             
                case 2:
    
                     int opcionAB = 0;
                     
                     do{
                         //SI ELIGE LA OPCION DE LISTA.
                       System.out.println("***Bienvenido usuario seleccione la opcion a realizar: ***");
                       System.out.println("1. Mostrar todos los departamentos registrados.");
                       System.out.println("2. Verificar registro de un departamento.");
                       System.out.println("3. Vaciar el registro de la lista.");
                       System.out.println("4. Agregar registros.");
                       System.out.println("0. Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionAB =sc.nextInt();
                     
 
              switch(opcionAB){

                case 1:
                    //LLAMAR LISTAS.
                       registroListasDepartamentos.lista();
                     
	          break;
                  
                  case 2:
                   //LLAMAR LISTAS
                      
	          break;

                   case 3:
                   //LLAMAR LISTAS VACIAS
                       registroListasDepartamentos.eliminarListas();
	          break;
                   
                   case 4:
                   //LLAMAR LISTAS
                     String nombreA="";
                     String departamentoA="";
                     int cantidadMunicipios=0;
                     int numeroOrden=0;
                     
                    registroListasDepartamentos.listaDepartamento(numeroOrden, nombreA, departamentoA, cantidadMunicipios);
	          
                    break;
                  
   
                case 0:
                     
	          break;
                }
              
             }while(opcionAB!=0);
   
             break;
                     
                 
                case 3:
                  //NOS MUESTRA EL REGISTRO DE DATOS DE LOS ARRAYS

                 break;
                 
                case 4:
                    //NOS MUESTRA EL REGISTRO DE DATOS EN LISTAS.
                         
                     
                 break;
                
                 
                case 0:
                              
                 break;
                 
              }
         
         }while(opcion!=0);        
    
         System.out.println("El programa a finalizado");
    }
}
    


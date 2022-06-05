//CHRISTIAN ALDANA 0909-21-697
package registrardepartamentosguatemala;

import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class RegistrarDepartamentosGuatemala {

    public static void main(String[] args) {
         
        //DECLARACION DE LOS OBJETOS
        Scanner sc= new Scanner(System.in);
         DepartamentoArray registroDepartamentos= new DepartamentoArray();//Los registros de los vectores.
         DepartamentosListas registroListasDepartamentos = new DepartamentosListas();
 
         //OPCION PARA LOS SWITCH
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
                             //TRABAJAR CON ARRAYS                 
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
                   //REGISTRO DE ARRAYS, MOSTRAR DEPARTAMENTO POR NOMBRE Y POSICION.
                  
                  registroDepartamentos.mostrarDatosDepartamento();

	          break;

                   case 3:
                   //REGISTRO DE ARRAYS, MOSTRAR DEPARTAMENTO POR LA INICIAL DE UN DPTO.
                registroDepartamentos.inicialNombre();
  
                       
	          break;
                   case 4:
                   //REGISTRO DE ARRAYS, MOSTRAR LOS DEPARTAMENTOS POR PARES.
                registroDepartamentos.posicionPar();
	          break;
                  
                   case 5:
                    
                    //PIDO LOS REGISTROS DE LOS DEPARTAMENTOS A LOS USUARIOS.
                   registroDepartamentos.datosDepartamento();
      
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
                    //LLAMAR LISTAS -U MOSTRAR LISTAS.
                       registroListasDepartamentos.lista();
                     
	          break;
                  
                  case 2:
                   //LLAMAR LISTAS, VERIFICAR UN REGISTRO DE UN DEPARTAMENTO.
                      registroListasDepartamentos.verificarDepartamento();
	          break;

                   case 3:
                   //LLAMAR LISTAS VACIAS
                       registroListasDepartamentos.eliminarListas();
	          break;
                   
                   case 4:
                   //LLAMAR LISTAS
                     
                     
                    registroListasDepartamentos.listaDepartamento();
	          
                    break;
                  
   
                case 0:
                     
	          break;
                }
              
             }while(opcionAB!=0);
   
             break;

              }
         
         }while(opcion!=0);        
    
         System.out.println("El programa a finalizado");
    }
}
//CHRISTIAN ALDANA 0909-21-697

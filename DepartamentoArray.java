//CHRISTIAN ALDANA 0909-21-697

package registrardepartamentosguatemala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cristhian
 */
public class DepartamentoArray {
    
    //Variables de los primeros vectores.
     String nombreCA = "";
     float codigoG,codigoAA,numeroBAcodigoCA;
     String nombreB = "";
     String nombreA = "";
     String descripcionAA ="";
     int datosAlumnosB, datoCursoB;
     int codigoA, numeroB,codigoC,CodigoG,numeroOrden;
     String cabeceraA;
     
     //VARIABLES DE LOS VECTORES.
     String [] registroDatos;
     String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     int [] municipiosDatos;
     private String[] registrarDatos;
     int i= 0;
     
      Scanner sc= new Scanner(System.in);
     
    //constructor
     public DepartamentoArray(){
        this.nombreA="";
        this.nombreB="";
        this.codigoA=0;
        this.numeroB=0;
        this.codigoC=0;
        this.CodigoG=0;
        this.numeroOrden=0;
        this.cabeceraA="";
        municipiosDatos = new int[100];
        registroDatos = new String[6];
         vectorDatos = new String [100];
         this.indiceVector= 0;  
         
         //SE INICIALIZA EL VECTOR, ORDEN A SEGUIR PARA LOS DATOS DE LOS ARRAYS.
         
     }
    
     //PIDO LOS REGISTROS DE LOS DEPARTAMENTOS A LOS USUARIOS.
    public void datosDepartamento (){
                        // PIDE LOS DATOS DE LOS DEPARTAMENTOS.
                       
                        System.out.println("***Ingrese el nombre del departamento: ***");
                          nombreA=sc.next();
                          
                        System.out.println("***Ingrese la cantidad de municipios: ***");
                         numeroB= sc.nextInt();
                            
                        System.out.println("***Ingrese la cabecera del departamento: ***");
                         cabeceraA = sc.next();
                         
              //REGRISTRAR LOS DATOS DE LOS DATOS INGRESADOS EN LOS VECTORES EN ORDEN.           
            this.registrarDatos2("Datos: ","","Nombre del Departamento: ","",nombreA);
            this.registrarDatos("Datos: ","","Cantidad Municipios: ","",numeroB);
            this.registrarDatos5("Datos: ","","Cabecera: ","",cabeceraA);
            registroDatos[i]= nombreA;     
            municipiosDatos [i]= numeroB;
            
     }
    public void registrarDatos(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
   
   public void registrarDatos2(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
    public void registrarDatos4(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
   
   public void registrarDatos5(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
   public void mostrarDatos(){ //MUESTRA LOS DATOS DE LOS REGISTROS DE LOS DEPART.
          try{   
              System.out.println(vectorDatos.length);
            for (int i=1; i<vectorDatos.length;i++){
                if(vectorDatos[i]!=null){
                    System.out.println(vectorDatos[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }
            // SE ALMACENA LOS DATOS.
       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }
   
        //MOSTRAR DEPARTAMENTO POR NOMBRE Y POSICION.
     public void mostrarDatosDepartamento(){
         
         int llamarPosicion = -1;
       System.out.println("Ingresar el departamento a buscar");
        String buscar = sc.nextLine();
        
        for (int i=0;i<registroDatos.length; i++){
            if (registroDatos[i] == null ? (buscar) == null : registroDatos[i].equals(buscar)){
                llamarPosicion =i;
            }
        }
       if  (llamarPosicion==-1){ System.out.println("Lamentamos informar que este departamento no esta registrado");
     } else{ System.out.println("Este departamento esta registrado en la posicion:" +llamarPosicion);}
   }
     
     
     
     
    //MOSTRAR DEPARTAMENTO POR LA INICIAL DE UN DPTO.
     public void inicialNombre () {
                
      Scanner inicial= new Scanner(System.in);

      System.out.println("Ingresar letra del departamento");
             String inicialNombre = inicial.next();
             
          for (int i=0;i<registroDatos.length; i++){
         if (registroDatos[i] == null ? (inicialNombre) == null : registroDatos[i].contains(inicialNombre)){     
                 
     System.out.println("El departamento que se encontro con esa inicial es"+registroDatos[i]);
     } else{ System.out.println("No se encontro un departamento");}
   }
	}

   
   
   //MOSTRAR LOS DEPARTAMENTOS POR PARES.
   public void posicionPar () {
   
       for (int i=0; i<10; i++)
       {
           if (i%2==0)//PAR
               if(municipiosDatos[i]>4){
                   System.out.println(municipiosDatos[i]);
               }
       }
       
   }

 }

//CHRISTIAN ALDANA 0909-21-697.

	






    


    
                           




       




       


       

       
       
             




package registrardepartamentosguatemala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
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
     String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     private String[] registrarDatos;
     String i="";
     
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
         vectorDatos = new String [100];
         this.indiceVector= 0;  
         
         //SE INICIALIZA EL VECTOR.
         this.registrarDatos4(i, i, i, i, numeroOrden);
         this.registrarDatos2(i, i, i, i, nombreA);
         this.registrarDatos(i, i, i, i, numeroB);
         this.registrarDatos5(i, i, i, i, cabeceraA);

     }
     
    public void datosDepartamento (){
                        
                         System.out.println("***Ingrese numero posicion: ***");
                          numeroOrden=sc.nextInt();
                          
                        System.out.println("***Ingrese el nombre del departamento: ***");
                          nombreA=sc.next();
                          
                        System.out.println("***Ingrese la cantidad de municipios: ***");
                         numeroB= sc.nextInt();
                            
                        System.out.println("***Ingrese la cabecera del departamento: ***");
                         cabeceraA = sc.next();
                         
              //REGRISTRAR LOS DATOS DE LOS DATOS INGRESADOS EN LOS VECTORES EN ORDEN.           
             this.registrarDatos4("Datos: ","","Numero de posicion: ","",numeroOrden);            
            this.registrarDatos2("Datos: ","","Nombre del Departamento: ","",nombreA);
            this.registrarDatos("Datos: ","","Cantidad Municipios: ","",numeroB);
            this.registrarDatos5("Datos: ","","Cabecera: ","",cabeceraA);

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
   public void mostrarDatos(){
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

       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }
   
 
     public void mostrarDatosDepartamento(){
       System.out.println("Ingresar el departamento a buscar");
        nombreA=sc.next();
        
        System.out.println("El departento "+ nombreA +" esta ubicado en:"+numeroOrden);
  
   }
   
     
     
     public void mostrarDatosDepartament(){
     System.out.println("Ingresar el departamento a buscar");
         String nombreDep =sc.next();
       this.nombreA=nombreDep;
       System.out.println("El departento "+ nombreDep +" esta ubicado en:" + indiceVector);
   }
   
   public void inicialNombre () {
                
      Scanner inicial= new Scanner(System.in);

      System.out.println("Ingresar letra del departamento");
             String inicialNombre = inicial.next();
             
         String registroDatos2 = "";
                
                
		String busqueda = registroDatos2;
		int indice = nombreA.indexOf(busqueda);
		if (indice != -1) {

                    System.out.println("La búsqueda con la letra "+inicialNombre+ "se encuentran los departamentos de:" +nombreA );
		} else {
			System.out.println("El elemento no existe");
		}
	}

   
   
   
   public void posicionPar () {
       
   }
}

	






    


    
                           




       




       


       

       
       
             



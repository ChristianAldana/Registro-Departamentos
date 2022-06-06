//CHRISTIAN ALDANA 0909-21-697

package registrardepartamentosguatemala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class departamentosListas {

     List<departamentosListas> listDepartamentos = new ArrayList<departamentosListas>();//DECLARACION DEL OBJETO DE LA LISTA.
     List<String> verificarListas = new ArrayList<String>();//DECLARACION DEL OBJETO DE LA LISTA.

     Scanner sc= new Scanner(System.in);

    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA,verLista;
    int verLista2;
        
     //VARAIBLES DE LOS CONSTRUCTORES.
     String verNombreA,verNombreB,addAlumnosB,numeroAB;
     String nombreA,aleasA,correoA;
     int numeroOrden,codigoA,codigoC,codigoG,cantidadMunicipios;
     String nombreC,descripcionA,departamentoA;
    
    public departamentosListas() {
        
    }

    public departamentosListas(String nombreA,String departamentoA, int cantidadMunicipios) {
       
        this.nombreA = nombreA;
        this.departamentoA = departamentoA;
        this.cantidadMunicipios = cantidadMunicipios;
       
    }

    
    //METODO EN EL CUAL PIDO LOS DATOS PARA REGISTRAR.
    public void listaDepartamento(){
  
                        System.out.println("***Ingrese el nombre del departamento: ***");
                         nombreA= sc.next();
                         
                        System.out.println("***Ingrese la cabecera: ***");
                         departamentoA = sc.next();
                
                        System.out.println("***Ingrese cuantos municipios tiene el departamento: ***");
                         cantidadMunicipios = sc.nextInt();
           //GUARDO LOS DATOS EN UNA LISTA.
            listDepartamentos.add(new departamentosListas(nombreA,departamentoA,cantidadMunicipios));
            verificarListas.add(new String (nombreA));
    }
    
    public void lista(){

        //AQUI SE MUESTRA TODA LA LISTA DE LAS TABLAS DE LAS LISTAS.
        System.out.println("***Lista Alumnos***");
        System.out.println("");
        
        for (int i=0; i<listDepartamentos.size(); i++) {
            System.out.println("El Nombre del Departamento: " + listDepartamentos.get(i).getNombreA());
            System.out.println("La Cabecera es: " +  listDepartamentos.get(i).getDepartamentoA());
            System.out.println("La cantidad de municipios es: " + listDepartamentos.get(i).getcantidadMunicipios());
        }
        
    }   //ELIMINO LOS DATOS DE LAS LISTAS.
     public void eliminarListas(){
         listDepartamentos.clear();
     }
     
     public void verificarDepartamento (){
		//METODO PARA VERIFICAR SI EXISTE EL DPTO.
                
                
          System.out.println("Ingrese el departamento que desee verificar.");
         String verificarNumero = sc.nextLine();
          
         boolean registro = verificarListas.contains(verificarNumero); //VERIFICAR LISTA 
         if (verificarNumero.equals(registro)){
     } else 
 
     if (registro == true){
            System.out.println("El departamento si esta registrado");
} else
    System.out.println("El departamento no esta registrado");
}
     
     
     public String getNombreA() {
        return nombreA;
    }

    public void setNombreC(String nombreA) {
        this.nombreA = nombreA;
    }
    
    public String getDepartamentoA() {
        return departamentoA;
    }

    public void setdepartamentoA(String DepartamentoA) {
        this.departamentoA = departamentoA;
    }

    public int getcantidadMunicipios() {
        return cantidadMunicipios;
    }

    public void setcantidadMunicipios(int cantidadMunicipios) {
        this.cantidadMunicipios = cantidadMunicipios;
    }

   public int getnumeroOrden() {
        return numeroOrden;
    }

    public void setnumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
    
     
     
}


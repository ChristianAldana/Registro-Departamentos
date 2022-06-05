
package registrardepartamentosguatemala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class DepartamentosListas {

     List<DepartamentosListas> listDepartamentos = new ArrayList<DepartamentosListas>();//DECLARACION DEL OBJETO DE LA LISTA.
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
    
    public DepartamentosListas() {
        
    }

    public DepartamentosListas(int numeroOrden,String nombreA,String departamentoA, int cantidadMunicipios) {
       
        this.numeroOrden = numeroOrden;
        this.nombreA = nombreA;
        this.departamentoA = departamentoA;
        this.cantidadMunicipios = cantidadMunicipios;
       
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
    
    
    public void listaDepartamento(int numeroOrden,String nombreA, String departamentoA, int cantidadMunicipios){
                        
                        System.out.println("***Ingrese numero posicion: ***");
                          numeroOrden=sc.nextInt();
                          
                        System.out.println("***Ingrese el nombre del departamento: ***");
                         nombreA= sc.next();
                         
                        System.out.println("***Ingrese la cabecera: ***");
                         departamentoA = sc.next();
                
                        System.out.println("***Ingrese cuantos municipios tiene el departamento: ***");
                         cantidadMunicipios = sc.nextInt();
           
        listDepartamentos.add(new DepartamentosListas(numeroOrden,nombreA,departamentoA, cantidadMunicipios));
    }
    
    public void lista(){

        //AQUI SE MUESTRA TODA LA LISTA DE LAS TABLAS DE LAS LISTAS.
        System.out.println("***Lista Alumnos***");
        System.out.println("");
        
        for (int i=0; i<listDepartamentos.size(); i++) {
            System.out.println("El numero de posicion es: " + listDepartamentos.get(i).getnumeroOrden());    
            System.out.println("El Nombre del Departamento: " + listDepartamentos.get(i).getNombreA());
            System.out.println("La Cabecera es: " +  listDepartamentos.get(i).getDepartamentoA());
            System.out.println("La cantidad de municipios es: " + listDepartamentos.get(i).getcantidadMunicipios());
        }
    }
     public void eliminarListas(){
         listDepartamentos.clear();
     }
     
     public void verificarDepartamento (){
		
          Scanner teclado = new Scanner (System.in);
          String valor = "";
          int indice;
          
          System.out.println("Verificar registro de un departamento.");
          valor = teclado.next();
          indice = listDepartamentos.indexOf(valor);
          if (indice != 0){
                      System.out.println("Este registro si esta registrado");
          }else {
              System.out.println("Este registro del departamento no se encuentra");

          }    
     
 }
}


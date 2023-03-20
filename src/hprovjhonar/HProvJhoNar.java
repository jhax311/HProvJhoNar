package hprovjhonar;
import java.util.*;
//import java.

public class HProvJhoNar {

    //insertar
  public static void insertar(Integer ipos, String iprov,HashMap<Integer, String> ilista ){ 
      String digitos=String.valueOf(ipos);
    //comproabr si tiene x digitos
     if (digitos.matches("\\d{4,5}")) {
         //comprobar si existe
         if (!ilista.containsKey(ipos)){
                System.out.println("Se ha insertado "+ipos+" "+iprov);
                //meter el valor
                ilista.put(ipos,iprov);  
         } else {
                 System.out.println("Ya hay una provincia asociada a "+ipos);
         }
      
    }else{
         System.out.println("El número de digitos debe estar entre 4 y 5 ");
     }
  
  }
  //Modificar
   public static void modificar(Integer mPos, String mProv,HashMap<Integer, String> mlista ){ 

         if (mlista.containsKey(mPos)){              
                System.out.println("Se ha modificado "+mPos+" a "+mProv);
                //modificar
                mlista.put(mPos, mProv);
         } else {
                 System.out.println("No hay una provincia asociada a "+mPos);
         }
       
   }

    public static void borrar(Integer bPos,HashMap<Integer, String> blista ){ 
        
         if (blista.containsKey(bPos)){              
                System.out.println("Se ha borrado la provincia con codigo "+bPos );
                blista.remove(bPos);
                 System.out.print(blista);  
         } else {
                 System.out.println("No hay una provincia asociada a "+bPos);
         }        
       
       
   }  
     public static void valor(Integer cPos,HashMap<Integer, String> vlista ){ 
         if (vlista.containsKey(cPos)){              
                System.out.println("La provincia asociada a "+cPos+" es "+vlista.get(cPos) );
                       // System.out.println(vlista.get(cPos));
         } else {
                 System.out.println("No hay una provincia asociada a "+cPos);
         }      
   }
     
     public static void clave(String vProv, HashMap<Integer, String> clista ){ 
         if (clista.containsValue(vProv)){              
              //  System.out.println(vProv+" existe" );
            for (int clave  : clista.keySet()) {
                    if (vProv.equals(clista.get(clave))) {
                        System.out.println("La clave de la provincia "+vProv+" es: "+clave);
                    }
                }                
                
         } else {
               System.out.println("No hay una provincia asociada a "+vProv);
          }             
         }
       
     public static void mostrar(HashMap<Integer, String> mmlista ){ 
        //si el tamaño es mayor que 0
         if (mmlista.size()>0){              
                System.out.print(mmlista);              
         } else {
                  System.out.println("No hay parametros insertados");
         }             
         }       
      
    
    public static void main(String[] args) {
        boolean salir= false; String prov;int codPostal;
               //hashMap
        HashMap<Integer, String> provincias = new HashMap<Integer, String>();
        Scanner sc=new Scanner (System.in);
        do
        {	
                //menu
                System.out.println("-----------------------------------------");
                System.out.println("\t\t1\tInsertar");
                System.out.println("\t\t2\tModificar");
                System.out.println("\t\t3\tBorrar");
                System.out.println("\t\t4\tObtener Valor");
                System.out.println("\t\t5\tObtener clave");  
                System.out.println("\t\t6\tListar elementos");   
                System.out.println("\t\t7\tsalir");                
                System.out.println("-----------------------------------------");
                System.out.print("ELIGE UNA OPCIÓN: ");
                byte opc=sc.nextByte();
                //elegir opción
                switch (opc)
                {
                        case 1:
                                 //inserta el codigo
                                System.out.print("Inserte el código postal: ");
                                codPostal=sc.nextInt();
                                sc.nextLine(); //vaciar el bufer
                                //inserta la provincia
                                System.out.print("Inserte el nombre de la provincia: ");
                                prov=sc.nextLine();
                                insertar(codPostal,prov,provincias);
                                System.out.println();
                                break;
                        case 2:
                                //Para modificar
                                System.out.print("Inserte el código postal de la provincia a cambiar: ");
                                codPostal=sc.nextInt();
                                sc.nextLine(); //vaciar el bufe
                                System.out.print("Inserte el nuevo nombre de la provincia: ");
                                prov=sc.nextLine();
                                modificar(codPostal,prov,provincias);
                                System.out.println();
                                break;
                         case 3:
                                System.out.print("Inserte el código postal de la provincia a borrar: ");
                                codPostal=sc.nextInt();    
                                 borrar(codPostal,provincias);
                                 System.out.println();
                                 sc.nextLine();
                                break;  
                         case 4:
                                 System.out.print("Inserte el código postal para conocer su provincia: ");
                                 codPostal=sc.nextInt();  
                                 valor(codPostal,provincias);
                                 System.out.println();
                                 sc.nextLine();
                                break;    
                        case 5:
                                 sc.nextLine();
                                 System.out.print("Inserte la provincia para saber su código: ");
                                 prov=sc.nextLine();  
                                 clave(prov,provincias);  
                                 System.out.println();
                                 
                                break;  
                         case 6:
                                 
                                mostrar(provincias);
                                System.out.println();
                                break;                               
                        case 7:
                                 //Salidaa
                                 salir=true;
                                break;

                        default:
                                System.out.println("Introduce una opción correcta: ");
                                //ingrese una opcion correcta
                }

        } while (!salir);
   
        
    //FINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnNNN
    }

}

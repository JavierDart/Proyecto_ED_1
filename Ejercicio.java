/*
 Program to initialize an array of 10 x 3 so that the first element of each row
contains a number, the second element contains the square and the third element
contains the cube. Begins with one and ends with 10. For example, 
the first rows would be as follows:
1, 1, 1,
2, 4, 8,
3, 9, 27,
...
After that, asks the user a cube, look that value in the table, and report what 
is the root of the cube and the square root.

 */
package u6_sheet6;

import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Ejer_10 {
    public static Scanner stdin = new Scanner(System.in);
    public static void crearArray(){
        int [][]m=new int [10][3];
        for(int i=0; i<m.length; i++){
            for(int j=0;j<m[i].length; j++) {
               if(j==0){
                   m[i][j]=1;
               }
               else if(j==1){
                   m[i][j]=(int)Math.pow(i,2);
                }
               else if(j==2){
                   m[i][j]=(int)Math.pow(i,3);
                }
               else if(j==3){
                   m[i][j]=(int)Math.pow(i,4);
                }
               else if(j==4){
                   m[i][j]=(int)Math.pow(i,5);
                }
               else if(j==5){
                   m[i][j]=(int)Math.pow(i,6);
                }
               else if(j==6){
                   m[i][j]=(int)Math.pow(i,7);
                }
               else if(j==7){
                   m[i][j]=(int)Math.pow(i,8);
                }
               else if(j==8){
                   m[i][j]=(int)Math.pow(i,9);
                }
               else if(j==9){
                   m[i][j]=(int)Math.pow(i,10);
                }
               
                
                
            }
        }
    }
    public static void mostrarArray(){
       int [][]m=new int [10][3];
            for(int i=0; i<m.length; i++){
                for(int j=0;j<m[i].length; j++) {
                     System.out.print(m[i][j]+" ");
                } System.out.println();
            }
       }
    public static void buscarCubo(int c, int[][]m){
        
        
        int cubo=0;
        for(int i=0; i<m.length; i++){
            if (m[i][2]==c){
                System.out.println("Raiz: "+m[i][0]+" cuadrado raiz: "+m[i][1]);
            }
            
           /* if(m[][2] == c){
                cubo= m[i][0];
                /*System.out.println("Raiz: "+cubo+" ,Raiz: "+m[i][1]);
            
            if(c==0){
                System.out.println("no es el cubo");
            }
            else{
                System.out.println("el cubo es :"+cubo);
            }*/
        }
}

     
   
    public static void main(String[] args) {
        int [][]m=new int [10][3];
       
        System.out.println("introduce el cubo a buscar: ");
        int c=stdin.nextInt();
        crearArray();
        buscarCubo(c,m);
        mostrarArray();
        
        
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ewerton1
 */
public class Main {
    
    public static void main(String[] args)throws IOException{
        int xl=0,yl=0;
                
    
        try {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inform the top-right position of the plateau in the format x y");
        xl = sc.nextInt(); 
        yl = sc.nextInt(); 
        //sc.close();
        }catch (Exception e) {
        e.printStackTrace();
        }
        

        
        String st = "";
        MarsRover mr = null;
        while(!(st.equals("E") || st.equals("e"))){
        int xr =0;
        int yr =0;
        char dr = ' ';
        
        //String st2 = "";
        try {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inform the position and direction of the rover in the format (x, y, d) or E for exit");
        st = bf1.readLine();
        }
        catch (IOException exception) {
        exception.printStackTrace();
        }

        
        Scanner sc2 = new Scanner(st).useDelimiter("\\s*");;
        try {
        xr = sc2.nextInt(); 
        yr = sc2.nextInt();
        dr = sc2.next().charAt(0);
        //System.out.println(dr);
        if(xr<0 || xr>xl || yr<0 || yr>yl){
            System.out.println("Invalid location!");
            continue;
        }
        mr  = new MarsRover(xr, yr, dr);
        }catch (java.util.InputMismatchException e) {
        //System.out.println("Invalid location or direction!");
        continue;
        }
        
        String st3 = "";
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Inform the command sequence to the rover (L or R or M)");
        st3 = sc4.nextLine();
        for(int i=0;i<st3.length();i++){
            char c = st3.charAt(i);
        if(mr.rover(c)==false)break;
        if(xr<0 || xr>xl || yr<0 || yr>yl){
            System.out.println("The rover fell from the plain");
            break;
        }
        }
       
      
       }  
        System.out.println(""+mr.getX()+" "+mr.getY()+" "+ mr.getDir());
    }
    
}

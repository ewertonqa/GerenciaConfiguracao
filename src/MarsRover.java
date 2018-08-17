
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
public class MarsRover {
    
    public int x,y;
    public char dir;


    public MarsRover(int x, int y, char dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDir() {
        return dir;
    }
    
    public boolean rover(char input){
        boolean res = true;
        
        switch(input){
            case 'L':
                if(dir == 'N')dir='W';
                else if(dir == 'W')dir='S';
                else if(dir == 'S')dir='E';
                else if(dir == 'E')dir='N';
                else res= false;
                return res;
            case 'R':
                if(dir == 'N')dir='E';
                else if(dir == 'E')dir='S';
                else if(dir == 'S')dir='W';
                else if(dir == 'W')dir='N';
                else res= false;
                return res;
            case 'M':
                if(dir == 'N')y++;
                else if(dir == 'W')x--;
                else if(dir == 'S')y--;
                else if(dir == 'E')x++;
                else res= false;
                return res;
            default: 
                System.out.println("Comando inválido!");
                res= false;
                return res;
        }
    }
    public String toString(){
        return x+" "+y+ " "+dir;
    }
    
    
    
    
}

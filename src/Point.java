/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alph
 */
public class Point {
    float x;
    float y;
    public void afficherCoordonnees(){
        System.out.println("abscisse" + x);
        System.out.println("ordonnees" + y);
      }
    public static void main(String[] args ){
        Point P= new Point();
        P.x=2;
        P.y=3;
        P.afficherCoordonnees();
    }
    public float get X (){
        return X;
       }
    public float get Y(){
        return Y;
        
    }
    
  }

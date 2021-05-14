/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_1;

/**
 *
 * @author Wanda
 */
public class Calculadora_1 {
       private String marca;
       public Calculadora_1(String valMarca)
       {
          marca=valMarca;
}
       public int sumar (int num1,int num2){
       int res;
       res=num1+num2;
       return res;
       }
       public int restar (int num1,int num2){
       int res;
       res=num1-num2;
       return res;
       }
        public int multi (int num1,int num2){
       int res;
       res=num1*num2;
       return res;
       }
       public int div (int num1,int num2){
       int res;
       res=num1/num2;
       return res;
       } 
       
}

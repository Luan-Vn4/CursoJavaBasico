/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorafatorialpoo;

/**
 *
 * @author Notebook
 */
public class Fatorial {
    
    private int fat = 0;
    private String formula = "";
    
    public void setValor(int n){
        int f = 1;
        String s = "";
        
        
        for (int c=n; c>= 1; c--){
            f *= c;
            if (c != 1){
                s += c + " x ";
            }else{
                s += c;
            }
        }
    fat = f;
    formula = s;
  
    }
    
   public int getFatorial() {
        return fat;
   }
   
   public String getFormula() {
       return formula;
   }
    
}

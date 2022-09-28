/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaspila2;
import java.util.ArrayList;
/**
 *
 * @author julis
 */
public class PracticasPila2 {
    
    private ArrayList<Object> PracticasPila2 = new ArrayList();
    public void push(Object o){
        PracticasPila2.add(o); //agregamos el valora la pila
        //GREGA VALORES A LA PILA
        }
    public Object pop(){
        //MOSTRAR EL ULTIMO VALOR Y LO ELIMINA
        if(!(PracticasPila2.isEmpty())){
            Object o = PracticasPila2.get(PracticasPila2.size()-1);
            PracticasPila2.remove(PracticasPila2.size()-1);
            return o;
        }else{
            return null;
        }
        }
    public Object peek(){
         //MOSTRAR EL ULTIMO VALOR  
         if(PracticasPila2.isEmpty()){
             return PracticasPila2.get(PracticasPila2.size()-1);
         }else{
             return null;
         }
        }
    public Boolean empty(){
        //LA PILA ESTA LLENA
        return PracticasPila2.isEmpty();
            
        }
    public static void main(String[] args) {
        
       PracticasPila2 pila = new PracticasPila2();
       
       pila.push(15);
       pila.push(10);
       pila.push(5);
       pila.push(8);
       pila.push(20);
       pila.push(30);
       pila.push(50);
       pila.push(2);
       pila.pop();
       pila.push(30);
       System.out.println("El ultimo valor de pila es: " + pila.pop());
       pila.pop();
       pila.push(40);
       System.out.println("El ultimo valor de pila es: " + pila.pop());
       pila.pop();
       pila.pop();
       pila.pop();
       System.out.println("El ultimo valor de pila es: " + pila.pop());
       
    }
    
}

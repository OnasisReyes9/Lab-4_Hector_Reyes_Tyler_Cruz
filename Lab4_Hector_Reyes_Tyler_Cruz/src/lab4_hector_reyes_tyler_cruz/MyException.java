/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_hector_reyes_tyler_cruz;

/**
 *
 * @author Tyler C
 */
public class MyException extends Exception{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MyException{" + '}';
    }
    
    
}

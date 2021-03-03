/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleTestTwo;

/**
 *
 * @author komolbekibragimov
 */
public class SimpleCalculatorServer {
    
    public boolean isServerConnected() {
        
        System.out.println("[SERVER] connection is being tested");
        return true;
    }
    
    public  int addTwoInt(int  a, int b) {
        System.err.println("[SERVER] adding " + a + " and " + b);
        return a + b;
    }
}

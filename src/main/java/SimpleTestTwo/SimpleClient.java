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
public class SimpleClient {
    
    SimpleCalculatorServer server = new SimpleCalculatorServer();
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleClient client = new SimpleClient();
        client.executeTest();
    }
    
    private void executeTest() {
        
        System.out.println("[CLIENT] testing is server connected");
        if (server.isServerConnected()) {
            System.out.println("[CLIENT] server is connected");
        } else {
            System.out.println("[CLIENT] server is not connected");
        }
    }
}

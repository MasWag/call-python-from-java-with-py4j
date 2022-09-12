package py4j.examples;

import py4j.ClientServer;
import py4j.GatewayServer;

public class CallPythonFromJava {
    public static void main(String[] args) {
        ClientServer clientServer = new ClientServer(null);
        Animal animal = (Animal) clientServer.getPythonServerEntryPoint(new Class[] {Animal.class});
        System.out.println(animal.hello());
        clientServer.shutdown();
    }
}

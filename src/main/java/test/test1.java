package test;

import java.io.IOException;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.ClientResource;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

//import org.*;
public class test1 extends ServerResource {
    public static void main(String[] args) throws Exception {
        new Server(Protocol.HTTP, 8182, test1.class).start();
//        new ClientResource("http://www.bcfc.co.uk").get().write(System.out);
    }

    @Get
    public String toString() {
        return "hello, world";
    }
}

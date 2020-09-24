package test;

import java.io.IOException;

import org.restlet.Context;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.ClientResource;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.routing.Router;
import test.resources.HealthCheckServerResource;

//import org.*;
public class test1 extends ServerResource {
    public static void main(String[] args) throws Exception {
        Router router = new Router(Context.getCurrent());
        router.attach("/healthcheck", HealthCheckServerResource.class);
        new Server(Protocol.HTTP, 8182, HealthCheckServerResource.class).start();
//        new ClientResource("http://www.bcfc.co.uk").get().write(System.out);
    }

    @Get
    public String toString() {
        return "hello, world";
    }
}

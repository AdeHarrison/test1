package test.resources;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import test.annotations.Route;

//@Route(to = "/healthcheck", using = Route.BaseRouter.ROOT)
public class HealthCheckServerResource extends ServerResource {

    @Get("txt")
    public String checkHealth() {
        return "OK";
    }
}


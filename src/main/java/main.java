
import com.sun.jersey.api.core.HttpRequestContext;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.io.File;
import java.io.FileReader;
import java.net.URI;

@Path("getInformation")
public class main {



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public File getMessage(@QueryParam("nomplage") String name) {


        ClassLoader classLoader = getClass().getClassLoader();
        File fichier = new File(classLoader.getResource(name+".json").getFile());

        return fichier;

    }
}
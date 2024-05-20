package foo;

import java.util.Arrays;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

import org.apache.commons.fileupload.FileUploadException;

@Path("/hello")
public class Service {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public List<String> get(@Context HttpServletRequest request) throws FileUploadException {
        return Arrays.asList();
    }

}

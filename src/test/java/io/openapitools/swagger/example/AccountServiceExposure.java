package io.openapitools.swagger.example;

import io.openapitools.swagger.example.model.AccountUpdateRepresentation;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Request;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

/**
 * Exposing account as REST service.
 */
@Path("/accounts")
public class AccountServiceExposure {

    @GET
    @Produces({"application/hal+json"})
    public Response list(@Context UriInfo uriInfo, @Context Request request) {
        return Response.ok().build();
    }

    @GET
    @Path("{regNo}-{accountNo}")
    @Produces({"application/hal+json"})
    @Operation(description = "Get single account",
            responses = {@ApiResponse(responseCode = "404", description = "No account found.")})
    public Response get(@PathParam("regNo") @Pattern(regexp = "^[0-9]{4}$") String regNo,
                        @PathParam("accountNo") @Pattern(regexp = "^[0-9]+$") String accountNo,
                        @Context UriInfo uriInfo, @Context Request request) {
        return Response.ok().build();
    }

    @GET
    @Path("{regNo}-{accountNo}")
    @Produces({"application/hal+json;v=1"})
    @Hidden
    public Response getV1() {
        return null;
    }

    @PUT
    @Path("{regNo}-{accountNo}")
    @Produces({"application/hal+json"})
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(description = "Create new or update existing account",
            responses = @ApiResponse(responseCode = "404", description = "No updating possible"))
    public Response createOrUpdate(@PathParam("regNo") @Pattern(regexp = "^[0-9]{4}$") String regNo,
                                   @PathParam("accountNo") @Pattern(regexp = "^[0-9]+$") String accountNo,
                                   @Valid AccountUpdateRepresentation account,
                                   @Context UriInfo uriInfo, @Context Request request) {
        return Response.ok().build();
    }

}

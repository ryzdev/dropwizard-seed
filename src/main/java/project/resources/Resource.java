package project.resources;

import com.codahale.metrics.annotation.Timed;
import project.repositories.DBRepository;
import project.repositories.SearchResult;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/app")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
    private final String envAccount;
    private final DBRepository repository;

    public Resource(String envAccount) {
        this.envAccount = envAccount;
        repository = new DBRepository();
    }

    @GET
    @Path("{account}")
    @Timed
    public Representation search(@PathParam("account") String account, @QueryParam("search") String searchTerm) {
        if(!account.equals(envAccount)) {
            throw new BadRequestException();
        }
        SearchResult searchResult = repository.searchFor(searchTerm);
        return new Representation(searchResult);
    }
}

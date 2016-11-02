package ru.activity.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.activity.model.RestStream;
import ru.activity.repository.RestStateRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/streams")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StreamServiceImpl implements StreamService<RestStream> {

    @Autowired
    private RestStateRepository stateRepository;

    @POST
    @Override
    public long create(RestStream stream) {
        return stateRepository.save(stream).getId();
    }

    @PUT
    @Override
    public void update(RestStream stream) {
        stateRepository.save(stream);
    }

    @Path("{id}")
    @GET
    @Override
    public RestStream find(@PathParam("id") long id) {
        return stateRepository.findOne(id);
    }

    @GET
    @Override
    public List<RestStream> findAll() {
        return stateRepository.findAll();
    }
}

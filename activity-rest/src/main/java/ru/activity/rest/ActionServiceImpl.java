package ru.activity.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.activity.model.ActionFilter;
import ru.activity.model.RestAction;
import ru.activity.repository.RestActionRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/actions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionServiceImpl implements ActionService<RestAction> {

    @Autowired
    private RestActionRepository actionRepository;

    @POST
    @Override
    public long create(RestAction action) {
        return actionRepository.save(action).getId();
    }

    @PUT
    @Override
    public void update(RestAction action) {
        actionRepository.save(action);
    }

    @Path("{id}")
    @GET
    @Override
    public RestAction find(@PathParam("id") long id) {
        return actionRepository.findOne(id);
    }

    @GET
    @Override
    public List<RestAction> findAll(ActionFilter filter) {
        return actionRepository.findAll();
    }
}

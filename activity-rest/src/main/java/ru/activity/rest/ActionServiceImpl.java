package ru.activity.rest;

import org.springframework.stereotype.Component;
import ru.activity.model.Action;
import ru.activity.model.ActionFilter;
import ru.activity.model.ActionState;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Path("/actions")
@Produces(MediaType.APPLICATION_JSON)
public class ActionServiceImpl implements ActionService {

    @POST
    @Override
    public long create(Action action) {
        return 0;
    }

    @PUT
    @Override
    public void update(Action action) {


    }

    @Path("{id}")
    @GET
    @Override
    public Action find(@PathParam("id") long id) {
        return new Action();
    }

    @GET
    @Override
    public List<Action> findAll(ActionFilter filter) {
        return new ArrayList<>(Collections.singletonList(new Action()));
    }

    @Override
    public void setState(ActionState newState) {

    }
}

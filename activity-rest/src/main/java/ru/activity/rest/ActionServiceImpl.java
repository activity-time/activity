package ru.activity.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import ru.activity.model.Action;
import ru.activity.model.ActionFilter;
import ru.activity.model.ActionState;
import ru.activity.repository.ActionRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Path("/actions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionServiceImpl implements ActionService {

    @Autowired
    private ActionRepository actionRepository;

    @POST
    @Override
    public long create(Action action) {
        return actionRepository.save(action).getId();
    }

    @PUT
    @Override
    public void update(Action action) {
        actionRepository.save(action);
    }

    @Path("{id}")
    @GET
    @Override
    public Action find(@PathParam("id") long id) {
        return actionRepository.findOne(id);
    }

    @GET
    @Override
    public List<Action> findAll(ActionFilter filter) {
        return new ArrayList<>(Collections.singletonList(new Action()));
    }
}

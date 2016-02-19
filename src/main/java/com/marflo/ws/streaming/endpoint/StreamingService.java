package com.marflo.ws.streaming.endpoint;

import com.codahale.metrics.annotation.Timed;
import com.marflo.ws.streaming.dto.IdCounter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/streaming-service")
@Produces(MediaType.APPLICATION_JSON)
public class StreamingService {

    @GET
    @Timed
    public List<IdCounter> getAllCounters() {

        return null;
    }

    @GET
    @Path("{id}")
    @Timed
    public IdCounter getCounter(@PathParam("id") String id) {

        return null;
    }
}

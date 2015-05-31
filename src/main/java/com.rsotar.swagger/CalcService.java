package com.rsotar.swagger;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Service//spring anotation to maping with the spring context
@Path("/calc")//Jax-rs invoque this interface
public interface CalcService {

    @GET
    @Path("/add/{addNum1}-{addNum2}")
    public int addOperation (@PathParam("addNum1")int addNum1, @PathParam("addNum2") int addNum2);

    @GET
    @Path("/sub/{addNum1}-{addNum2}")
    public int subOperation (@PathParam("subNum1")int subNum1, @PathParam("subNum2") int subNum2);



}

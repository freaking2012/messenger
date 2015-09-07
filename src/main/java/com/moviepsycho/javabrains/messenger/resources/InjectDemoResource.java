package com.moviepsycho.javabrains.messenger.resources;



import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	@GET
	@Path("/annotations")
	public String getParasUsingAnnotations(@MatrixParam("param") String matrixParam,
											@HeaderParam("header") String headerValue											
											)
	{
		return "Matrix: "+matrixParam + " header: " + headerValue;
	}
	
	@GET
	@Path("/context")
	public static String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders header)
	{
		String path = uriInfo.getAbsolutePath().toString();
		return "Path: "+path;
	}
	
	
}

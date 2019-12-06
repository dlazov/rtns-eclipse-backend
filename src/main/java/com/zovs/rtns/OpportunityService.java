package com.zovs.rtns;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.zovs.rtns.enties.Opportunity;

@Consumes("application/json")
@Produces("application/json")
@Path("/opportunityservice")
public interface OpportunityService {
	
	@Path("/opportunities")
	@GET
	List<Opportunity> getOpportunities();
	
	@Path("opportunity/{id}")
	@GET
	Opportunity getOpportunity(int id);
	
	@Path("opportunity")
	@POST
	Response createOpportunity(Opportunity opportunity);
	
	@Path("opportunity")
	@PUT
	Response updateOpportunity(Opportunity opportunity);
	
	@Path("opportunity/{id}")
	@DELETE
	Response deleteOpportunity(int id);

}

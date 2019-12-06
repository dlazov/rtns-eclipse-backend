package com.zovs.rtns;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.zovs.rtns.enties.Opportunity;
import com.zovs.rtns.repository.OpportunityRepository;

public class OpportunityServiceImpl implements OpportunityService {

	@Autowired
	OpportunityRepository repository;
	
	@Override
	public List<Opportunity> getOpportunities() {
		return repository.findAll();
	}

	@Override
	public Opportunity getOpportunity(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createOpportunity(Opportunity opportunity) {
		Opportunity savedOpportunity = repository.save(opportunity);
		return Response.ok(savedOpportunity).build();
	}

	@Override
	public Response updateOpportunity(Opportunity opportunity) {
		Opportunity savedOpportunity = repository.save(opportunity);
		return Response.ok(savedOpportunity).build();
	}

	// TODO: DGL Come back and revisit this it does not seem right yet.
	@Override
	public Response deleteOpportunity(int id) {
		Map<Long, Opportunity> opportunities = new HashMap<>();
		Opportunity opportunity = opportunities.get(id);
		
		Response response;
		
		if (opportunity != null) {
			opportunities.remove(id);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

}

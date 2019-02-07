package gov.dot.its.jpo.sdcsdw.restfragment.services;

import java.util.List;

import gov.dot.its.jpo.sdcsdw.Models.AdvisorySituationData;
import gov.dot.its.jpo.sdcsdw.restfragment.model.Query;
import gov.dot.its.jpo.sdcsdw.websocketsfragment.mongo.InvalidQueryException;

public interface QueryService {

	//Set defaults
	public void setDefaults(Query query);
	
	//Validate query
	public void validateQuery(Query query) throws InvalidQueryException;
	
	//Execute the query
	public List<String> forwardQuery(Query query);
}

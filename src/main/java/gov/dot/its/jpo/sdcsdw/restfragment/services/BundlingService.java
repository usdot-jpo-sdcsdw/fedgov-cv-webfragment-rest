package gov.dot.its.jpo.sdcsdw.restfragment.services;

import java.util.List;

import gov.dot.its.jpo.sdcsdw.Models.AdvisorySituationBundle;
import gov.dot.its.jpo.sdcsdw.Models.AdvisorySituationData;
import gov.dot.its.jpo.sdcsdw.Models.AdvisorySituationDataDistribution;
import gov.dot.its.jpo.sdcsdw.restfragment.model.Query;

public interface BundlingService {
	public AdvisorySituationBundle bundle(List<AdvisorySituationData> asd, Query query);
	public AdvisorySituationDataDistribution distribution(List<AdvisorySituationData> asd, Query query);
}

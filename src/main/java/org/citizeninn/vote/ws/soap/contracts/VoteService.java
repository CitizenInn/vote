package org.citizeninn.vote.ws.soap.contracts;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface VoteService {
	
	@WebMethod
	int createQuestion(String name);

}

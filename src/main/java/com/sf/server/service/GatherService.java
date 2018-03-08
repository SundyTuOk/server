package com.sf.server.service;

import org.springframework.stereotype.Service;

import com.sf.server.bean.Gather;
import com.sf.server.dao.GatherDAO;

@Service("gatherService")
public class GatherService {
	
//	@Resource(name="gatherDAO")
	private GatherDAO gatherDAO;
	
//	@Autowired  
     //指定Bean限定标识符 
	public GatherService(/*@Qualifier("gatherDAO")*/GatherDAO gatherDAO){
		this.gatherDAO = gatherDAO;
	}
	
	public Gather findGather(int gatherID){
		return this.gatherDAO.findGather(gatherID);
	}
}

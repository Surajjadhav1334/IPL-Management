package com.ipl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipl.dao.Matchdao;
import com.ipl.model.Match;

@Component
public class MatchService {
	
	@Autowired
	Matchdao matchdao;
	
	public String addmatch(Match match)
	{
		String addmatch = matchdao.addmatch(match);
		return addmatch;
	}
	
	public List<Match> allmatches()
	{
		return matchdao.allmatches();		
	}
	
	public Match matchbyid(int id) {
		
		return matchdao.matchbyid(id);
	}
	

	public String updatematch(int id, Match match) {
		// TODO Auto-generated method stub
		 return matchdao.updatematch(id, match);
	}

	public String deletematch(int id)
	{
		return matchdao.deletematch(id);
		
	}

	

}

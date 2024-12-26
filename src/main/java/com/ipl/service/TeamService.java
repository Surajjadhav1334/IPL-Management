package com.ipl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipl.dao.Teamdao;
import com.ipl.model.Team;

@Service
public class TeamService {

	@Autowired
	private Teamdao teamdao;

	public String addteam(Team team) {
		String msg = teamdao.addteam(team);

		return msg;

	}
	
	public List<Team> allteam()
	{
		List<Team> msg = teamdao.allteam();
		return msg;
		
	}
	
	public Team teambyid(int id)
	{
		Team teambyid = teamdao.teambyid(id);
		return teambyid;
	}
	
	public void updatebyid(int id, Team update)
	{
		 teamdao.updatebyid(id, update);
	}
	
	public void deleteteambyid(int id)
	{
		teamdao.deleteteambyid(id);
	}
	
	public String deleteteam(int id)
	{
		String deleteteam = teamdao.deleteteam(id);
		return deleteteam;
		
	}
	
	public String updateteam(int id, Team team)
	{
		String msg = teamdao.updateteam(id, team);
		return msg;
	}

}

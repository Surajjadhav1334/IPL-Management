package com.ipl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipl.dao.Playerdao;
import com.ipl.model.Player;

@Component
public class PlayerService {
	
	@Autowired
	Playerdao playerdao;
	
	public String addplayer(Player player)
	{
		String msg = playerdao.addplayer(player);
		return msg;
	}
	
	public List<Player> getallplayers()
	{
		List<Player> getall = playerdao.getallplayers();
		
		return getall;
		
	}
	
	public Player getplayerbyid(int id)
	{
		return  playerdao.getplayerbyid(id);
		
		
	}
	
	public String updateplayers(int id, Player player)
	{
		
		return playerdao.updateplayers(id, player);
		
	}
	
	public String deleteplayer(int id)
	{
		return playerdao.deleteplayer(id);
		
	}

}

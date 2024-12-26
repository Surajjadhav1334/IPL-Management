package com.ipl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.model.Player;
import com.ipl.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerservice;
	
	@PostMapping("api/players")
	public String addplayer(@RequestBody Player player)
	{
		String msg = playerservice.addplayer(player);
		System.out.println(player);
		return msg;
	}
	
	@GetMapping("api/players")
	public List<Player> getallplayers()
	{
		List<Player> all = playerservice.getallplayers();
		return all;
	}
	
	@GetMapping("api/players/{id}")
	public Object getplayerbyid(@PathVariable("id") int id)
	{
		Player getplayerbyid = playerservice.getplayerbyid(id);
		if (getplayerbyid != null) {
			return getplayerbyid;
		}
		else
		{
			return "not found";
		}
		
	}
	
	@PutMapping("api/players/{id}")
	public String updateplayers(@PathVariable int id, @RequestBody Player player)
	{
		
		return playerservice.updateplayers(id, player);
		
	}
	
	@DeleteMapping("api/players/{id}")
	public String deleteplayer(@PathVariable int id)
	{
		return playerservice.deleteplayer(id);
		
	}

}

package com.ipl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ipl.model.Player;

@Repository
public class Playerdao {
	
	List<Player> plist = new ArrayList<Player>();
	
	public Playerdao() {
		// TODO Auto-generated constructor stub
		plist.add(new Player(1, "Rohit Sharma", 35, "MI", "Batter"));
		plist.add(new Player(2, "Virat Kohli", 34, "RCB", "Bowler"));
	}
	
	public String addplayer(Player player)
	{
		  plist.add(player);
		return "Added player";
	}
	
	public List<Player> getallplayers()
	{
		return plist;
	}
	
	public Player getplayerbyid(int id)
	{
		for (Player player1 : plist) {
			if (player1.getPlayerId() == id) {
				return player1;
			}
		}
		return null;
	}
	
	public String updateplayers(int id, Player player)
	{
		for (int i = 0; i < plist.size(); i++) {
			Player player2 = plist.get(i);
			if (player2.getPlayerId() == id) {
				plist.set(i, player);
				return "okay";
			}
		}
		return "not okay";
	}
	
	public String deleteplayer(int id)
	{
		for (int i = 0; i < plist.size(); i++) {
			Player player = plist.get(i);
			if (player.getPlayerId()==id) {
				plist.remove(player);
				return "deleted sucessfully";
			}
		}
		return "not";
	}

}

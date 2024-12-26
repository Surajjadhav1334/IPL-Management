package com.ipl.model;

public class Player {

	private int playerId;
	private String playername;
	private int age;
	private String teamname;
	private String role;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playername, int age, String teamname, String role) {
		super();
		this.playerId = playerId;
		this.playername = playername;
		this.age = age;
		this.teamname = teamname;
		this.role = role;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playername=" + playername + ", age=" + age + ", teamname=" + teamname
				+ ", role=" + role + "]";
	}
	
	
}

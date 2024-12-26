package com.ipl.model;

public class Team {
	
	private int teamId;
	private String teamname;
	private String city;
	private String coach;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamname, String city, String coach) {
		super();
		this.teamId = teamId;
		this.teamname = teamname;
		this.city = city;
		this.coach = coach;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamname=" + teamname + ", city=" + city + ", coach=" + coach + "]";
	}
	
	

}

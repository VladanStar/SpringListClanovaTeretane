package com.vladancupric;

import java.util.List;

public class Teretana {
	private String imeTeretane;
	private List<String> clanovi;
	
	
	public Teretana(String imeTeretane, List<String> clanovi) {
		super();
		this.imeTeretane = imeTeretane;
		this.clanovi = clanovi;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Clanovi teretane");
		sb.append(imeTeretane + "su: \n");
		for(String clan: clanovi) {
			sb.append(clan);
			sb.append("\n");
		}
		return sb.toString();
	}
	
}

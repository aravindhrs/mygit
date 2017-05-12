package com.interview.collectionspkg;

public class Movie {
	private String name, actor;
	private int releaseYr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getReleaseYr() {
		return releaseYr;
	}

	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	
	@Override
	public boolean equals(Object o) {
		Movie m = (Movie) o;
		return m.actor.equals(this.actor) && m.name.equals(this.name) && m.releaseYr == this.releaseYr;
	}

	@Override
	public int hashCode() {
		//return actor.hashCode() + name.hashCode() + releaseYr;
		int result = 17;
        result = 31 * result + actor.hashCode();
        System.out.println("result1:"+result);
        result = 31 * result + name.hashCode();
        System.out.println("result2:"+result);
        result = 31 * result + releaseYr;
        System.out.println("result3:"+result);
        return result;
	}
}
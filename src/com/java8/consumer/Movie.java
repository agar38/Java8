package com.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {
	
	String name;
	String hero;
	String heroine;
	String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Movie(String name, String hero, String heroine, String result) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", hero=" + hero + ", heroine=" + heroine + ", result=" + result + "]";
	}
	
	public static class Test {
		public static void main(String args[])
		{
			ArrayList<Movie> movieList = new ArrayList<>();
			movieList.add(new Movie("Baahubali","b","c","Hit"));
			movieList.add(new Movie("X men","e","c","Flop"));
			movieList.add(new Movie("Star wars","h","g","Hit"));
			
			Consumer<Movie> c = m -> {
				System.out.println(m.name);
				System.out.println(m.hero);
				System.out.println(m.heroine);
			};
			/*
			 * for(Movie m : movieList) c.accept(m);
			 */
			Consumer<Movie> c1 = m-> 
				System.out.println(m.name + "is ready to release");
				Consumer<Movie> c2 = m-> 
				System.out.println(m.name + "is" + m.result);
			
				Consumer<Movie> chained = c1.andThen(c2).andThen(c);
				for(Movie m : movieList)
					chained.accept(m);
		}
		
	}
	

}

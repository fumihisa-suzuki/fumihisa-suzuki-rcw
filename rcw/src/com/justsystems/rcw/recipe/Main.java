package com.justsystems.rcw.recipe;

public class Main {

	public static void main(String[] args) {
		RecipeWriter writer = new RecipeWriter(args[0]);
		writer.write();
	}
	
}

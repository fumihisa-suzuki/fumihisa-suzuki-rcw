package com.justsystems.rcw.recipe;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class RecipeWriter {
	
	private String filename;

	public RecipeWriter(String filename) {
		this.filename = filename;
	}
	
	public void write() {
		try (Writer writer = new OutputStreamWriter(new FileOutputStream(filename))){
			writer.write("ƒIƒ€ƒ‰ƒCƒX");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

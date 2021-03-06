package com.justsystems.rcw.recipe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class RecipeWriter {

	private String inputFilename;

	private String outputFilename;

	public RecipeWriter(String inputFilename, String outputFilename) {
		this.inputFilename = inputFilename;
		this.outputFilename = outputFilename;
	}

	public void write() {
		BufferedReader reader = null;
		Writer writer = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(inputFilename)));

			writer = new OutputStreamWriter(
					new FileOutputStream(outputFilename));

			for (String line; (line = reader.readLine()) != null;) {
				writer.write(line);
			}
		} catch (IOException e) {
			new RuntimeException(e.getMessage());
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
				}
			}
		}
	}

}

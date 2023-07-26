package com.roomprogram;

import java.io.IOException;

class FileProcesser {
	String processFile() throws IOException {
		throw new IOException("Error reading the file");
	}
}

class SubFileProcesser extends FileProcesser {
	String processFile() throws IOException {
		super.processFile();
		return "SubFile Processer";
	}
}

public class ExceptionHandlingOverridingeExmp1 {

	public static void main(String[] args) {
		FileProcesser fileProcesser = new SubFileProcesser();
		try {
			fileProcesser.processFile();
		} catch (IOException e) {
			System.out.println("caught Exception: " + e.getMessage());

		}
	}

}

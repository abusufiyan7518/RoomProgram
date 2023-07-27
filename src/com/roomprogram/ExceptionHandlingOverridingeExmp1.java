package com.roomprogram;

import java.io.IOException;

class FileProcesser {
	String processFile()  {
		return "Error reading the file";
	}
}

class SubFileProcesser extends FileProcesser {
	String processFile()  {
		System.out.println(super.processFile());
		return "SubFile Processer";
	}
}

public class ExceptionHandlingOverridingeExmp1 {

	public static void main(String[] args) {
		FileProcesser fileProcesser = new SubFileProcesser();
		
			System.out.println(fileProcesser.processFile());
	}

}

package com.licagent;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadWordDoc {
	 public static void main(String[] args) throws IOException {

	        String fileName = "E:\\1158\\due list.docx";

	        try (XWPFDocument doc = new XWPFDocument(
	                Files.newInputStream(Paths.get(fileName)))) {

	            XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(doc);
	            String docText = xwpfWordExtractor.getText();
	           // System.out.println(docText);
	            docText.toString();
	            System.out.println(docText.length()+"====="+docText.lines());
	            String[] words=docText.split("\\s");
	           System.out.println("length==="+words.length);
	         for (String string : words) {
	        	 System.out.println(string); 
			}
			
	            // find number of words in the document
	            long count = Arrays.stream(docText.split("\\s+")).count();
	            System.out.println("Total words: " + count);

	        }

	    }
}

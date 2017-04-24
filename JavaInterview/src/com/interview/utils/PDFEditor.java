package com.interview.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFEditor {
	private static String USER_PASS = "Hello123";
	private static String OWNER_PASS = "Owner123";
	public static void main(String[] args){
		try {
			OutputStream oStream = new FileOutputStream(new File("C:\\Users\\aravindh\\Desktop\\Fuck.pdf"));
			Document pdfDoc = new Document();
			PdfWriter writer = PdfWriter.getInstance(pdfDoc, oStream);
			writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(), PdfWriter.ALLOW_MODIFY_CONTENTS, PdfWriter.ENCRYPTION_AES_128);
			pdfDoc.open();
			pdfDoc.add(new Paragraph("Fuck you"));
			pdfDoc.add(new Paragraph(new Date(System.currentTimeMillis()).toString()));
			pdfDoc.close();
			oStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

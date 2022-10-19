package testngpractice;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class PDfSample {

	public static void main(String[] args) throws Exception {

		URL url=new URL("https://www.africau.edu/images/default/sample.pdf");
		InputStream in=url.openStream();
		BufferedInputStream bis=new BufferedInputStream(in);
		PDDocument doc=null;
		doc=PDDocument.load(bis);
		String pdfcontent=new PDFTextStripper().getText(doc);
		System.out.println(pdfcontent);
	}

}

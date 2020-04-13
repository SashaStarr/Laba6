package ua.lviv.iot.test_regular_expression;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;
import ua.lviv.iot.regular_expression.*;

public class RegularExpressionTest {
	@Test
	public void test() {

		String yourText = "He-llo Th-is Wor-ld!My na-me Sa-sha.I lo-ve programming";
		InputStream input = new ByteArrayInputStream(yourText.getBytes());
		System.setIn(input);

		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		String text = myScanner.nextLine();
		System.out.println(text);
		RegularExpression.printText(text);
	}
}
package ua.lviv.iot.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	private static String regularEx = "([^.!?;]{0,}(((\\w{1,}[-]){1,}\\w{2,})){1,}[^.!?;]{0,}){3,}\\!";

	public static void printText(String text) {
		final Pattern pattern = Pattern.compile(regularEx);
		final Matcher matcher = pattern.matcher(text);

		System.out.println("Sentences with three or more hyphens in words ");
		while (matcher.find()) {
			System.out.println(matcher.group(0));
		}
		System.out.println("sentences without three or more hyphens in words");

		System.out.println(matcher.replaceAll(""));
	}
}
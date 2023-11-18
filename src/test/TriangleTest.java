package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Triangle;
import main.Triangle.TYPE;

class TriangleTest {
	/*-
	Triangle triangle;
	
	@BeforeAll
	void beforeAll() {
		//triangle = new Triangle();
	}
	*/
	String[] noTriangleString1 = { "0", "2", "3" };
	String[] noTriangleString2 = { "2", "0", "3" };
	String[] noTriangleString3 = { "4", "2", "0" };
	String[] scaleneString = { "4", "2", "3" };
	String[] isoscelesString = { "3", "2", "3" };
	String[] equilateralString = { "3", "3", "3" };
	String[] NANString = { "s", "y", "j" };
	String[] shortString = { "1", "2"};
	String[] longString = { "1", "2", "3", "4"};
	
	
	// toString
	
	@Test
	@DisplayName("Test toString if not a triangle no input")
	void toStringCheckNotTriangle() {
		Triangle triangle = new Triangle();
		String result = triangle.toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if not a triangle 1")
	void toStringCheckNotTriangle1() {
		Triangle triangle = new Triangle(noTriangleString1);
		String result = triangle.toString();
		assertEquals("0, 2, 3, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if not a triangle 2")
	void toStringCheckNotTriangle2() {
		Triangle triangle = new Triangle(noTriangleString2);
		String result = triangle.toString();
		assertEquals("2, 0, 3, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if not a triangle 3")
	void toStringCheckNotTriangle3() {
		Triangle triangle = new Triangle(noTriangleString3);
		String result = triangle.toString();
		assertEquals("4, 2, 0, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if Scalene works")
	void toStringCheckScalene() {
		Triangle triangle = new Triangle(scaleneString);
		String result = triangle.toString();
		assertEquals("4, 2, 3, This is a Scalene triangle", result);
	}

	@Test
	@DisplayName("Test toString if Isosceles works")
	void toStringCheckIsosceles() {
		Triangle triangle = new Triangle(isoscelesString);
		String result = triangle.toString();
		assertEquals("3, 2, 3, This is a Isosceles triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if Equilateral works")
	void toStringCheckEquilateral() {
		Triangle triangle = new Triangle(equilateralString);
		String result = triangle.toString();
		assertEquals("3, 3, 3, This is a Equilateral triangle", result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if Equilateral works")
	void getCurrent_typeCheckEquilateral() {
		Triangle triangle = new Triangle(equilateralString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(TYPE.EQUILATERAL, result);
	}
	
	@Test
	@DisplayName("Test toString if short input")
	void toStringCheckShortInput() {
		String result = new Triangle(shortString).toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if short input")
	void toStringCheckLongInput() {
		String result = new Triangle(longString).toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}
	
	// getCurrent_type
	
	@Test
	@DisplayName("Test getCurrent_type if not a triangle 1")
	void getCurrent_typeNoInput() {
		Triangle triangle = new Triangle();
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if not a triangle 1")
	void getCurrent_typeCheckNotTriangle1() {
		Triangle triangle = new Triangle(noTriangleString1);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if not a triangle 2")
	void getCurrent_typeCheckNotTriangle2() {
		Triangle triangle = new Triangle(noTriangleString2);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if not a triangle 3")
	void getCurrent_typeCheckNotTriangle3() {
		Triangle triangle = new Triangle(noTriangleString3);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if Scalene works")
	void getCurrent_typeCheckScalene() {
		Triangle triangle = new Triangle(scaleneString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(TYPE.SCALENE, result);
	}

	@Test
	@DisplayName("Test getCurrent_type if Isosceles works")
	void getCurrent_typeCheckIsosceles() {
		Triangle triangle = new Triangle(isoscelesString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(TYPE.ISOSCELES, result);
	}
	
	@Test
	@DisplayName("Test toString if wrong input")
	void toStringCheckNAN() {
		String result = new Triangle(NANString).toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if wrong input")
	void getCurrent_typeCheckNAN() {
		Triangle triangle = new Triangle(NANString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if short input")
	void getCurrent_typeCheckShortInput() {
		Triangle triangle = new Triangle(shortString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}
	
	// getUserInput
	
	@Test
	@DisplayName("Test toString if not a triangle 1")
	void getUserInput_toStringCheckNotTriangle1() {
		String input = "0,2,3";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
		Triangle triangle = new Triangle();
		triangle.getUserInput();
		String result = triangle.toString();
		assertEquals("0, 2, 3, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if not a triangle. scanner")
	void getUserInput_toStringCheckShortInput() {
		String input = "0,2";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
		Triangle triangle = new Triangle();
		triangle.getUserInput();
		String result = triangle.toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if NAN. scanner")
	void getUserInput_toStringNAN() {
		String input = "s,y,j";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
		Triangle triangle = new Triangle();
		triangle.getUserInput();
		String result = triangle.toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}

}

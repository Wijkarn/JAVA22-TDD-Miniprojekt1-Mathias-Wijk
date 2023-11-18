package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
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
	String[] noTriangleString = { "0", "2", "3" };
	String[] scaleneString = { "4", "2", "3" };
	String[] isoscelesString = { "3", "2", "3" };
	String[] equilateralString = { "3", "3", "3" };
	String[] NANString = { "s", ",", "j" };
	String[] ShortString = { "1", "2"};
	
	@Test
	@DisplayName("Test toString if not a triangle works")
	void toStringCheckNotTriangle() {
		String result = new Triangle(noTriangleString).toString();
		assertEquals("0, 2, 3, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if Scalene works")
	void toStringCheckScalene() {
		String result = new Triangle(scaleneString).toString();
		assertEquals("4, 2, 3, This is a Scalene triangle", result);
	}

	@Test
	@DisplayName("Test toString if Isosceles works")
	void toStringCheckIsosceles() {
		String result = new Triangle(isoscelesString).toString();
		assertEquals("3, 2, 3, This is a Isosceles triangle", result);
	}
	
	@Test
	@DisplayName("Test toString if Equilateral works")
	void toStringCheckEquilateral() {
		String result = new Triangle(equilateralString).toString();
		assertEquals("3, 3, 3, This is a Equilateral triangle", result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if not a triangle works")
	void getCurrent_typeCheckNotTriangle() {
		Triangle triangle = new Triangle(noTriangleString);
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
	@DisplayName("Test getCurrent_type if Equilateral works")
	void getCurrent_typeCheckEquilateral() {
		Triangle triangle = new Triangle(equilateralString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(TYPE.EQUILATERAL, result);
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
	@DisplayName("Test toString if short input")
	void toStringCheckShortInput() {
		String result = new Triangle(ShortString).toString();
		assertEquals("0, 0, 0, This is not a triangle", result);
	}
	
	@Test
	@DisplayName("Test getCurrent_type if short input")
	void getCurrent_typeCheckShortInput() {
		Triangle triangle = new Triangle(ShortString);
		Enum<?> result = triangle.getCurrent_type();
		assertEquals(null, result);
	}

}

package junitdni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidarDNITest {

	@Test
	public void testValidarDNI() {
		System.out.println("validarDNI");
		String DNI = "654321V";
		boolean expResult = false;
		boolean result = ValidarDNI.validarDNI(DNI);
		assertEquals(expResult, result);
	}

	@Test
	public void testValidarDNI1() {
		System.out.println("validarDNI");
		String DNI = "987654321L";
		boolean expResult = false;
		boolean result = ValidarDNI.validarDNI(DNI);
		assertEquals(expResult, result);
	}

	@Test
	public void testValidarDNI2() {
		System.out.println("validarDNI");
		String DNI = "321U876K";
		boolean expResult = false;
		boolean result = ValidarDNI.validarDNI(DNI);
		assertEquals(expResult, result);
	}

	@Test
	public void testValidarDNI3() {
		System.out.println("validarDNI");
		String DNI = "23456789L";
		boolean expResult = false;
		boolean result = ValidarDNI.validarDNI(DNI);
		assertEquals(expResult, result);
	}

	@Test
	public void testValidarDNI4() {
		System.out.println("validarDNI");
		String DNI = "34567890V";
		boolean expResult = true;
		boolean result = ValidarDNI.validarDNI(DNI);
		assertEquals(expResult, result);
	}

	@Test
	public void testValidarDNI5() {
		System.out.println("validarDNI");
		String DNI = "42231857Q";
		boolean expResult = true;
		boolean result = ValidarDNI.validarDNI(DNI);
		assertEquals(expResult, result);
	}

}

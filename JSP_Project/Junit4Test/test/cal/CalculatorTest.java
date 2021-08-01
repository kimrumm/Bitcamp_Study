 //@작성일 : 2021. 7. 30.

package cal;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before()");
		cal = new Calculator();
		
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("@After()");
	}

	@Test
	public void testAdd() {
		System.out.println("testadd()");
		Calculator cal = new Calculator();
		assertEquals("add() 메소드 테스트", 12, cal.add(10, 2));
		//fail("Not yet implemented");
	}

	@Test
	public void testSubsract() {
		System.out.println("testSubsract()");
		assertEquals("substart() 메소드 테스트", 8, cal.subsract(10, 2));
		//fail("Not yet implemented");
		
	}

	@Test
	public void testMultiply() {
		System.out.println("testMultiply()");
		assertEquals("divide() 메소드 테스트", 20, cal.multiply(10, 2));
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		System.out.println("testDivide()");
		//fail("Not yet implemented");
	}
	
	// 예외 타입을 비교해서 테스트
	@Test(expected = SQLException.class)
	public void test1() throws SQLException {
		System.out.println("@Test 실행 중 예외 타입을 테스트");
		throw new SQLException();
		
	}
	
	@Test(timeout = 100)
	public void test2() {
		System.out.println("@Test 테스트 중 허용시간 ms 안에 실행이 완료 되는지 테스트");
		cal.add(100, 200);
		cal.subsract(10, 2);
	}
	
	

}

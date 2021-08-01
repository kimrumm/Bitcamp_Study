package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import dept.dao.DeptDao;
import dept.domain.Dept;
import jdbc.util.ConnectionProvider;

public class DeptDaoTest {
	
	private static DeptDao dao;
	private Connection conn;
	private Dept dept;

	//제일 먼저 실행
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			dao = DeptDao.getInstance();
			System.out.println("@BeforeClass");
	}

	
	// 테스트 직전 실행
	@Before
	public void setUp() throws Exception {
		conn = ConnectionProvider.getConnection();
	}
	
	// 테스트 직후 실행
	@After
	public void tearDown() throws Exception {
		
	}

	//테스트
	@Test
	public void testGetDeptList() {
		List<Dept> list = dao.getDeptList(conn);
		assertNotNull("리스트 생성 여부 확인",list);
	}

	@Test
	public void testInsertDept() {
		int result = dao.insertDept(conn,new Dept(100,"test1","제주"));
		
		assertEquals("inset 확인",result,1);
	}

	@Test
	public void testDeleteDept() {
		int result = dao.deleteDept(conn, 80);
		assertEquals("delet 확인", result,1);
	}

	@Test
	public void testSelectByDeptno() {
		dept = dao.selectByDeptno(conn, 10);
		assertNotNull("선택 확인", dept);

	}

	@Test
	public void testUpdateDept() {
		int result = dao.updateDept(conn,new Dept(70,"test2","강남"));
		assertEquals("업데이트 확인", result,1);
	}

}

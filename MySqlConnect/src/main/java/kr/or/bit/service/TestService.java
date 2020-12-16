package kr.or.bit.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.bit.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	private SqlSession sqlsession;
	
	public String insertTest() {
		
		TestDao testdao = sqlsession.getMapper(TestDao.class);
		try {
			testdao.insertTest();
			System.out.println("inser  성공 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home2";
	}
}

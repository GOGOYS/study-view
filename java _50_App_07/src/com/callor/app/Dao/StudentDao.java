package com.callor.app.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.model.StudentVO;

public class StudentDao {
	private final Connection dbConn;
	public StudentDao() {
		
		dbConn = DBConnection.getDBDonnection();
	}
	public List<StudentVO> selectAll() throws SQLException{
		String sql = "SELECT * FROM tbl_student";
		PreparedStatement pStr = null;
		
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		
		
		while(rSet.next()) {
			
			//임의 생성자로 만들기
			StudentVO stVO = new StudentVO(
				rSet.getString("st_num"),
				rSet.getString("st_name"),
				rSet.getString("st_tel"),
				rSet.getString("st_addr"),
				rSet.getString("st_dept"),
				rSet.getInt("st_grade")
				);
			
			
			//기본 생성자로 만들기
			StudentVO stVO1 = new StudentVO();
			stVO1.setStNum(rSet.getString("st_num"));
			stVO1.setStName(rSet.getString("st_num"));
			stVO1.setStTel(rSet.getString("st_num"));
			stVO1.setStAddr(rSet.getString("st_num"));
			stVO1.setStDept(rSet.getString("st_num"));
			stVO1.setStGrade(rSet.getInt("st_grade"));
			
			
			// 클래스 이름 뒤에 builder()를 이용해서 
			// 필요한 데이터들만 가져올 수 있다
			// = builder 패턴
			StudentVO stVO2 = StudentVO.builder()
								.stNum(rSet.getString("st_num"))
								.stName(rSet.getString("st_name"))
								.stTel(rSet.getString("st_tel"))
								.build();
								
			
			
		}
	}
}

package com.study.insert_and_select.config;

public interface DBConfig {
	String url = "jdbc:mysql://mysql-db.ch0w4gg2ikrq.ap-northeast-2.rds.amazonaws.com/db_study";  // 인터페이스는 기본적으로 public static final
	String username = "aws";
	String password = "1q2w3e4r!!";          //공용으로 쓸거라서 위로 빼놓음 try 안쪽이 아니라
					
}

package com.zhou.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestJdbc {
	public static void main(String[] args) {
		transactionTest();
	}

	public void con() {
		Connection connection =null;
		PreparedStatement prepareStatement =null;
		ResultSet executeQuery =null;
		try {
			connection = DbUtil.getConnection();
			prepareStatement = connection
					.prepareStatement("select * from stu");
			executeQuery = prepareStatement.executeQuery();
			List<MyEntity> list = new ArrayList();
			for (; executeQuery.next();) {

				MyEntity myEntity = new MyEntity();
				myEntity.setId(executeQuery.getInt("id"));
				myEntity.setName(executeQuery.getString("name"));
				list.add(myEntity);
			}
			System.out
					.println(list.get(0).getId() + " " + list.get(0).getName());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtil.close(executeQuery,prepareStatement,connection);
		}
	}
	public void userUpdate() {
		String sql = "update stu set name=? where id =1";
		DbUtil.update(sql,"小黑");
	}
	
	/**
	 * 
	 * @fun-name transactionTest
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年10月9日 上午11:28:01
	 * TODO sql中批处理，sql事务
	 */
	public static void transactionTest(){
		Connection connection =null;
		PreparedStatement prepareStatement =null;
		ResultSet executeQuery =null;
		try {
			connection = DbUtil.getConnection();
			connection.setAutoCommit(false);
			prepareStatement = connection
					.prepareStatement("insert into stu values(?,?)");
			for (int i = 1; i <= 500; i++) {
				prepareStatement.setInt(1,i);
				prepareStatement.setString(2,"小明"+i);
				prepareStatement.addBatch();
				if(i%101==0) {
					prepareStatement.executeBatch();
					connection.commit();
					prepareStatement.clearBatch();
				}
			}
			int[] executeBatch = prepareStatement.executeBatch();
			connection.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtil.close(executeQuery,prepareStatement,connection);
		}
	}
}

package com.zhou.myjdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbUtil {
	static String dbDriver;
	static String dbUrl;
	static String dbUser;
	static String dbPass;
	/**
	 * 
	 * @author Mr_zhou
	 * @date 2018年10月9日 上午9:28:39
	 * @return TODO 静态代码块 
	 *   加载了db.properties到程序中，
	 *   读取到了数据库url，用户名,密码，驱动包名, 
	 *   加载了读取到的数据库驱动
	 */
	static {
		try {
			Properties prop = new Properties();
			InputStream resourceAsStream = DbUtil.class.getClassLoader()
					.getResourceAsStream("com/zhou/myjdbc/db.properties");			
			prop.load(resourceAsStream);
			dbDriver = prop.getProperty("db.driver");
			dbUser = prop.getProperty("db.user");
			dbUrl = prop.getProperty("db.url");
			dbPass = prop.getProperty("db.pass");
			Class.forName(dbDriver);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @fun-name getConnection
	 * @return-type Connection
	 * @author Mr_zhou
	 * @date 2018年10月9日 上午9:28:39
	 * @return TODO 返回一个数据库连接对象Connection
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * 
	 * @fun-name close
	 * @return-type void
	 * @author Mr_zhou
	 * @date 2018年10月9日 上午9:37:45
	 * @param executeQuery
	 * @param prepareStatement
	 * @param connection       
	 * TODO 关闭数据库对象,释放资源
	 */
	public static void close(ResultSet executeQuery, PreparedStatement prepareStatement, Connection connection) {
		try {
			if (executeQuery != null) {
				executeQuery.close();
			}
			if (prepareStatement != null) {
				prepareStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("数据库对象关闭失败");
		}
	}
	
	/**
	 * 
	 * @fun-name update
	 * @return-type int
	 * @author Mr_zhou
	 * @date 2018年10月9日 上午9:59:37
	 * @param sql  增删改 的sql 语句
	 * @param args sql中问号占位的参数
	 * @return
	 * TODO JDBC 增删改 的封装
	 */
	public static int update(String sql,Object...args) {
		Connection connection =null;
		PreparedStatement prepareStatement =null;
		int result=0;
		try {
			connection = DbUtil.getConnection();
			prepareStatement = connection
					.prepareStatement(sql);
			if(args.length>0) {
				for(int i=1;i<=args.length;i++) {
					prepareStatement.setObject(i,args[i-1]);
				}	
			}
			result=prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtil.close(null,prepareStatement,connection);
		}
		return result;
	}
	
	
}

package com.pluralsight.corejdbc.m3c3;

import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceProducer {

	public MysqlDataSource mySqldataSource = null;

	@Produces
	@MySqlDataSource
	public DataSource produceDataSource() {
		// read properties from somewhere here

		if (mySqldataSource == null) {
			mySqldataSource = new MysqlDataSource();
			mySqldataSource.setPassword("ubuntu");
			mySqldataSource.setUser("caoliv3");
			mySqldataSource.setURL("jdbc:maridb://localhost:3306/classicmodels?");
		}
		return mySqldataSource;
	}
}

package com.goodtech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpreadsheetRepositoryImpl implements SpreadsheetRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createTable() {
		jdbcTemplate.execute("DROP TABLE IF EXISTS bahubali");
		jdbcTemplate.execute("create table bahubali(Id int,name varchar(5))");
		return 1;
	}

	@Override
	public int alterTable(String tableColumn, String tableName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertData(String columnName, String data, String tablename) {
		// TODO Auto-generated method stub
		return 0;
	}

}

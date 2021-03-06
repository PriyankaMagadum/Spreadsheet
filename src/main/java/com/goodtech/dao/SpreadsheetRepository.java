package com.goodtech.dao;

public interface SpreadsheetRepository {

	public int createTable();

	public int alterTable(String tableColumn, String tableName);

	public int insertData(String columnName, String data, String tablename);

}

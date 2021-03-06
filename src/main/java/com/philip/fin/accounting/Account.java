package com.philip.fin.accounting;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable{
	private int account_id;
	
	private String account_num;
	
	private String account_name;
	
	private String chinese_name;
	
	private String description;
	
	private int account_type;
	
	private String type_description;
	
	private Date create_time;
	
	private Date update_time;
	
	private int user_account;
	
	private char D_C;

	private AccountBalance account_bal;
	
	public Account() {
		account_bal = new AccountBalance();
	}
	
	public char getD_C() {
		return D_C;
	}

	public void setD_C(char d_C) {
		D_C = d_C;
	}
	
	public AccountBalance getAccount_bal() {
		return account_bal;
	}

	public void setAccount_bal(AccountBalance account_bal) {
		this.account_bal = account_bal;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getChinese_name() {
		return chinese_name;
	}

	public void setChinese_name(String chinese_name) {
		this.chinese_name = chinese_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAccount_type() {
		return account_type;
	}

	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}

	public String getType_description() {
		return type_description;
	}

	public void setType_description(String type_description) {
		this.type_description = type_description;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public int getUser_account() {
		return user_account;
	}

	public void setUser_account(int user_account) {
		this.user_account = user_account;
	}
	
	
}

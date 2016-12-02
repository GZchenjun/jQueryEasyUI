package com.gs.common;

import java.io.IOException;
import java.util.Properties;

public class Config {
	
	private Properties prop; // ��ȡ*.properties�����ļ���java��
	
	public Config(String path) {
		prop = new Properties();
		try {
			prop.load(Config.class.getResourceAsStream(path)); 
			// ����ָ����properties�ļ���·��������������ݶ�ȡ��Properties������
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getInt(String key) {
		return Integer.valueOf(prop.getProperty(key)); // getProperty������ͨ�������ļ��е�key����ȡ����Ӧ��valueֵ
	}
	
	public double getDouble(String key) {
		return Double.valueOf(prop.getProperty(key));
	}
	
	public String getString(String key) {
		return prop.getProperty(key);
	}

}

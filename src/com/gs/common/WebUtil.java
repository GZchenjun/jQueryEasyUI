package com.gs.common;

import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	
	public static String getUriMethod(HttpServletRequest req) {
		String uri = req.getRequestURI(); // ��������ѯ�ַ�������
		return uri.substring(uri.lastIndexOf("/") + 1);
	}

}

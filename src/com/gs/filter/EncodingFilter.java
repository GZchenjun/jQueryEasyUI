package com.gs.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.gs.common.Constants;

/**
 * �������������ִ���κ�servletǰ���Ѹ�serlvet���õ���request��response����ı������ó�
 * utf-8
 *
 */
public class EncodingFilter implements Filter {
	
	private String encoding;

	@Override
	public void destroy() {
		System.out.println("�������������....");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) // FilterChain��ʾ��������
			throws IOException, ServletException {
		System.out.println("�����������ʼ����");
		if (encoding == null) {
			encoding = Constants.DEFAULT_ENCODING;
		}
		req.setCharacterEncoding(encoding);
		resp.setCharacterEncoding(encoding);
		// chain.doFilter�������ǿ�ʼ�����ˣ����Ҵ��ݵ���һ�������������û����һ�����������򴫵ݸ�Servlet
		// chain.doFilterǰ�Ĵ������ǰ�÷���
		chain.doFilter(req, resp);
		// chain.doFilter��Ĵ���������÷���
		System.out.println("����������������");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		encoding = arg0.getInitParameter("encoding");
		System.out.println("�����������ʼ��...");
	}

}

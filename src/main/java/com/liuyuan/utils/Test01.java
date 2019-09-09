package com.liuyuan.utils;

import org.junit.Test;

public class Test01 {
	
	@Test
	public void test01(){
		String str = "多少了烤肉饭加快速度\\nsdfs第三方\\n\\r水电费了开关机克鲁赛德\\rsdfds\\n";
		String html = StringUtil.isHtml(str);
		System.out.println(html);
	}
}

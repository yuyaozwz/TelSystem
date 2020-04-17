package com.forestry.service.sys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.forestry.model.sys.Tel;

import core.service.Service;

/**
 * 
 * @author 郑为中
 * 绍兴文理学院元培学院 计算机1701
 * 《数据库编程》 期末作品
 */

public interface TelService extends Service<Tel> {

	List<Object[]> queryExportedTel(Long[] ids);
	public int saveTelTwoDimensionalCode(HttpServletRequest request, String filePath,Long id);
	public void updateTel(Tel tel);
	
}

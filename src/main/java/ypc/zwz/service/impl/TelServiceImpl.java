package ypc.zwz.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import core.service.BaseService;
import ypc.zwz.dao.TelDao;
import ypc.zwz.model.Tel;
import ypc.zwz.service.TelService;

/**
 * 
 * @author 郑为中
 * 绍兴文理学院元培学院 计算机1701
 * 《数据库编程》 期末作品
 */

@Service
public class TelServiceImpl extends BaseService<Tel> implements TelService {

	private TelDao telDao;
	
	//@Resource
	//private HouseTypeDao houseTypeDao;

	@Resource
	public void setTelDao(TelDao telDao) {
		this.telDao = telDao;
		this.dao = telDao;
	}
	@Override
	public void updateTel(Tel tel) {
		telDao.updateQmm(tel);
	}
	
	//public int saveHouseTwoDimensionalCode(Long id);
	@Override
	public int saveTelTwoDimensionalCode(HttpServletRequest request, String filePath,Long id) {
		return telDao.saveTelTwoDimensionalCode( request, filePath,id);
	}
	@Override
	public List<Object[]> queryExportedTel(Long[] ids) {
		return telDao.queryExportedTel(ids);
	}
	
	
	

}

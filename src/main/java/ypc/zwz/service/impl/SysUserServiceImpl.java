package ypc.zwz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import core.service.BaseService;
import core.web.SystemCache;
import ypc.zwz.dao.SysUserDao;
import ypc.zwz.model.SysUser;
import ypc.zwz.service.SysUserService;

/**
 * 
 * @author 郑为中
 * 绍兴文理学院元培学院 计算机1701
 * 《数据库编程》 期末作品
 */

@Service
public class SysUserServiceImpl extends BaseService<SysUser> implements SysUserService {

	private SysUserDao sysUserDao;

	@Resource
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
		this.dao = sysUserDao;
	}

	@Override
	public List<SysUser> getSysUserList(List<SysUser> resultList) {
		List<SysUser> sysUserList = new ArrayList<SysUser>();
		for (SysUser entity : resultList) {
			SysUser sysUser = new SysUser();
			sysUser.setId(entity.getId());
			sysUser.setUserName(entity.getUserName());
			sysUser.setPassword(entity.getPassword());
			sysUser.setRealName(entity.getRealName());
			sysUser.setTel(entity.getTel());
			sysUser.setEmail(entity.getEmail());
			sysUser.setLastLoginTime(entity.getLastLoginTime());
			sysUser.setRole(entity.getRole());
			sysUser.setUserGrade(entity.getUserGrade());
			sysUser.setDepartmentId(entity.getDepartmentId());
			sysUser.setDepartmentName(entity.getDepartmentName());
			sysUser.setRoleName(SystemCache.DICTIONARY.get("SYSUSER_ROLE").getItems().get(String.valueOf(entity.getRole())).getValue());
			sysUserList.add(sysUser);
		}
		return sysUserList;
	}
	@Override
	public List<Object[]> queryExportedSysUser(Long[] ids) {
		return sysUserDao.queryExportedSysUserDao(ids);
	}

}

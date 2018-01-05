/**
 * @项目名称: btp
 * @文件名称: LogService.java
 * @版权声明: 本文件仅限于合肥寰景信息科技有限公司内部传阅，禁止外泄以及用于其他商业目的。
 * @copyRight: 2016 www.vrview.cn Inc. All rights reserved. 
 */

package com.jmz.qyyl.service;

import com.jmz.qyyl.dao.SystemDBbakMapper;
import com.jmz.qyyl.model.SystemDBbak;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;

/**
 * 数据备份服务类
 * 
 * @author 袁宗宇
 * @since 2017-11-28 11:05:04
 */
@Service
public class SystemDBbakService {

	/**logMapper */
	@Resource
	SystemDBbakMapper systemDBbakMapper;


	/**
	 * 增
	 *
	 * @param systemBackup
	 *
	 */
	@Transactional
	public void insert(SystemDBbak systemBackup)throws  Exception {
		//添加记录
		try {

			systemBackup.setDbBakPath("tewt");
			systemBackup.setDbBakName(systemBackup.getDbName()+"_"+systemBackup.getDbBakName()+".bak");
			systemDBbakMapper.insertSelective(systemBackup);
		} catch (Exception e) {
			throw new Exception(systemBackup.getDbBakName()+"数据库备份失败！"+e);
		}

	}

}

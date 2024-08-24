package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ShiyanrenwuDao;
import com.cl.entity.ShiyanrenwuEntity;
import com.cl.service.ShiyanrenwuService;
import com.cl.entity.view.ShiyanrenwuView;

@Service("shiyanrenwuService")
public class ShiyanrenwuServiceImpl extends ServiceImpl<ShiyanrenwuDao, ShiyanrenwuEntity> implements ShiyanrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanrenwuEntity> page = this.selectPage(
                new Query<ShiyanrenwuEntity>(params).getPage(),
                new EntityWrapper<ShiyanrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanrenwuEntity> wrapper) {
		  Page<ShiyanrenwuView> page =new Query<ShiyanrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShiyanrenwuView> selectListView(Wrapper<ShiyanrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanrenwuView selectView(Wrapper<ShiyanrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

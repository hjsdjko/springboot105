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


import com.cl.dao.ShiyanpingfenDao;
import com.cl.entity.ShiyanpingfenEntity;
import com.cl.service.ShiyanpingfenService;
import com.cl.entity.view.ShiyanpingfenView;

@Service("shiyanpingfenService")
public class ShiyanpingfenServiceImpl extends ServiceImpl<ShiyanpingfenDao, ShiyanpingfenEntity> implements ShiyanpingfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanpingfenEntity> page = this.selectPage(
                new Query<ShiyanpingfenEntity>(params).getPage(),
                new EntityWrapper<ShiyanpingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanpingfenEntity> wrapper) {
		  Page<ShiyanpingfenView> page =new Query<ShiyanpingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShiyanpingfenView> selectListView(Wrapper<ShiyanpingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanpingfenView selectView(Wrapper<ShiyanpingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShiyanpingfenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShiyanpingfenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShiyanpingfenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}

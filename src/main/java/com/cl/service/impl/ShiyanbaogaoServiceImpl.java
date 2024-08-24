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


import com.cl.dao.ShiyanbaogaoDao;
import com.cl.entity.ShiyanbaogaoEntity;
import com.cl.service.ShiyanbaogaoService;
import com.cl.entity.view.ShiyanbaogaoView;

@Service("shiyanbaogaoService")
public class ShiyanbaogaoServiceImpl extends ServiceImpl<ShiyanbaogaoDao, ShiyanbaogaoEntity> implements ShiyanbaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanbaogaoEntity> page = this.selectPage(
                new Query<ShiyanbaogaoEntity>(params).getPage(),
                new EntityWrapper<ShiyanbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanbaogaoEntity> wrapper) {
		  Page<ShiyanbaogaoView> page =new Query<ShiyanbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShiyanbaogaoView> selectListView(Wrapper<ShiyanbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanbaogaoView selectView(Wrapper<ShiyanbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShiyanbaogaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShiyanbaogaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShiyanbaogaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}

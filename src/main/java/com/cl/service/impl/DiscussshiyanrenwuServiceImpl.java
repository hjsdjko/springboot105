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


import com.cl.dao.DiscussshiyanrenwuDao;
import com.cl.entity.DiscussshiyanrenwuEntity;
import com.cl.service.DiscussshiyanrenwuService;
import com.cl.entity.view.DiscussshiyanrenwuView;

@Service("discussshiyanrenwuService")
public class DiscussshiyanrenwuServiceImpl extends ServiceImpl<DiscussshiyanrenwuDao, DiscussshiyanrenwuEntity> implements DiscussshiyanrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiyanrenwuEntity> page = this.selectPage(
                new Query<DiscussshiyanrenwuEntity>(params).getPage(),
                new EntityWrapper<DiscussshiyanrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshiyanrenwuEntity> wrapper) {
		  Page<DiscussshiyanrenwuView> page =new Query<DiscussshiyanrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussshiyanrenwuView> selectListView(Wrapper<DiscussshiyanrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiyanrenwuView selectView(Wrapper<DiscussshiyanrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

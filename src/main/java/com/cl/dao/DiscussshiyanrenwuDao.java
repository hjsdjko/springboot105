package com.cl.dao;

import com.cl.entity.DiscussshiyanrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussshiyanrenwuView;


/**
 * 实验任务评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface DiscussshiyanrenwuDao extends BaseMapper<DiscussshiyanrenwuEntity> {
	
	List<DiscussshiyanrenwuView> selectListView(@Param("ew") Wrapper<DiscussshiyanrenwuEntity> wrapper);

	List<DiscussshiyanrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshiyanrenwuEntity> wrapper);
	
	DiscussshiyanrenwuView selectView(@Param("ew") Wrapper<DiscussshiyanrenwuEntity> wrapper);
	

}

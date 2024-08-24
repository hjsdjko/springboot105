package com.cl.dao;

import com.cl.entity.ShiyanrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShiyanrenwuView;


/**
 * 实验任务
 * 
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface ShiyanrenwuDao extends BaseMapper<ShiyanrenwuEntity> {
	
	List<ShiyanrenwuView> selectListView(@Param("ew") Wrapper<ShiyanrenwuEntity> wrapper);

	List<ShiyanrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanrenwuEntity> wrapper);
	
	ShiyanrenwuView selectView(@Param("ew") Wrapper<ShiyanrenwuEntity> wrapper);
	

}

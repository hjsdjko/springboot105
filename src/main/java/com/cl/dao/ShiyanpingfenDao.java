package com.cl.dao;

import com.cl.entity.ShiyanpingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShiyanpingfenView;


/**
 * 实验评分
 * 
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface ShiyanpingfenDao extends BaseMapper<ShiyanpingfenEntity> {
	
	List<ShiyanpingfenView> selectListView(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);

	List<ShiyanpingfenView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
	
	ShiyanpingfenView selectView(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);



}
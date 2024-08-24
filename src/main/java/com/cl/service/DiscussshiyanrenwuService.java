package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussshiyanrenwuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussshiyanrenwuView;


/**
 * 实验任务评论表
 *
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface DiscussshiyanrenwuService extends IService<DiscussshiyanrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiyanrenwuView> selectListView(Wrapper<DiscussshiyanrenwuEntity> wrapper);
   	
   	DiscussshiyanrenwuView selectView(@Param("ew") Wrapper<DiscussshiyanrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiyanrenwuEntity> wrapper);
   	

}


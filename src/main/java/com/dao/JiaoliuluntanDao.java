package com.dao;

import com.entity.JiaoliuluntanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoliuluntanVO;
import com.entity.view.JiaoliuluntanView;


/**
 * 交流论坛
 * 
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
public interface JiaoliuluntanDao extends BaseMapper<JiaoliuluntanEntity> {
	
	List<JiaoliuluntanVO> selectListVO(@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);
	
	JiaoliuluntanVO selectVO(@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);
	
	List<JiaoliuluntanView> selectListView(@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);

	List<JiaoliuluntanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);
	
	JiaoliuluntanView selectView(@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);
	
}

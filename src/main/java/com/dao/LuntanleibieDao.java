package com.dao;

import com.entity.LuntanleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuntanleibieVO;
import com.entity.view.LuntanleibieView;


/**
 * 论坛类别
 * 
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
public interface LuntanleibieDao extends BaseMapper<LuntanleibieEntity> {
	
	List<LuntanleibieVO> selectListVO(@Param("ew") Wrapper<LuntanleibieEntity> wrapper);
	
	LuntanleibieVO selectVO(@Param("ew") Wrapper<LuntanleibieEntity> wrapper);
	
	List<LuntanleibieView> selectListView(@Param("ew") Wrapper<LuntanleibieEntity> wrapper);

	List<LuntanleibieView> selectListView(Pagination page,@Param("ew") Wrapper<LuntanleibieEntity> wrapper);
	
	LuntanleibieView selectView(@Param("ew") Wrapper<LuntanleibieEntity> wrapper);
	
}

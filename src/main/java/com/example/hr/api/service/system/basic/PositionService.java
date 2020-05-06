package com.example.hr.api.service.system.basic;

import com.example.hr.api.mapper.PositionMapper;
import com.example.hr.api.model.Position;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author XieL
 * @date 2020/4/26 15:20
 */
@Service
public class PositionService {
    @Resource
    PositionMapper positionMapper;

    public List<Position> getAllPosition(){
        return positionMapper.selectAllPosition();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreatedate(new Date());
        return positionMapper.insertSelective(position);
    }

    public Integer updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePosition(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }
    public Integer deletePosition(Integer[] ids) {
        return positionMapper.deleteByIds(ids);
    }
    public PageInfo<Position> getPositionByPage(Integer page,Integer size){
        PageHelper.startPage(page,size);
        List<Position> positions = positionMapper.selectAllPosition();
        return new PageInfo<>(positions,size);
    }
}

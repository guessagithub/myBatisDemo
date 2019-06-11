package com.hht.myBatisDemo.commonTable.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hht.myBatisDemo.commonTable.entities.CommonTableObj;
import com.hht.myBatisDemo.commonTable.mapper.CommonTableDao;

@Service
public class CommonTableService {
	
    @Resource
    CommonTableDao commonTableDao;
    
    public List<CommonTableObj> getCommonTables() {
        return commonTableDao.getCommonTables();
    }
    
    public CommonTableObj getCommonTableById(String id){
        return commonTableDao.getCommonTableById(id);
    }
    
    public int add(CommonTableObj entity) throws Exception {
        if(entity.getName()==null||entity.getAddress().equals("")){
            throw new Exception("名称、地址必须不为空");
        }
        return commonTableDao.add(entity);
    }
    
    @Transactional
    public int add(CommonTableObj entity1,CommonTableObj entityBak){
        int rows=0;
        rows=commonTableDao.add(entity1);
        rows=commonTableDao.add(entityBak);
        return rows;
    }

    public int delete(String id) {
        return commonTableDao.delete(id);
    }
    
    public int update(CommonTableObj entity) {
        return commonTableDao.update(entity);
    }

}

package com.hht.myBatisDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hht.myBatisDemo.commonTable.entities.CommonTableObj;
import com.hht.myBatisDemo.commonTable.service.CommonTableService;


public class MyBatisDemoApplication 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
        CommonTableService commonTableService = ctx.getBean(CommonTableService.class);
        
        //add(commonTableService);
        
        getCommonTables(commonTableService);
        
        
        
        
    }
    
    public static void getCommonTables(CommonTableService commonTableService) {
        List<CommonTableObj> commonTableObjs = commonTableService.getCommonTables();
        for(CommonTableObj commonTableObj : commonTableObjs) {
        	System.out.println(commonTableObj.getId()+" - " + commonTableObj.getAge() + " - " + commonTableObj.getName() + " - " + commonTableObj.getAddress());
        }    	
    }
    
    public static void add(CommonTableService commonTableService) {
    	CommonTableObj CommonTableObj1 = new CommonTableObj("张三", 25, "广东深圳");
    	CommonTableObj CommonTableObj2 = new CommonTableObj("李四", 28, "湖北武汉");
    	try {
			commonTableService.add(CommonTableObj1);
			commonTableService.add(CommonTableObj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}

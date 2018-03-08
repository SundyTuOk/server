package com.sf.server;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;

import com.sf.server.bean.Gather;
import com.sf.server.dao.GatherDAO;
import com.sf.server.service.GatherService;


/**
 * server主程序入口
 *
 */
public class App 
{
	static{
		String customizedPath = "config/log4j.properties";
	    System.setProperty("log4j.configuration", customizedPath);
	}
	private static final Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	initSystem();
        TestBean t = (TestBean) Constant.APP_CONTEXT.getBean("TestBean");
        t.print();
        
        UsersDAO dao = (UsersDAO) Constant.APP_CONTEXT.getBean("UsersDAO");
        Users u = dao.getUser(1);
        System.out.println(u.getUserName());
        
        GatherService gs = (GatherService) Constant.APP_CONTEXT.getBean("gatherService");
//        GatherDAO gs = (GatherDAO) Constant.APP_CONTEXT.getBean("gatherDAO");
        Gather findGather = gs.findGather(2);
        String gatherName = findGather.getGatherName();
        System.out.println(gatherName);
    }
	private static void initSystem() {
		
	}
}

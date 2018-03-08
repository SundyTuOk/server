package com.sf.server.utils;

import java.io.File;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class Configuration {
	/**
	 * 获取一个Configuration配置文件
	 * @return XMLConfiguration连接的一个实例
	 * @throws ConfigurationException
	 */
	public static XMLConfiguration getConfiguration()
			
	{
		String path= System.getProperty("user.dir")
				+"/config/config.xml";
		File file = new File(path);
		if (file == null || !file.exists())
			return null;
		XMLConfiguration config = null;
		try 
		{
			config = new XMLConfiguration(file);
		} catch (ConfigurationException e) 
		{
			
			e.printStackTrace();
		}

		// 设置编码
		config.setEncoding("utf-8");

		return config;
	}
}

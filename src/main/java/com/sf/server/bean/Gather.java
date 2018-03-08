package com.sf.server.bean;
/**
 * 
 * @author tuzhaoliang
 * @date 2018年3月7日
 */
public class Gather {
	private int gatherID;
	private int areaID;
	private int architectureID;
	private int dataSiteID;
	private int gatherState;
	private String gatherNum;
	private String gatherName;
	private String gatherAddress;
	private String gatherPassword;
	// 数据库里面字段为gather_anzhuangaddress,太不规范,我在此处映射为gatherInstallAddress
	private String gatherInstallAddress;
	// 数据库里面字段为gather_changshang,太不规范,我在此处映射为gatherManufacturer
	private String gatherManufacturer;
	// 数据库里面字段为gather_banben,太不规范,我在此处映射为gatherVersion
	private String gatherVersion;
	private String gatherSize;
	private String protocol;
	private int sendWay;
	private String lastTime;
	private String ip;
	private String lastSetTime;
	private String lastSetMSG;
	private int gatherStyle;
	public int getGatherID() {
		return gatherID;
	}
	public void setGatherID(int gatherID) {
		this.gatherID = gatherID;
	}
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	public int getArchitectureID() {
		return architectureID;
	}
	public void setArchitectureID(int architectureID) {
		this.architectureID = architectureID;
	}
	public int getDataSiteID() {
		return dataSiteID;
	}
	public void setDataSiteID(int dataSiteID) {
		this.dataSiteID = dataSiteID;
	}
	public int getGatherState() {
		return gatherState;
	}
	public void setGatherState(int gatherState) {
		this.gatherState = gatherState;
	}
	public String getGatherNum() {
		return gatherNum;
	}
	public void setGatherNum(String gatherNum) {
		this.gatherNum = gatherNum;
	}
	public String getGatherName() {
		return gatherName;
	}
	public void setGatherName(String gatherName) {
		this.gatherName = gatherName;
	}
	public String getGatherAddress() {
		return gatherAddress;
	}
	public void setGatherAddress(String gatherAddress) {
		this.gatherAddress = gatherAddress;
	}
	public String getGatherPassword() {
		return gatherPassword;
	}
	public void setGatherPassword(String gatherPassword) {
		this.gatherPassword = gatherPassword;
	}
	public String getGatherInstallAddress() {
		return gatherInstallAddress;
	}
	public void setGatherInstallAddress(String gatherInstallAddress) {
		this.gatherInstallAddress = gatherInstallAddress;
	}
	public String getGatherManufacturer() {
		return gatherManufacturer;
	}
	public void setGatherManufacturer(String gatherManufacturer) {
		this.gatherManufacturer = gatherManufacturer;
	}
	public String getGatherVersion() {
		return gatherVersion;
	}
	public void setGatherVersion(String gatherVersion) {
		this.gatherVersion = gatherVersion;
	}
	public String getGatherSize() {
		return gatherSize;
	}
	public void setGatherSize(String gatherSize) {
		this.gatherSize = gatherSize;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public int getSendWay() {
		return sendWay;
	}
	public void setSendWay(int sendWay) {
		this.sendWay = sendWay;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLastSetTime() {
		return lastSetTime;
	}
	public void setLastSetTime(String lastSetTime) {
		this.lastSetTime = lastSetTime;
	}
	public String getLastSetMSG() {
		return lastSetMSG;
	}
	public void setLastSetMSG(String lastSetMSG) {
		this.lastSetMSG = lastSetMSG;
	}
	public int getGatherStyle() {
		return gatherStyle;
	}
	public void setGatherStyle(int gatherStyle) {
		this.gatherStyle = gatherStyle;
	}
}

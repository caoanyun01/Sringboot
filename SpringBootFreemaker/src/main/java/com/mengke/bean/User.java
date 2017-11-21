package com.mengke.bean;

/**
 * 用户表映射类
 * User<br/>
 * 创建人:曾翔<br/>
 * 时间：2017年11月2日-下午6:06:19 <br/>
 * @version 1.0.0<br/>
 *
 */
public class User {
	private Integer	id;//编号
	private String	username;//用户名
	private String	email;//邮箱
	private String	phone;//手机
	private String	password;//密码
	private String	cname;//公司名称
	private String	name;//联系人名称
	private String	tel;//座机
	private String	province;//省份
	private String	city;//城市
	private String	address;//详细地址
	private Integer	status;//权限1为最高级，2高级，3为普通
	private String	headerPic;//头像
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getHeaderPic() {
		return headerPic;
	}
	public void setHeaderPic(String headerPic) {
		this.headerPic = headerPic;
	}

	

}
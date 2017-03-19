package com.johnny.mgs.model.sys;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Byte;

/**
 * Created by johnny on 03/19/2017.
 */
public class SysUser implements Serializable {

    private Long id;
    // 归属公司
    private Long companyId;
    // 归属部门
    private Long officeId;
    // 登录名
    private String loginName;
    // 密码
    private String password;
    // 工号
    private String no;
    // 姓名
    private String name;
    // 性别
    private Byte gender;
    // 出生
    private Date birthday;
    // 邮箱
    private String email;
    // 电话
    private String phone;
    // 手机
    private String mobile;
    // 用户类型
    private String userType;
    // 用户头像
    private String avatar;
    // 最后登陆IP
    private String loginIp;
    // 最后登陆时间
    private Date loginDate;
    private Boolean isLocked;
    // 创建者
    private String createBy;
    // 创建时间
    private Date createDate;
    // 更新者
    private String updateBy;
    // 更新时间
    private Date updateDate;
    // 备注信息
    private String remarks;
    // 逻辑删除状态0:存在1:删除
    private Boolean isDeleted;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    public Long getCompanyId(){
        return this.companyId;
    }
    public void setOfficeId(Long officeId){
        this.officeId = officeId;
    }

    public Long getOfficeId(){
        return this.officeId;
    }
    public void setLoginName(String loginName){
        this.loginName = loginName;
    }

    public String getLoginName(){
        return this.loginName;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
    public void setNo(String no){
        this.no = no;
    }

    public String getNo(){
        return this.no;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setGender(Byte gender){
        this.gender = gender;
    }

    public Byte getGender(){
        return this.gender;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public Date getBirthday(){
        return this.birthday;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getMobile(){
        return this.mobile;
    }
    public void setUserType(String userType){
        this.userType = userType;
    }

    public String getUserType(){
        return this.userType;
    }
    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    public String getAvatar(){
        return this.avatar;
    }
    public void setLoginIp(String loginIp){
        this.loginIp = loginIp;
    }

    public String getLoginIp(){
        return this.loginIp;
    }
    public void setLoginDate(Date loginDate){
        this.loginDate = loginDate;
    }

    public Date getLoginDate(){
        return this.loginDate;
    }
    public void setIsLocked(Boolean isLocked){
        this.isLocked = isLocked;
    }

    public Boolean getIsLocked(){
        return this.isLocked;
    }
    public void setCreateBy(String createBy){
        this.createBy = createBy;
    }

    public String getCreateBy(){
        return this.createBy;
    }
    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }

    public Date getCreateDate(){
        return this.createDate;
    }
    public void setUpdateBy(String updateBy){
        this.updateBy = updateBy;
    }

    public String getUpdateBy(){
        return this.updateBy;
    }
    public void setUpdateDate(Date updateDate){
        this.updateDate = updateDate;
    }

    public Date getUpdateDate(){
        return this.updateDate;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }
    public void setIsDeleted(Boolean isDeleted){
        this.isDeleted = isDeleted;
    }

    public Boolean getIsDeleted(){
        return this.isDeleted;
    }
}
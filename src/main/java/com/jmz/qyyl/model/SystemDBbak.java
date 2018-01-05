package com.jmz.qyyl.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


public class SystemDBbak {
    /**
     system_dbbak.bak_id
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private Integer bakId;

    /**
     system_dbbak.db_name
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private String dbName;

    /**
     system_dbbak.db_bak_name
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private String dbBakName;

    /**
     system_dbbak.db_size
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private Integer dbSize;

    /**
     system_dbbak.db_bak_type
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private Integer dbBakType;

    /**
     system_dbbak.db_bak_time
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dbBakTime;

    /**
     system_dbbak.db_bak_user
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private String dbBakUser;

    /**
     system_dbbak.db_bak_note
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private String dbBakNote;

    /**
     system_dbbak.db_bak_path
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    private String dbBakPath;

    /**
     * get
     bak_id
     * @return the value of bak_id
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public Integer getBakId() {
        return bakId;
    }

    /**
     * set bak_id
     *
     * @param bakId the value for bak_id
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setBakId(Integer bakId) {
        this.bakId = bakId;
    }

    /**
     * get
     db_name
     * @return the value of db_name
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set db_name
     *
     * @param dbName the value for db_name
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    /**
     * get
     db_bak_name
     * @return the value of db_bak_name
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public String getDbBakName() {
        return dbBakName;
    }

    /**
     * set db_bak_name
     *
     * @param dbBakName the value for db_bak_name
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbBakName(String dbBakName) {
        this.dbBakName = dbBakName == null ? null : dbBakName.trim();
    }

    /**
     * get
     db_size
     * @return the value of db_size
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public Integer getDbSize() {
        return dbSize;
    }

    /**
     * set db_size
     *
     * @param dbSize the value for db_size
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbSize(Integer dbSize) {
        this.dbSize = dbSize;
    }

    /**
     * get
     db_bak_type
     * @return the value of db_bak_type
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public Integer getDbBakType() {
        return dbBakType;
    }

    /**
     * set db_bak_type
     *
     * @param dbBakType the value for db_bak_type
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbBakType(Integer dbBakType) {
        this.dbBakType = dbBakType;
    }

    /**
     * get
     db_bak_time
     * @return the value of db_bak_time
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public Date getDbBakTime() {
        return dbBakTime;
    }

    /**
     * set db_bak_time
     *
     * @param dbBakTime the value for db_bak_time
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbBakTime(Date dbBakTime) {
        this.dbBakTime = dbBakTime;
    }

    /**
     * get
     db_bak_user
     * @return the value of db_bak_user
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public String getDbBakUser() {
        return dbBakUser;
    }

    /**
     * set db_bak_user
     *
     * @param dbBakUser the value for db_bak_user
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbBakUser(String dbBakUser) {
        this.dbBakUser = dbBakUser == null ? null : dbBakUser.trim();
    }

    /**
     * get
     db_bak_note
     * @return the value of db_bak_note
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public String getDbBakNote() {
        return dbBakNote;
    }

    /**
     * set db_bak_note
     *
     * @param dbBakNote the value for db_bak_note
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbBakNote(String dbBakNote) {
        this.dbBakNote = dbBakNote == null ? null : dbBakNote.trim();
    }

    /**
     * get
     db_bak_path
     * @return the value of db_bak_path
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public String getDbBakPath() {
        return dbBakPath;
    }

    /**
     * set db_bak_path
     *
     * @param dbBakPath the value for db_bak_path
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    public void setDbBakPath(String dbBakPath) {
        this.dbBakPath = dbBakPath == null ? null : dbBakPath.trim();
    }

    /**
     * generated by VrviewCommentGenerator.
     * @return java.lang.String
     *
     * @mbggenerated Tue Nov 28 13:38:48 CST 2017
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
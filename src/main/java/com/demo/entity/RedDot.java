package com.demo.entity;

/**
 * @author hejq
 * @date 2018-09-30 10:36
 */
public class RedDot {

    /**
     * id
     */
    private Long id;

    /**
     * tableName
     */
    private String tableName;

    /**
     * status
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RedDot{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                ", status=" + status +
                '}';
    }
}

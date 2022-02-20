package com.k1051.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * dvd 表存储商店的 dvd 信息
 * @TableName dvd
 */
@Data
public class Dvd implements Serializable {
    /**
     * dvd id;自动增长
     */
    private Integer id;

    /**
     * dvd 名称
     */
    private String name;

    /**
     * dvd 状态；0 表示未借出；1表示已借出
     */
    private Integer state;

    /**
     * 借出日期；null 表示未借出
     */
    private Date lenddate;

    /**
     * 借出次数
     */
    private Integer count;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dvd other = (Dvd) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLenddate() == null ? other.getLenddate() == null : this.getLenddate().equals(other.getLenddate()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLenddate() == null) ? 0 : getLenddate().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", state=").append(state);
        sb.append(", lenddate=").append(lenddate);
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
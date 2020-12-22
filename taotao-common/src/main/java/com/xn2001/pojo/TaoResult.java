package com.xn2001.pojo;

import java.util.List;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 14:31
 * @Version 1.0
 */

public class TaoResult<T> {
    private long total;
    private List<T> rows;

    @Override
    public String toString() {
        return "TaoResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public TaoResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

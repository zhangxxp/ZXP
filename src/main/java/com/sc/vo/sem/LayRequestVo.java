package com.sc.vo.sem;

import java.util.Map;

public class LayRequestVo {
    /**
     * 封装请求数据
     */
    private int page=1;
    private int limit=10;

    /**
     * 分装前台的查询条件
     * @return
     */
    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    Map<String,Object> params;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

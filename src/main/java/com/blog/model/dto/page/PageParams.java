package com.blog.model.dto.page;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/19
 */
public class PageParams {
    private int TotalCount = 0;
    private int PageNum = 1;
    private int StartIndex = 0;
    private int PageSize = 10;

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int totalCount) {
        TotalCount = totalCount;
    }

    public int getPageNum() {
        return PageNum;
    }

    public void setPageNum(int pageNum) {
        PageNum = pageNum;
    }

    public int getStartIndex() {
        return StartIndex;
    }

    public void setStartIndex(int startIndex) {
        StartIndex = startIndex;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }
}

package com.lordor.springboot1.Util;

public class PageBean {
    private int currPage; //当前页数
    private int pageSize; //每页显示记录数
    private int totalCount; //总记录数
    private int totalPage; //总页数

    /**
     * 构造函数
     * 四个参数中这三个需要手动注入，总页数是计算出来的
     * 只提供 getter 方法， 不提供 setter 方法 构造函数行使了 setter 方法的功能
     * @param currPagePara
     * @param pageSizePara
     * @param totalCountPara
     */
    public PageBean(int currPagePara, int pageSizePara, int totalCountPara)
    {
        currPage = currPagePara;
        pageSize = pageSizePara;
        totalCount = totalCountPara;

        if (totalCount % pageSize == 0)
        {
            totalPage = totalCount / pageSize;
        }
        else
        {
            totalPage = totalCount / pageSize + 1;
        }

        if (currPage <= 0)
        {
            currPage = 1;
        }
        if (currPage >= totalPage + 1)
        {
            currPage = totalPage;
        }
    }

    public int getCurrPage()
    {
        return currPage;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public int getTotalPage()
    {
        return totalPage;
    }
}

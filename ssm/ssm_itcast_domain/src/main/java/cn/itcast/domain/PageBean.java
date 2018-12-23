package cn.itcast.domain;

public class PageBean {

    private Integer pageNum;
    private Integer count;
    private Integer startNum;
    private Integer pageCount;
    private Integer counts;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Integer getPageCount() {
        pageCount=(int)Math.ceil(counts*1.0/count);
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "pageNum=" + pageNum +
                ", count=" + count +
                '}';
    }
}

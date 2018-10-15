package cn.mnquan.model;

public class TbMnCatItemDo {
    private String catId;

    private String catName;

    private String categoryId;

    private String categoryName;

    private String categoryPictureUrl;

    private String skipUrl;

    private Short sort;

    private String state;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPictureUrl() {
        return categoryPictureUrl;
    }

    public void setCategoryPictureUrl(String categoryPictureUrl) {
        this.categoryPictureUrl = categoryPictureUrl;
    }

    public String getSkipUrl() {
        return skipUrl;
    }

    public void setSkipUrl(String skipUrl) {
        this.skipUrl = skipUrl;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
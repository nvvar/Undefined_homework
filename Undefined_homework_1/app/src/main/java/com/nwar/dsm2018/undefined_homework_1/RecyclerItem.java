package com.nwar.dsm2018.undefined_homework_1;

public class RecyclerItem {
    int image;
    String mainTitle;
    String subTitle;
    RecyclerItem(int image, String mainTitle, String subTitle)
    {
        this.image = image;
        this.mainTitle=mainTitle;
        this.subTitle=subTitle;
    }
    public int getImage()
    {
        return image;
    }
    public void setImage(int image)
    {
        this.image = image;
    }
    public String getMainTitle()
    {
        return mainTitle;
    }
    public void setMainTitle(String mainTitle)
    {
        this.mainTitle = mainTitle;
    }
    public String getSubTitle()
    {
        return subTitle;
    }
    public void setSubTitle(String subTitle)
    {
        this.subTitle = subTitle;
    }
}

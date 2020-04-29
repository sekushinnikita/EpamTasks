package Delivery.Entities.Volume;

import Delivery.Entities.Production;
import Delivery.Ui.Reading.Reader;

public class Volume extends Production {
    private Integer height;
    private Integer width;
    private Integer length;

    public Volume(){}

    public Integer getHeight() { return height; }

    public void setHeight(Integer height) { this.height = height; }

    public Integer getLength() { return length; }

    public void setLength(Integer length) { this.length = length; }

    public Integer getWidth() { return width; }

    public void setWidth(Integer width) { this.width = width; }


}

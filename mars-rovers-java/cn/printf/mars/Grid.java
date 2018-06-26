public class Gird {
    public static final String SEPARATOR = ",";
    Integer maxXValue = 0;
    Integer maxYValue = 0;

    public Gird(Integer maxXValue, Integer maxYValue) {
        this.maxXValue = maxXValue;
        this.maxYValue = maxYValue;
    }

    public Integer getMaxXValue() {
        return maxXValue;
    }

    public void setMaxXValue(Integer maxXValue) {
        this.maxXValue = maxXValue;
    }

    public Integer getMaxYValue() {
        return maxYValue;
    }

    public void setMaxYValue(Integer maxYValue) {
        this.maxYValue = maxYValue;
    }
}

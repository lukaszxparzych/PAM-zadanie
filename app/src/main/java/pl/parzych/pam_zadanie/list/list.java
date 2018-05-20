package pl.parzych.pam_zadanie.list;

public class list {

    private String leftText;
    private String rightText;

    public list(String leftText, String rightText) {
        this.leftText = leftText;
        this.rightText = rightText;
    }

    public String getLeftText() {
        return leftText;
    }

    public String getRightText() {
        return rightText;
    }

    public void setLeftText(String leftText) {
        this.leftText = leftText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    @Override
    public String toString() {
        return "list{" +
                "leftText='" + leftText + '\'' +
                ", rightText='" + rightText + '\'' +
                '}';
    }
}

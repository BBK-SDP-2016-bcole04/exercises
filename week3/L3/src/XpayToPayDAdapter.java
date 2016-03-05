public class XpayToPayDAdapter implements PayD{


    private final Xpay xpay;
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer CVVNo;
    private Double totalAmount;

    //Constructor defines the Xpay object to be adapted and then runs setProp to redefine the properties of the object to
    // the payD format these can then be returned in a PayD format

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
        setProp();
    }
    private void setProp() {
        setCardOwnerName(this.getXpay().getCustomerName());
        setCustCardNo(this.getXpay().getCreditCardNo());
        setCardExpMonthDate(this.getXpay().getCardExpMonth()
                + "/" + this.getXpay().getCardExpYear());
        setCVVNo(this.getXpay().getCardCVVNo().intValue());
        setTotalAmount(this.getXpay().getAmount());
    }
    private Xpay getXpay() {
        return xpay;
    }

    //implementations of all the methods from PayD

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }
    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }
    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }
    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }
    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }
    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }
    @Override
    public Integer getCVVNo() {
        return CVVNo;
    }
    @Override
    public void setCVVNo(Integer CVVNo) {
        this.CVVNo=CVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }
    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}



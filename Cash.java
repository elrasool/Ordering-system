class Cash extends Payment {

    private float cashTendered;

    public Cash(float cashTendered) {
        this.cashTendered = cashTendered;
    }

    public float getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(float cashTendered) {
        this.cashTendered = cashTendered;
    }



}

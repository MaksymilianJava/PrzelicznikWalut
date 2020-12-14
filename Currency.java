/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przelicznikWalut;

/**
 *
 * @author lenovo
 */
class Currency
{
    private String currencyName;
    private int currencyCodeValue;
    private double currencyBuyRate;
    private double currencySellRate;
    public Currency(String currencyName, int currencyCodeValue, double currencyBuyRate, double currencySellRate)
    {
        this.currencyName = currencyName;
        this.currencyCodeValue = currencyCodeValue;
        this.currencyBuyRate = currencyBuyRate;
        this.currencySellRate = currencySellRate;
    }
    public void setCurrencyName(String currencyName)
    {
        this.currencyName = currencyName;
    }
    public String getCurrencyName()
    {
        return currencyName;
    }
    public void setCurrencyCodeValue(int currencyCodeValue)
    {
        this.currencyCodeValue = currencyCodeValue;
    }
    public int getCurrencyCodeValue()
    {
        return currencyCodeValue;
    }
    public void setCurrencyBuyRate(double currencyBuyRate)
    {
        this.currencyBuyRate = currencyBuyRate;
    }
    public double getCurrencyBuyRate()
    {
        return currencyBuyRate;
    }
    public void setCurrencySellRate(double currencySellRate)
    {
        this.currencySellRate = currencySellRate;
    }
    public double getCurrencySellRate()
    {
        return currencySellRate;
    }
}

package co.omise.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents Omise Refund object.
 *
 * @see <a href="https://www.omise.co/refunds-api">Refunds API</a>
 */
public class Refund extends Model {
    private long amount;
    private String currency;
    private String charge;
    private String transaction;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public static class Create extends Params {
        @JsonProperty
        private long amount;

        public Create amount(long amount) {
            this.amount = amount;
            return this;
        }
    }
}

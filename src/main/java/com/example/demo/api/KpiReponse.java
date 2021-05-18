package com.example.demo.api;

public class KpiReponse {
    private Double clientAgeMid;
    private Double clientStd;

    public KpiReponse() {
    }

    public KpiReponse(Double clientAgeMid, Double clientStd) {
        this.clientAgeMid = clientAgeMid;
        this.clientStd = clientStd;
    }

    public Double getClientAgeMid() {
        return clientAgeMid;
    }

    public void setClientAgeMid(Double clientAgeMid) {
        this.clientAgeMid = clientAgeMid;
    }

    public Double getClientStd() {
        return clientStd;
    }

    public void setClientStd(Double clientStd) {
        this.clientStd = clientStd;
    }
}

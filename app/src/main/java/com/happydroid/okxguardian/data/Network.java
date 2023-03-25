package com.happydroid.okxguardian.data;

public enum Network {
    NONE_SELECTED(null, "Select Network", -1),
    MAINNET("", "Main", 66),
    OKX_TESTNET("https://exchaintestrpc.okex.org", "OKX Testnet", 65);

    private final String baseUrl;
    private final String networkName;
    private final int chainId;

    Network(String baseUrl, String networkName, int chainId) {
        this.baseUrl = baseUrl;
        this.networkName = networkName;
        this.chainId = chainId;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getNetworkName() {
        return networkName;
    }

    public int getChainId() {
        return chainId;
    }
}

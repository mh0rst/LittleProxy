package org.littleshoot.proxy;

/**
 * <p>
 * Encapsulates information needed to connect to a chained SOCKS proxy.
 * </p>
 */
public interface ChainedSocksProxy extends ChainedProxy {

    /**
     * Implement this method to indicate whether this chained proxy is a SOCKS
     * proxy or not.
     *
     * @return True if this proxy is a SOCKS proxy, false otherwise.
     */
    boolean isSocksProxy();

    /**
     * Implement this method to indicate whether this chained proxy is a SOCKS-5
     * proxy or not. Note that only unauthenticated SOCKS-5 proxies are
     * supported.
     *
     * @return True if this proxy is a SOCKS-5 proxy, false if it is SOCKS-4.
     */
    boolean isSocks5Proxy();

    /**
     * Implement this method to indicate whether this chained proxy must be used
     * to resolve host names.
     *
     * @return True if this proxy must be used to resolve host names, false
     *         otherwise.
     */
    boolean useSocks5Resolver();
}

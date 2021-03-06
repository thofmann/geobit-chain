/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 geobit.io 
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package io.geobit.chain.entity.blockchain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BlockChainAddress {
	private String hash160;
	private String address;
	private Integer n_tx;
	private Long total_received;
	private Long total_sent;
	private Long final_balance;
	private List<BlockChainTransaction> txs;
	
	
	
	public BlockChainAddress() {
		super();
	}
	public String getHash160() {
		return hash160;
	}
	public void setHash160(String hash160) {
		this.hash160 = hash160;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getN_tx() {
		return n_tx;
	}
	public void setN_tx(Integer n_tx) {
		this.n_tx = n_tx;
	}
	public Long getTotal_received() {
		return total_received;
	}
	public void setTotal_received(Long total_received) {
		this.total_received = total_received;
	}
	public Long getTotal_sent() {
		return total_sent;
	}
	public void setTotal_sent(Long total_sent) {
		this.total_sent = total_sent;
	}
	public Long getFinal_balance() {
		return final_balance;
	}
	public void setFinal_balance(Long final_balance) {
		this.final_balance = final_balance;
	}
	public List<BlockChainTransaction> getTxs() {
		return txs;
	}
	public void setTxs(List<BlockChainTransaction> txs) {
		this.txs = txs;
	}
	@Override
	public String toString() {
		return "BlockChainAddress [hash160=" + hash160 + ", address=" + address
				+ ", n_tx=" + n_tx + ", total_received=" + total_received
				+ ", total_sent=" + total_sent + ", final_balance="
				+ final_balance + ", txs=" + txs + "]";
	}
	
	

}

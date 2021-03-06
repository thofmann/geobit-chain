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

package io.geobit.clients.http;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import io.geobit.chain.clients.MyChainHTTPClient;
import io.geobit.common.providers.ReceivedProvider;
import org.junit.Test;

public class MyChainHTTPClientTest {
	String address = "1DiWBDy3eejMtUUPAvVLqWmPVsecbqbrSU";
	
	@Test 
	public void blockchainTest() {
		
		ReceivedProvider receivedProv = new MyChainHTTPClient();
		
		Long result=receivedProv.getReceived(address);
		assertNotNull(result);
		assertTrue(result>0);
		
		result=receivedProv.getReceived("1G1qk5jKudDjkJ21JafGXq3VghESxHJKCp");
		assertNotNull(result);
		assertTrue(result>=0);
		
	}
	

}

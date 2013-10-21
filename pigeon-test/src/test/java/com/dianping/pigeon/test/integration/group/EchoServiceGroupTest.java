package com.dianping.pigeon.test.integration.group;

import org.junit.Assert;
import org.junit.Test;

import com.dianping.pigeon.test.PigeonAutoTest;
import com.dianping.pigeon.test.SingleServerBaseTest;
import com.dianping.pigeon.test.service.EchoService;

public class EchoServiceGroupTest extends SingleServerBaseTest {

    @PigeonAutoTest(serviceName = "http://service.dianping.com/testService/echoService_1.0.0", group="Mobile")
    public EchoService echoService;

    @Test
    public void test() {
        String echo = echoService.echo("dianping");
        Assert.assertEquals("Echo: dianping", echo);
    }

}
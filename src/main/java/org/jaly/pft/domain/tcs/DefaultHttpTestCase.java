package org.jaly.pft.domain.tcs;

import org.jaly.pft.domain.entities.TestCase;

/**
 * 框架提供一个默认的HTTP的测试用例对象。
 * 一般的，可以直接使用。
 * 如果满足不了需求，可以自定义TestCase
 *
 * @author Jaly
 */
public class DefaultHttpTestCase extends TestCase {

    public DefaultHttpTestCase() {}

    public DefaultHttpTestCase(String testCaseName) {
        this.setTestCaseName(testCaseName);
    }

    @Override
    public void buidingParameters() {

    }
}
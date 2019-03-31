package lite.summer.test;

import lite.summer.test.v1.V1AllTests;
import lite.summer.test.v2.V2AllTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author: ReZero
 * @Date: 3/31/19 10:37 PM
 * @Version 1.0
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        V1AllTests.class,
        V2AllTests.class
})
public class AllTests {
}
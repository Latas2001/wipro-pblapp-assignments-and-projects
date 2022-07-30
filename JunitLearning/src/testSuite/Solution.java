package testSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.wipro.test.TestCheckPresence;
import com.wipro.test.TestSort;
import com.wipro.test.TestStringConcat;

@RunWith(Suite.class)
@SuiteClasses({TestCheckPresence.class,TestSort.class,TestStringConcat.class})

public class Solution {

}
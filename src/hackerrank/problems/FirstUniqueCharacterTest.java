package hackerrank.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterTest {

    @Test
    public void testFirstUniue() {

        FirstUniqueCharacter fu = new FirstUniqueCharacter();
        Assert.assertEquals('b',fu.getFirstUniqueChar("abcdeac"));

    }


}